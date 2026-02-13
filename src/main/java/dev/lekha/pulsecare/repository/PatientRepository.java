//package dev.lekha.pulsecare.repository;
//
//public class PatientRepository {
//}

//package com.pulsecare.repository;
//
//import com.pulsecare.model.Patient;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface PatientRepository extends JpaRepository<Patient, Long> {
//
//}

package dev.lekha.pulsecare.repository;

import dev.lekha.pulsecare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
