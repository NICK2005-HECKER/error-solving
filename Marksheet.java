package com.example.tracker.models;

public class Marksheet {
    private String studentName;
    private String subject;
    private int marks;

    public Marksheet() {
    }

    public Marksheet(String studentName, String subject, int marks) {
        this.studentName = studentName;
        this.subject = subject;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
