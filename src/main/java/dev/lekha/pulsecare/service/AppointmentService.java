//package dev.lekha.pulsecare.service;
//
//public class AppointmentService {
//}


package dev.lekha.pulsecare.service;

import dev.lekha.pulsecare.model.Appointment;
//import dev.lekha.pulsecare.repository.AppointmentRepository;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class AppointmentService {
//
//    private final AppointmentRepository repo;
//
//    public AppointmentService(AppointmentRepository repo) {
//        this.repo = repo;
//    }
//
//    public void saveAppointment(Appointment appointment) {
//        appointment.setStatus("PENDING");
//        repo.save(appointment);
//    }
//
//    public List<Appointment> getAll() {
//        return repo.findAll();
//    }
//}

import dev.lekha.pulsecare.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

//@Service
//public class AppointmentService {
//
//    private final AppointmentRepository repository;
//
//    public AppointmentService(AppointmentRepository repository) {
//        this.repository = repository;
//    }
//
//    public void saveAppointment(Appointment appointment) {
//        repository.save(appointment);
//    }
//
//    public List<Appointment> getAllAppointments() {
//        return repository.findAll();
//    }
//
//    public Appointment getById(Long id) {
//        return appointmentRepository.findById(id).orElse(null);
//    }
//
//    public void save(Appointment appointment) {
//        appointmentRepository.save(appointment);
//    }
//
//
//}
//


@Service
public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public void saveAppointment(Appointment appointment) {
        repository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }

    public Appointment getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void save(Appointment appointment) {
        repository.save(appointment);
    }


}
