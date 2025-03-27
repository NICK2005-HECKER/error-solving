package com.example.tracker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tracker.R;

public class DashboardTeacherActivity extends AppCompatActivity {

    Button btnProfile, btnTimetable, btnAttendance, btnMarks, btnReports, btnLeave, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_teacher);

        btnProfile = findViewById(R.id.btnProfile);
        btnTimetable = findViewById(R.id.btnTimetable);
        btnAttendance = findViewById(R.id.btnAttendance);
        btnMarks = findViewById(R.id.btnMarks);
        btnReports = findViewById(R.id.btnReports);
        btnLeave = findViewById(R.id.btnLeave);
        btnLogout = findViewById(R.id.btnLogout);

        btnProfile.setOnClickListener(v -> startActivity(new Intent(this, TeacherProfileActivity.class)));

        btnTimetable.setOnClickListener(v -> startActivity(new Intent(this, ManageTimetableActivity.class)));

        btnAttendance.setOnClickListener(v -> startActivity(new Intent(this, MarkAttendanceActivity.class)));

        btnMarks.setOnClickListener(v -> startActivity(new Intent(this, UploadMarksActivity.class)));

        btnReports.setOnClickListener(v -> startActivity(new Intent(this, ClassPerformanceActivity.class)));

        btnLeave.setOnClickListener(v -> startActivity(new Intent(this, LeaveManagementActivity.class)));

        btnLogout.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}
