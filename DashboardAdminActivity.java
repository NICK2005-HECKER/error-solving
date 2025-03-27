package com.example.tracker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tracker.R;

public class DashboardAdminActivity extends AppCompatActivity {

    Button btnManageUsers, btnViewReports, btnSendNotices, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);

        btnManageUsers = findViewById(R.id.btnManageUsers);
        btnViewReports = findViewById(R.id.btnViewReports);
        btnSendNotices = findViewById(R.id.btnSendNotices);
        btnLogout = findViewById(R.id.btnLogout);

        btnManageUsers.setOnClickListener(v -> startActivity(new Intent(this, ManageUsersActivity.class)));

        btnViewReports.setOnClickListener(v -> startActivity(new Intent(this, ClassReportActivity.class)));

        btnSendNotices.setOnClickListener(v -> startActivity(new Intent(this, SendNoticeActivity.class)));

        btnLogout.setOnClickListener(v -> {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}
