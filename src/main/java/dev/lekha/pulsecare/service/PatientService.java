//package dev.lekha.pulsecare.service;
//
//public class PatientService {
//}


package dev.lekha.pulsecare.service;

import dev.lekha.pulsecare.model.Patient;
import org.springframework.stereotype.Service;
import dev.lekha.pulsecare.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository repo;

    public PatientService(PatientRepository repo) {
        this.repo = repo;
    }

    // Save Patient
    public void savePatient(Patient patient) {
        repo.save(patient);
    }

    // Get All Patients
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    // Get Patient By ID
    public Patient getPatientById(Long id) {
        Optional<Patient> optional = repo.findById(id);
        return optional.orElse(null);
    }

    // Delete Patient
    public void deletePatient(Long id) {
        repo.deleteById(id);
    }
}
