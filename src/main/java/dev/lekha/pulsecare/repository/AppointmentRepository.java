//package dev.lekha.pulsecare.repository;
//
//public class AppointmentRepository {
//}

//package com.pulsecare.repository;
//
//import com.pulsecare.model.Appointment;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
//
//}

package dev.lekha.pulsecare.repository;

import dev.lekha.pulsecare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

