package com.example.springdemo.bean;

public class Employee {
    int id;
    String name;
    String email;

    Department dept;

    public Employee(int id, String name,Department dept, String email) {
        this.id = id;
        this.name = name;
        this.dept=dept;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return dept;
    }

    public void setDepartment(Department dept) {
        this.dept = dept;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
