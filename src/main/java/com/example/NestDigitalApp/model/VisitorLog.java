package com.example.NestDigitalApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitor_log")
public class VisitorLog {

    @Id
    @GeneratedValue()
    private int id;
    private String name;
    private String date;
    private String entry_time;
    private String exit_time;

    public VisitorLog() {
    }

    public VisitorLog(int id, String name, String date, String entry_time, String exit_time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.entry_time = entry_time;
        this.exit_time = exit_time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
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
