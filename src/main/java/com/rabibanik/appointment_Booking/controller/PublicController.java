package com.rabibanik.appointment_Booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/hello")
    public String home() {
        return "Welcome to the Appointment Booking System!";
    }
}
