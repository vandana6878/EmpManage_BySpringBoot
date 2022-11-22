package com.example.springdemo.service;

import com.example.springdemo.bean.Employee;
import com.example.springdemo.bean.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeeDetails(){
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(employeeRepo.getNiharika());
        employee.add(employeeRepo.getVandana());
        employee.add(employeeRepo.getSindhu());
        employee.add(employeeRepo.getCharitha());
        return employee;
    }
}
