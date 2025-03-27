package com.example.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnStudentLogin, btnTeacherLogin;
    private TextView txtAdminLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        btnStudentLogin = findViewById(R.id.btnStudentLogin);
        btnTeacherLogin = findViewById(R.id.btnTeacherLogin);
        txtAdminLogin = findViewById(R.id.txtAdminLogin);

        // Student Login Click
        btnStudentLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            intent.putExtra("role", "student");
            startActivity(intent);
        });

        // Teacher Login Click
        btnTeacherLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            intent.putExtra("role", "teacher");
            startActivity(intent);
        });

        // Admin Login Click
        txtAdminLogin.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AdminLoginActivity.class);
            startActivity(intent);
        });
    }
}
