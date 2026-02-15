////package dev.lekha.pulsecare.model;
////
////public class Appointment {
////}
//
//package com.pulsecare.model;
//
//import jakarta.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//public class Appointment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String patientName;
//    private String doctorName;
//    private LocalDate date;
//    private String status;
//
//    // Getters & Setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getPatientName() { return patientName; }
//    public void setPatientName(String patientName) { this.patientName = patientName; }
//
//    public String getDoctorName() { return doctorName; }
//    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
//
//    public LocalDate getDate() { return date; }
//    public void setDate(LocalDate date) { this.date = date; }
//
//    public String getStatus() { return status; }
//    public void setStatus(String status) { this.status = status; }
//}

package dev.lekha.pulsecare.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookedBy;

    private String patientName;
    private String doctorName;
    private LocalDate date;
    private String status;

    public Appointment() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

}
