package com.example.tracker.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.R;
import com.example.tracker.adapters.MarksAdapter;
import com.example.tracker.models.Marksheet;
import com.example.tracker.utils.PDFGenerator;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

    public class ViewMarksActivity extends AppCompatActivity {

    private ListView listViewMarks;
    private Button btnDownloadPDF;
    private FirebaseFirestore db;
    private List<Marksheet> marksList;
    private MarksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_marks);

        listViewMarks = findViewById(R.id.listViewMarks);
        btnDownloadPDF = findViewById(R.id.btnDownloadPDF);
        db = FirebaseFirestore.getInstance();
        marksList = new ArrayList<>();
        adapter = new MarksAdapter(this, marksList);
        listViewMarks.setAdapter(adapter);

        fetchMarksData();

        btnDownloadPDF.setOnClickListener(v -> downloadMarksPDF());
    }

    private void fetchMarksData() {
        db.collection("marksheets").get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                marksList.clear();
                for (QueryDocumentSnapshot document : task.getResult()) {
                    Marksheet marks = document.toObject(Marksheet.class);
                    marksList.add(marks);
                }
                adapter.notifyDataSetChanged();
            } else {
                Toast.makeText(this, "Failed to load marks", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void downloadMarksPDF() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Subject", "Marks"});

        for (Marksheet mark : marksList) {
            data.add(new String[]{mark.getSubject(), String.valueOf(mark.getMarks())});
        }

        PDFGenerator.generatePDF(this, "Marksheet_Report.pdf", "Marksheet Report", data);
    }
}
