package com.example.tracker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tracker.R;

public class AdminLoginActivity extends AppCompatActivity {

    private EditText adminUsername, adminPassword;
    private Button adminLoginBtn;

    // Admin credentials
    private static final String ADMIN_USERNAME = "Nickson";
    private static final String ADMIN_PASSWORD = "8591017039";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        // Initialize UI components
        adminUsername = findViewById(R.id.admin_username);
        adminPassword = findViewById(R.id.admin_password);
        adminLoginBtn = findViewById(R.id.admin_login_btn);

        // Set login button click listener
        adminLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAdminLogin();
            }
        });
    }

    private void validateAdminLogin() {
        String enteredUsername = adminUsername.getText().toString().trim();
        String enteredPassword = adminPassword.getText().toString().trim();

        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
            return;
        }

        if (enteredUsername.equals(ADMIN_USERNAME) && enteredPassword.equals(ADMIN_PASSWORD)) {
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(AdminLoginActivity.this, DashboardAdminActivity.class));
            finish(); // Close this activity
        } else {
            Toast.makeText(this, "Invalid Admin Credentials", Toast.LENGTH_SHORT).show();
        }
    }
}
