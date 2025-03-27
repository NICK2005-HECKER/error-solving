package com.example.tracker.models;

public class Teacher {
    private String name;
    private String teacherId;
    private String department;
    private String contact;

    public Teacher() {
    }

    public Teacher(String name, String teacherId, String department, String contact) {
        this.name = name;
        this.teacherId = teacherId;
        this.department = department;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
