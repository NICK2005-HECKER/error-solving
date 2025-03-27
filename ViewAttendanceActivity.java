package com.example.tracker.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.R;
import com.example.tracker.adapters.AttendanceAdapter;
import com.example.tracker.models.Attendance;
import com.example.tracker.utils.PDFGenerator;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class ViewAttendanceActivity extends AppCompatActivity {

    private ListView listViewAttendance;
    private Button btnDownloadPDF;
    private FirebaseFirestore db;
    private List<Attendance> attendanceList;
    private AttendanceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attendance);

        listViewAttendance = findViewById(R.id.listViewAttendance);
        btnDownloadPDF = findViewById(R.id.btnDownloadPDF);
        db = FirebaseFirestore.getInstance();
        attendanceList = new ArrayList<>();
        adapter = new AttendanceAdapter(this, attendanceList);
        listViewAttendance.setAdapter(adapter);

        fetchAttendanceData();

        btnDownloadPDF.setOnClickListener(v -> downloadAttendancePDF());
    }

    private void fetchAttendanceData() {
        db.collection("attendance").get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                attendanceList.clear();
                for (QueryDocumentSnapshot document : task.getResult()) {
                    Attendance attendance = document.toObject(Attendance.class);
                    attendanceList.add(attendance);
                }
                adapter.notifyDataSetChanged();
            } else {
                Toast.makeText(this, "Failed to load attendance", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void downloadAttendancePDF() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Date", "Status"});

        for (Attendance att : attendanceList) {
            data.add(new String[]{att.getDate(), att.getStatus()});
        }

        PDFGenerator.generatePDF(this, "Attendance_Report.pdf", "Attendance Report", data);
    }
}
