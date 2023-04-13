package com.oop._2022;

import java.time.LocalDateTime;
import java.util.Date;

public class Patient {
    private String name;
    private String id;

    public Patient(String name) {
        this.name = name;
        Date d = new Date();
        long t = d.getTime();
        this.id = t+name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Patient: " + this.name + "  id: " + this.id;
    }
}