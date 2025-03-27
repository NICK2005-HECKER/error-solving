package com.example.tracker.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tracker.R;
import com.example.tracker.adapters.TimetableAdapter;
import com.example.tracker.models.Timetable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ManageTimetableActivity extends AppCompatActivity {

    private EditText timeSlotInput, subjectInput;
    private Button addTimetableBtn;
    private RecyclerView timetableRecyclerView;

    private FirebaseFirestore db;
    private TimetableAdapter timetableAdapter;
    private List<Timetable> timetableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_timetable);

        // Initialize Firestore
        db = FirebaseFirestore.getInstance();

        // Initialize UI Elements
        timeSlotInput = findViewById(R.id.timeSlotInput);
        subjectInput = findViewById(R.id.subjectInput);
        addTimetableBtn = findViewById(R.id.addTimetableBtn);
        timetableRecyclerView = findViewById(R.id.timetableRecyclerView);

        timetableRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        timetableList = new ArrayList<>();
        timetableAdapter = new TimetableAdapter(this, timetableList);
        timetableRecyclerView.setAdapter(timetableAdapter);

        // Load existing timetable data
        loadTimetable();

        // Add timetable entry
        addTimetableBtn.setOnClickListener(v -> addTimetable());
    }

    private void addTimetable() {
        String timeSlot = timeSlotInput.getText().toString().trim();
        String subject = subjectInput.getText().toString().trim();
        String teacherId = "T123"; // Replace with actual teacher ID from login

        if (TextUtils.isEmpty(timeSlot) || TextUtils.isEmpty(subject)) {
            Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        CollectionReference timetableRef = db.collection("timetable");

        // Create a new entry
        Timetable timetable = new Timetable(null, timeSlot, subject, teacherId);

        // Add to Firestore
        timetableRef.add(timetable).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                Toast.makeText(this, "Timetable Added!", Toast.LENGTH_SHORT).show();
                timeSlotInput.setText("");
                subjectInput.setText("");
                loadTimetable(); // Refresh the list
            } else {
                Toast.makeText(this, "Failed to add timetable", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadTimetable() {
        db.collection("timetable").addSnapshotListener((value, error) -> {
            if (error != null) {
                Toast.makeText(this, "Error loading timetable", Toast.LENGTH_SHORT).show();
                return;
            }

            timetableList.clear();
            for (QueryDocumentSnapshot doc : value) {
                Timetable timetable = doc.toObject(Timetable.class);
                timetable.setId(doc.getId());
                timetableList.add(timetable);
            }
            timetableAdapter.notifyDataSetChanged();
        });
    }
}
