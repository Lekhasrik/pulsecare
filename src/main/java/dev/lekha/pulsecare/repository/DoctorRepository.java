//package dev.lekha.pulsecare.repository;
//
//public class DoctorRepository {
//}

//package dev.pulsecare.repository;
//
//import com.pulsecare.model.Doctor;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface DoctorRepository extends JpaRepository<Doctor, Long> {
//
//}

//package dev.lekha.pulsecare.repository;
//
//import dev.lekha.pulsecare.model.Doctor;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface DoctorRepository extends JpaRepository<Doctor, Long> {
//}

package dev.lekha.pulsecare.repository;

import dev.lekha.pulsecare.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
