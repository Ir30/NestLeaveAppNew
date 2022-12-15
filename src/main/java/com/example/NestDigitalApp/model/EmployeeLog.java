package com.example.NestDigitalApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_log")
public class EmployeeLog {

    @Id
    @GeneratedValue()
    private int id;
    private String emp_code;
    private String date;
    private String entry_time;
    private String exit_time;


    public EmployeeLog(int id) {
        this.id = id;
    }

    public EmployeeLog(int id, String emp_code, String date, String entry_time, String exit_time) {
        this.id = id;
        this.emp_code = emp_code;
        this.date = date;
        this.entry_time = entry_time;
        this.exit_time = exit_time;
    }


    public int getId() {
        return id;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public String getDate() {
        return date;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public String getExit_time() {
        return exit_time;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public void setExit_time(String exit_time) {
        this.exit_time = exit_time;
    }
}
