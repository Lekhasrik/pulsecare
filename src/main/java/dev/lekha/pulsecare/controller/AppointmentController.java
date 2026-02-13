//package dev.lekha.pulsecare.controller;
//
//public class AppointmentController {
//}

//package dev.lekha.pulsecare.controller;
//
//import dev.lekha.pulsecare.model.Appointment;
//import dev.lekha.pulsecare.service.AppointmentService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class AppointmentController {
//
//    private final AppointmentService service;
//
//    public AppointmentController(AppointmentService service) {
//        this.service = service;
//    }
//
//    @GetMapping("/appointment")
//    public String showForm(Appointment appointment) {
//        return "appointment";
//    }
//
//    @PostMapping("/appointment")
//    public String bookAppointment(@ModelAttribute Appointment appointment) {
//        service.saveAppointment(appointment);
//        return "redirect:/";
//    }
//    @GetMapping("/appointments")
//    public String viewAppointments(Model model) {
//        model.addAttribute("appointments", appointmentRepository.findAll());
//        return "appointments";
//    }
//
//}

package dev.lekha.pulsecare.controller;

import dev.lekha.pulsecare.model.Appointment;
import dev.lekha.pulsecare.service.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//public class AppointmentController {
//
//    private final AppointmentService service;
//
//    public AppointmentController(AppointmentService service) {
//        this.service = service;
//    }
//
//
//    @GetMapping("/appointment")
//    public String showForm(Model model) {
//        model.addAttribute("appointment", new Appointment());
////        return "appointment";
//        return "book-appointment";
//    }
//
////    @PostMapping("/appointment")
////    public String bookAppointment(@ModelAttribute Appointment appointment) {
////        service.saveAppointment(appointment);
////        return "redirect:/appointments";
////    }
//@PostMapping("/appointment")
//public String bookAppointment(@ModelAttribute Appointment appointment) {
//
//    appointment.setStatus("PENDING");   // 🔥 set default
//    service.saveAppointment(appointment);
//
//    return "redirect:/appointments";
//}
//
//
//    @GetMapping("/appointments")
//    public String viewAppointments(Model model) {
//        model.addAttribute("appointments", service.getAllAppointments());
////        return "appointments";
//        return "appointment";
//    }
//
////    @PostMapping("/appointment")
////    public String saveAppointment(@ModelAttribute Appointment appointment) {
////
////        appointment.setStatus("PENDING");   // 🔥 default status
////        appointmentService.save(appointment);
////
////        return "redirect:/appointments";
////    }
//@PostMapping("/appointment")
//public String saveAppointment(@ModelAttribute Appointment appointment) {
//
//    appointment.setStatus("PENDING");
//    appointmentService.save(appointment);
//
//    return "redirect:/appointments";
//}
//
//
//}

@Controller
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping("/appointment")
    public String showForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "book-appointment";
    }

    @PostMapping("/appointment")
    public String bookAppointment(@ModelAttribute Appointment appointment) {

        appointment.setStatus("PENDING");   // 🔥 Important
        service.saveAppointment(appointment);

        return "redirect:/appointments";
    }


}
////
//
//package dev.lekha.pulsecare.controller;
//
//import dev.lekha.pulsecare.model.Appointment;
//import dev.lekha.pulsecare.service.AppointmentService;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class AppointmentController {
//
//    private final AppointmentService service;
//
//    public AppointmentController(AppointmentService service) {
//        this.service = service;
//    }
//
//    // 🔹 Show Appointment Form (User + Admin both use)
//    @GetMapping("/appointment")
//    public String showForm(Model model) {
//        model.addAttribute("appointment", new Appointment());
//        return "book-appointment";
//    }
//
//    // 🔹 Save Appointment (Role based redirect)
//    @PostMapping("/appointment")
//    public String bookAppointment(@ModelAttribute Appointment appointment,
//                                  Authentication authentication) {
//
//        appointment.setStatus("PENDING");
//        service.saveAppointment(appointment);
//
//        // 🔥 ROLE CHECK
//        boolean isAdmin = authentication.getAuthorities()
//                .stream()
//                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"));
//
//        if (isAdmin) {
//            return "redirect:/admin/appointments";
//        }
//
//        return "redirect:/";  // normal user → home
//    }
//}
//
