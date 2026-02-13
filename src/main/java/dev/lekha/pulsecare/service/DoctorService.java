//package dev.lekha.pulsecare.service;
//
//public class DoctorService {
//}


//package dev.lekha.pulsecare.service;
//
//import dev.lekha.pulsecare.model.Doctor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DoctorService {
//
//    private final DoctorRepository repo;
//
//    public DoctorService(DoctorRepository repo) {
//        this.repo = repo;
//    }
//
//    // Save Doctor
//    public void saveDoctor(Doctor doctor) {
//        repo.save(doctor);
//    }
//
//    // Get All Doctors
//    public List<Doctor> getAllDoctors() {
//        return repo.findAll();
//    }
//
//    // Get Doctor By ID
//    public Doctor getDoctorById(Long id) {
//        Optional<Doctor> optional = repo.findById(id);
//        return optional.orElse(null);
//    }
//
//    // Delete Doctor
//    public void deleteDoctor(Long id) {
//        repo.deleteById(id);
//    }
//}

//package dev.lekha.pulsecare.service;
//
//import dev.lekha.pulsecare.model.Doctor;
//import dev.lekha.pulsecare.repository.DoctorRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DoctorService {
//
//    private final DoctorRepository repo;
//
//    public DoctorService(DoctorRepository repo) {
//        this.repo = repo;
//    }
//
//    public void saveDoctor(Doctor doctor) {
//        repo.save(doctor);
//    }
//
//    public List<Doctor> getAll() {
//        return repo.findAll();
//    }
//}

package dev.lekha.pulsecare.service;

import dev.lekha.pulsecare.model.Doctor;
import dev.lekha.pulsecare.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository repo;

    public DoctorService(DoctorRepository repo) {
        this.repo = repo;
    }

    public void saveDoctor(Doctor doctor) {
        repo.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    public void deleteDoctor(Long id) {
        repo.deleteById(id);
    }
}
