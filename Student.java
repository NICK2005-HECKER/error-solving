package com.example.tracker.models;

public class Student {
    private String name;
    private String rollNumber;
    private boolean isPresent;

    public Student() {
    }

    public Student(String name, String rollNumber, boolean isPresent) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
