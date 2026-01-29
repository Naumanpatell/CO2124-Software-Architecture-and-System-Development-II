package com.example.lab2_s2.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "اَلسَّلَامُ عَلَيْكُمْ وَرَحْمَةُ ٱللَّٰهِ وَبَرَكَاتُهُ";
    }

    @RequestMapping("/secured")
    public String secured() {
        return "You are secured";
    }
}
