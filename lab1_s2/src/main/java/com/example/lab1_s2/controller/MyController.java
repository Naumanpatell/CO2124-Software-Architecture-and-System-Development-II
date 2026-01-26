package com.example.lab1_s2.controller;

import com.example.lab1_s2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.core.Authentication;


@Controller
public class MyController {

    private final UserService userService;
    public MyController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String Register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        userService.registerUser(username, password);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String Login() {
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/sucess-login")
    public String successLogin(Authentication auth) {
        boolean isAdmin = auth.getAuthorities().stream().anyMatch(a -> a.getAuthority().equals("ROLE ADMIN"));
        return isAdmin ? "redirect/admin" : "redirect/user";
    }

    @GetMapping("/denied")
    public String denied() {
        return "denied";
    }






}
