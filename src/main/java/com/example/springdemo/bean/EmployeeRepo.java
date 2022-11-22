package com.example.springdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepo {
    Employee Niharika;
    Employee Vandana;

    Employee Sindhu;

    Employee Charitha;


    public Employee getNiharika(){
        return Niharika;
    }
    @Autowired
    @Qualifier("Niharika")
    public void setNiharika(Employee Niharika){
        this.Niharika = Niharika;
    }

    public Employee getVandana(){
        return Vandana;
    }
    @Autowired
    @Qualifier("Vandana")
    public void setVandana(Employee Vandana){
        this.Vandana = Vandana;
    }

    public Employee getSindhu(){
        return Sindhu;
    }
    @Autowired
    @Qualifier("Sindhu")
    public void setSindhu(Employee Sindhu) {
        this.Sindhu = Sindhu;
    }

    public Employee getCharitha(){
        return Niharika;
    }
    @Autowired
    @Qualifier("Charitha")
    public void setCharitha(Employee Charitha) {
        this.Charitha = Charitha;
    }
}
