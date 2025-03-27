package com.example.tracker.models;

public class StudentReport {
    private String studentName;
    private String studentRoll;
    private int attendancePercentage;
    private double averageMarks;

    public StudentReport() {
        // Default constructor required for Firebase
    }

    public StudentReport(String studentName, String studentRoll, int attendancePercentage, double averageMarks) {
        this.studentName = studentName;
        this.studentRoll = studentRoll;
        this.attendancePercentage = attendancePercentage;
        this.averageMarks = averageMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(String studentRoll) {
        this.studentRoll = studentRoll;
    }

    public int getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(int attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }
}
