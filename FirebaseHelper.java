package com.example.tracker.firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.tracker.models.User;

public class FirebaseHelper {
    private DatabaseReference databaseReference;

    public FirebaseHelper() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference("Users");
    }

    // Add user (Admin adds Student/Teacher)
    public void addUser(String userId, User user) {
        databaseReference.child(userId).setValue(user);
    }

    // Retrieve user reference
    public DatabaseReference getUserReference(String userId) {
        return databaseReference.child(userId);
    }
}
