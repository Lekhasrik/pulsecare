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


    //old
//@Controller
//public class AppointmentController {
//
//    //@Autowired
////    private AppointmentService appointmentService;
//    private final AppointmentService service;
//
//    public AppointmentController(AppointmentService service) {
//        this.service = service;
//    }
//
//    @GetMapping("/appointment")
//    public String showForm(Model model) {
//        model.addAttribute("appointment", new Appointment());
//        return "book-appointment";
//    }
//
//    @PostMapping("/appointment")
//    public String bookAppointment(@ModelAttribute Appointment appointment) {
//
//        appointment.setStatus("PENDING");   // 🔥 Important
//        service.saveAppointment(appointment);
//
//        return "redirect:/appointments";
////        return "redirect:/admin/appoinments";
//    }
//
//
//    @PostMapping("/admin/save-appointment")
//    public String saveAdminAppointment(Appointment appointment) {
//    service.saveAdminAppointment(appointment);
//        return "redirect:/admin/appointments";
//    }
//}


//new

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

        appointment.setStatus("PENDING");
        service.saveAppointment(appointment);

        return "redirect:/appointments";
    }

    // 🔥 THIS MUST BE HERE
    @GetMapping("/appointments")
    public String viewAppointments(Model model) {
        model.addAttribute("appointments", service.getAllAppointments());
        return "appointment";
    }

    @PostMapping("/admin/save-appointment")
    public String saveAdminAppointment(Appointment appointment) {
        service.saveAdminAppointment(appointment);   // 🔥 USE service
        return "redirect:/admin/appointments";
    }
}
