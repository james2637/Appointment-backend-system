package com.rabibanik.appointment_Booking.entity;

import lombok.Data;

@Data
public class Doctor {
    private long id;
    private String name;
    private String specialization;
    private String email;
    private String phoneNumber;
    private int experienceYears;
    private float consultationFee;
    private String availableDays;
    private String availableTimeSlots;

}
