package dev.lekha.pulsecare.controller;

import dev.lekha.pulsecare.model.User;
import dev.lekha.pulsecare.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UserRepository repo;

    public AuthController(UserRepository repo) {
        this.repo = repo;
    }

    // Show Register Page
    @GetMapping("/register")
    public String showRegister(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

//    // Save User
//    @PostMapping("/register")
//    public String register(@ModelAttribute User user) {
//        repo.save(user);
//        return "redirect:/login";
//    }
// Save User
@PostMapping("/register")
public String register(@ModelAttribute User user) {

    user.setRole("USER");   // 🔥 Always set as USER
    repo.save(user);

    return "redirect:/login";
}


    // Show Login Page
    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    // Login Logic
    @PostMapping("/login")
    public String login(@ModelAttribute User user) {

        User existing = repo.findByUsername(user.getUsername());

        if (existing != null && existing.getPassword().equals(user.getPassword())) {

            if (existing.getRole().equals("ADMIN")) {
                return "redirect:/admin/dashboard";
            } else {
//                return "redirect:/appointment";
//                return "redirect:/user/dashboard";
                return "redirect:/";
            }
        }

        return "redirect:/login?error";
    }
}
