package com.example.tracker.models;

import java.util.Date;

public class Attendance {
    private String studentId;
    private String studentName;
    private String subject;
    private boolean isPresent;
    private Date date;

    public Attendance() {}

    public Attendance(String studentId, String studentName, String subject, boolean isPresent, Date date) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subject = subject;
        this.isPresent = isPresent;
        this.date = date;
    }

    public String getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public String getSubject() { return subject; }
    public boolean isPresent() { return isPresent; }
    public Date getDate() { return date; }

    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setPresent(boolean present) { isPresent = present; }
    public void setDate(Date date) { this.date = date; }
}
