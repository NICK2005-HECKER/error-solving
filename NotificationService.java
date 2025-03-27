package com.example.tracker.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.tracker.utils.NotificationHelper;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

public class NotificationService extends Service {

    private FirebaseFirestore db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = FirebaseFirestore.getInstance();
        listenForTimetableUpdates();
        listenForAttendanceUpdates();
        listenForAdminAnnouncements();
    }

    private void listenForTimetableUpdates() {
        db.collection("timetables").addSnapshotListener((value, error) -> {
            if (error != null) {
                Log.e("NotificationService", "Timetable Listener Error: " + error.getMessage());
                return;
            }
            if (value != null) {
                for (DocumentChange dc : value.getDocumentChanges()) {
                    if (dc.getType() == DocumentChange.Type.ADDED || dc.getType() == DocumentChange.Type.MODIFIED) {
                        NotificationHelper.sendNotification(this, "Timetable Updated", "Your timetable has been updated.");
                    }
                }
            }
        });
    }

    private void listenForAttendanceUpdates() {
        db.collection("attendance").addSnapshotListener((value, error) -> {
            if (error != null) {
                Log.e("NotificationService", "Attendance Listener Error: " + error.getMessage());
                return;
            }
            if (value != null) {
                for (DocumentChange dc : value.getDocumentChanges()) {
                    if (dc.getType() == DocumentChange.Type.ADDED || dc.getType() == DocumentChange.Type.MODIFIED) {
                        NotificationHelper.sendNotification(this, "Attendance Updated", "Your attendance has been updated.");
                    }
                }
            }
        });
    }

    private void listenForAdminAnnouncements() {
        db.collection("announcements").addSnapshotListener((value, error) -> {
            if (error != null) {
                Log.e("NotificationService", "Announcements Listener Error: " + error.getMessage());
                return;
            }
            if (value != null) {
                for (DocumentChange dc : value.getDocumentChanges()) {
                    if (dc.getType() == DocumentChange.Type.ADDED) {
                        NotificationHelper.sendNotification(this, "New Announcement", "Check the latest announcement from Admin.");
                    }
                }
            }
        });
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
