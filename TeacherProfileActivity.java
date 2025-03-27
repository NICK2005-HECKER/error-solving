package com.example.tracker;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TeacherProfileActivity extends AppCompatActivity {
    private TextView txtName, txtID, txtContact, txtDepartment;
    private FirebaseAuth auth;
    private DatabaseReference teacherRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);

        txtName = findViewById(R.id.txtName);
        txtID = findViewById(R.id.txtID);
        txtContact = findViewById(R.id.txtContact);
        txtDepartment = findViewById(R.id.txtDepartment);

        auth = FirebaseAuth.getInstance();
        teacherRef = FirebaseDatabase.getInstance().getReference("Teachers");

        loadTeacherProfile();
    }

    private void loadTeacherProfile() {
        String userId = auth.getCurrentUser().getUid();
        teacherRef.child(userId).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    txtName.setText(snapshot.child("name").getValue(String.class));
                    txtID.setText(snapshot.child("id").getValue(String.class));
                    txtContact.setText(snapshot.child("contact").getValue(String.class));
                    txtDepartment.setText(snapshot.child("department").getValue(String.class));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}
