package com.example.lab1_s2;


import com.example.lab1_s2.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.lab1_s2.model.User;


@Configuration
public class AdminSeeder {
    @Bean
    CommandLineRunner seedAdmin(UserRepository userRepository, PasswordEncoder encoder) {
       return args -> {
           String adminUsername = "admin@co2124.com";
           if (userRepository.findByUsername(adminUsername) == null) {
               User admin = new User();
               admin.setUsername(adminUsername);
               admin.setPassword(encoder.encode("password"));
               admin.setRole("ADMIN");
               userRepository.save(admin);
               System.out.println("Admin created: " + adminUsername + "/ password");
           }
       };
    }
}