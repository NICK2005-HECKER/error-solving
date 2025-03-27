package com.example.tracker.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.R;
import com.example.tracker.adapters.StudentAttendanceAdapter;
import com.example.tracker.models.Attendance;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MarkAttendanceActivity extends AppCompatActivity {

    private ListView studentListView;
    private Button btnSubmitAttendance;
    private List<Attendance> attendanceList;
    private StudentAttendanceAdapter adapter;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark_attendance);

        studentListView = findViewById(R.id.studentListView);
        btnSubmitAttendance = findViewById(R.id.btnSubmitAttendance);
        db = FirebaseFirestore.getInstance();

        // Dummy student data (Fetch from Firestore in real implementation)
        attendanceList = new ArrayList<>();
        attendanceList.add(new Attendance("101", "John Doe", "Math", false, new Date()));
        attendanceList.add(new Attendance("102", "Jane Smith", "Math", false, new Date()));

        adapter = new StudentAttendanceAdapter(this, attendanceList);
        studentListView.setAdapter(adapter);

        btnSubmitAttendance.setOnClickListener(v -> submitAttendance());
    }

    private void submitAttendance() {
        for (Attendance attendance : attendanceList) {
            HashMap<String, Object> attendanceData = new HashMap<>();
            attendanceData.put("studentId", attendance.getStudentId());
            attendanceData.put("studentName", attendance.getStudentName());
            attendanceData.put("subject", attendance.getSubject());
            attendanceData.put("isPresent", attendance.isPresent());
            attendanceData.put("date", attendance.getDate());

            db.collection("attendance")
                    .add(attendanceData)
                    .addOnSuccessListener(documentReference -> Toast.makeText(this, "Attendance Saved", Toast.LENGTH_SHORT).show())
                    .addOnFailureListener(e -> Toast.makeText(this, "Error saving attendance", Toast.LENGTH_SHORT).show());
        }
    }
}
