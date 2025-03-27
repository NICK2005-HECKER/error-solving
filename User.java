package com.example.tracker.models;

public class User {
    private String name;
    private String username;
    private String role;
    private String department;

    // Required empty constructor for Firebase
    public User() {}

    public User(String name, String username, String role, String department) {
        this.name = name;
        this.username = username;
        this.role = role;
        this.department = department;
    }

    // Getters
    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getRole() { return role; }
    public String getDepartment() { return department; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setUsername(String username) { this.username = username; }
    public void setRole(String role) { this.role = role; }
    public void setDepartment(String department) { this.department = department; }
}
