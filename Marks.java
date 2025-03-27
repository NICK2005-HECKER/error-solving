package com.example.tracker.models;

public class Marks {
    private String studentName;
    private String subject;
    private int score;

    public Marks() {
    }

    public Marks(String studentName, String subject, int score) {
        this.studentName = studentName;
        this.subject = subject;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
