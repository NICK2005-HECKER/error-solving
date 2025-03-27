package com.example.tracker.models;

public class Timetable {
    private String id;
    private String timeSlot;
    private String subject;
    private String teacherId;

    // Empty constructor required for Firestore
    public Timetable() {}

    public Timetable(String id, String timeSlot, String subject, String teacherId) {
        this.id = id;
        this.timeSlot = timeSlot;
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String getId() {
        return id;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
