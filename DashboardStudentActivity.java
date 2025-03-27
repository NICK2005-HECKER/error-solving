package com.example.tracker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tracker.R;

public class DashboardStudentActivity extends AppCompatActivity {

    Button btnProfile, btnAttendance, btnSubjects, btnTimetable, btnMarks, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_student);

        btnProfile = findViewById(R.id.btnProfile);
        btnAttendance = findViewById(R.id.btnAttendance);
        btnSubjects = findViewById(R.id.btnSubjects);
        btnTimetable = findViewById(R.id.btnTimetable);
        btnMarks = findViewById(R.id.btnMarks);
        btnLogout = findViewById(R.id.btnLogout);

        btnProfile.setOnClickListener(v -> startActivity(new Intent(this, StudentProfileActivity.class)));

        btnAttendance.setOnClickListener(v -> startActivity(new Intent(this, ViewAttendanceActivity.class)));

        btnSubjects.setOnClickListener(v -> startActivity(new Intent(this, ViewSubjectsActivity.class)));

        btnTimetable.setOnClickListener(v -> startActivity(new Intent(this, ViewTimetableActivity.class)));

        btnMarks.setOnClickListener(v -> startActivity(new Intent(this, ViewMarksActivity.class)));

        btnLogout.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}
