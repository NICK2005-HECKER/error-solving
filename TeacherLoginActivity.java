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
import com.google.firebase.firestore.FirebaseFirestore;

public class TeacherLoginActivity extends AppCompatActivity {

    private EditText usernameInput, passwordInput;
    private Button loginButton;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);

        usernameInput = findViewById(R.id.teacher_username);
        passwordInput = findViewById(R.id.teacher_password);
        loginButton = findViewById(R.id.teacher_login_btn);
        db = FirebaseFirestore.getInstance();

        loginButton.setOnClickListener(v -> {
            String username = usernameInput.getText().toString().trim();
            String password = passwordInput.getText().toString().trim();

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(TeacherLoginActivity.this, "Enter all fields!", Toast.LENGTH_SHORT).show();
                return;
            }

            db.collection("teachers").document(username).get().addOnSuccessListener(documentSnapshot -> {
                if (documentSnapshot.exists() && documentSnapshot.getString("password").equals(password)) {
                    startActivity(new Intent(TeacherLoginActivity.this, DashboardTeacherActivity.class));
                    finish();
                } else {
                    Toast.makeText(TeacherLoginActivity.this, "Invalid credentials!", Toast.LENGTH_SHORT).show();
                }
            }).addOnFailureListener(e -> Toast.makeText(TeacherLoginActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show());
        });
    }
}
