package com.example.tracker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracker.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class StudentLoginActivity extends AppCompatActivity {

    private EditText usernameInput, passwordInput;
    private Button loginButton;
    private FirebaseFirestore db;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        usernameInput = findViewById(R.id.student_username);
        passwordInput = findViewById(R.id.student_password);
        loginButton = findViewById(R.id.student_login_btn);
        db = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        loginButton.setOnClickListener(v -> {
            String username = usernameInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(StudentLoginActivity.this, "Enter all fields!", Toast.LENGTH_SHORT).show();
                return;
            }

            db.collection("students").document(username).get().addOnSuccessListener(documentSnapshot -> {
                if (documentSnapshot.exists() && documentSnapshot.getString("password").equals(password)) {
                    startActivity(new Intent(StudentLoginActivity.this, DashboardStudentActivity.class));
                    finish();
                } else {
                    Toast.makeText(StudentLoginActivity.this, "Invalid credentials!", Toast.LENGTH_SHORT).show();
                }
            }).addOnFailureListener(e -> Toast.makeText(StudentLoginActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show());
        });
    }
}
