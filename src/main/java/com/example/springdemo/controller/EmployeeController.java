package com.example.springdemo.controller;

import com.example.springdemo.bean.Employee;
import com.example.springdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService service;

    public EmployeeService getService(){
        return service;
    }

    @Autowired
    public void setService(EmployeeService service){
        this.service = service;
    }

    @GetMapping("/AccoliteTrainees")
    public List<Employee> getEmployee(){
        return getService().getEmployeeDetails();
    }

    /*@GetMapping("/Vandana")
    public List<Employee> getEmployee(){
        return getService().getEmployeeDetails();
    }*/

    //@GetMapping("/Sindhu")
    //public List<Employee> getEmployee(){
    //    return getService().getEmployeeDetails();
    //}

    //@GetMapping("/Charitha")
    //public List<Employee> getEmployee(){
    //    return getService().getEmployeeDetails();
    //}
}
