//package dev.lekha.pulsecare.controller;
//
//public class AdminController {
//}


package dev.lekha.pulsecare.controller;

import dev.lekha.pulsecare.model.Patient;
import dev.lekha.pulsecare.model.Doctor;
import dev.lekha.pulsecare.service.PatientService;
import dev.lekha.pulsecare.service.DoctorService;
import dev.lekha.pulsecare.service.AppointmentService;
import dev.lekha.pulsecare.model.Appointment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final PatientService patientService;
    private final DoctorService doctorService;
    private final AppointmentService appointmentService;

    public AdminController(PatientService patientService,
                           DoctorService doctorService,
                           AppointmentService appointmentService) {
        this.patientService = patientService;
        this.doctorService = doctorService;
        this.appointmentService = appointmentService;
    }

    // ================= DASHBOARD =================
    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin-dashboard";
    }

    // ================= PATIENT =================

    @GetMapping("/patients")
    public String viewPatients(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "admin-patients";
    }

    @GetMapping("/add-patient")
    public String addPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "add-patient";
    }

    @PostMapping("/save-patient")
    public String savePatient(@ModelAttribute Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/admin/patients";
    }

    @GetMapping("/delete-patient/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return "redirect:/admin/patients";
    }

    // ================= DOCTOR =================

    @GetMapping("/doctors")
    public String viewDoctors(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "admin-doctors";
    }

    @GetMapping("/add-doctor")
    public String addDoctorForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "add-doctor";
    }

    @PostMapping("/save-doctor")
    public String saveDoctor(@ModelAttribute Doctor doctor) {
        doctorService.saveDoctor(doctor);
        return "redirect:/admin/doctors";
    }

    // ================= APPOINTMENTS =================

    @GetMapping("/appointments")
    public String viewAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        return "admin-appointments";
    }

    @GetMapping("/complete/{id}")
    public String markCompleted(@PathVariable Long id) {

        Appointment appt = appointmentService.getById(id);
        appt.setStatus("COMPLETED");
        appointmentService.save(appt);

//        return "redirect:/admin/dashboard";
        return "redirect:/admin/appointments";

    }

    //new



}
