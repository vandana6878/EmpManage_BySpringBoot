package com.example.springdemo.bean;

public class Department {
    String position;
    double salary;


    public Department(String position, double salary){
        this.position = position;
        this.salary = salary;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String p){
        position = p;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double s){
        salary = s;
    }

    @Override
    public String toString() {
        return "Department{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
