package com.example.tracker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.R;
import com.example.tracker.admin.DashboardAdminActivity;
import com.example.tracker.student.DashboardStudentActivity;
import com.example.tracker.teacher.DashboardTeacherActivity;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    private FirebaseFirestore db; // Firestore instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        db = FirebaseFirestore.getInstance(); // Initialize Firebase Firestore

        btnLogin.setOnClickListener(v -> validateLogin());
    }

    private void validateLogin() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Enter all credentials", Toast.LENGTH_SHORT).show();
            return;
        }

        // Check if Admin login
        if (username.equals("Nickson") && password.equals("8591017039")) {
            Toast.makeText(this, "Admin Login Successful", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(LoginActivity.this, DashboardAdminActivity.class));
            finish();
            return;
        }

        // Check if Student or Teacher
        checkFirestoreForUser(username, password);
    }

    private void checkFirestoreForUser(String username, String password) {
        // Check students collection
        db.collection("students").whereEqualTo("username", username)
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    for (DocumentSnapshot document : queryDocumentSnapshots) {
                        String storedPassword = document.getString("password");
                        if (storedPassword != null && storedPassword.equals(password)) {
                            Toast.makeText(this, "Student Login Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this, DashboardStudentActivity.class));
                            finish();
                            return;
                        }
                    }
                    checkTeacherCollection(username, password); // If not found, check teachers
                })
                .addOnFailureListener(e -> Toast.makeText(this, "Error fetching data", Toast.LENGTH_SHORT).show());
    }

    private void checkTeacherCollection(String username, String password) {
        db.collection("teachers").whereEqualTo("username", username)
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    for (DocumentSnapshot document : queryDocumentSnapshots) {
                        String storedPassword = document.getString("password");
                        if (storedPassword != null && storedPassword.equals(password)) {
                            Toast.makeText(this, "Teacher Login Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this, DashboardTeacherActivity.class));
                            finish();
                            return;
                        }
                    }
                    Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> Toast.makeText(this, "Error fetching data", Toast.LENGTH_SHORT).show());
    }
}
