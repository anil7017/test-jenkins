package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testdemo {

    @GetMapping("/test")
    public String showMessage() {
        System.out.println("inside hello controller......");
        return "Hello lipsa";
    }
}
