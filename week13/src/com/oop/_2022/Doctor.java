package com.oop._2022;

import java.time.LocalDateTime;

public class Doctor {
    private String name;
    private int id;

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Doctor name: "+this.name+"  id: "+this.id;
    }
}