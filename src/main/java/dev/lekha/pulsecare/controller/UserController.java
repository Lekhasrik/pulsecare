//package dev.lekha.pulsecare.controller;
//
//public class UserController {
//}

//package dev.lekha.pulsecare.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class UserController {
//
//    @GetMapping("/")
//    public String home() {
//        return "home";
//    }
//
//    @GetMapping("/about")
//    public String about() {
//        return "about";
//    }
//}


package dev.lekha.pulsecare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import dev.lekha.pulsecare.repository.*;
import dev.lekha.pulsecare.model.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;



    @GetMapping("/dashboard")
    public String dashboard() {
        return "user-dashboard";
    }

    @GetMapping("/doctors")
    public String viewDoctors(Model model) {
        model.addAttribute("doctors", doctorRepository.findAll());
        return "user-doctors";
    }

    @GetMapping("/book")
    public String bookAppointment(Model model) {
        model.addAttribute("appointment", new Appointment());
        model.addAttribute("doctors", doctorRepository.findAll());
        return "book-appointment";
    }

    @PostMapping("/save-appointment")
    public String saveAppointment(@ModelAttribute Appointment appointment) {
        appointmentRepository.save(appointment);
        return "redirect:/user/dashboard";
    }
}
