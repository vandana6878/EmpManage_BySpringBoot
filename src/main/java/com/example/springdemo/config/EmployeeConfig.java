package com.example.springdemo.config;

import com.example.springdemo.bean.Department;
import com.example.springdemo.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.demo.beans","com.example.demo.Service","com.example.demo.Controller"})

public class EmployeeConfig {

    @Bean("Niharika")
    public Employee emp1(){
        return new Employee(6907, "Niharika",new Department("SE Trainee",20000),"niharika07@gmail.com");
    }
    @Bean("Vandana")
    public Employee emp2(){
        return new Employee(6878, "Vandana",new Department("SE Trainee",20000),"vandana780@gmail.com");
    }
    @Bean("Sindhu")
    public Employee emp3(){
        return new Employee(6869, "Sindhu",new Department("SE Trainee",20000) ,"sindhu69@gmail.com");
    }
    @Bean("Charitha")
    public Employee emp4(){
        return new Employee(6906, "Charitha",new Department("SE Trainee",20000),"charitha06@gmail.com");

    }


}
