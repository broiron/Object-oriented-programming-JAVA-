package com.oop._2022;

import java.time.LocalDateTime;

public class HospitalAppointment {
    private LocalDateTime d;
    private Doctor doctor;
    private Patient patient;

    public HospitalAppointment(Doctor doctor, Patient p, LocalDateTime d) {
        this.doctor = doctor;
        this.patient = p;
        this.d = d;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getD() {
        return d;
    }

    public String toString() {
        return "HospitalAppointment: "+this.d+"\n"+this.doctor+"\n"+this.patient;
    }
}