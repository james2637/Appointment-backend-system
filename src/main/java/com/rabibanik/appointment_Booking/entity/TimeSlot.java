package com.rabibanik.appointment_Booking.entity;

import lombok.Data;

import java.time.LocalTime;

@Data
public class TimeSlot {

    private long id;
    private LocalTime startTime;
    private LocalTime endTime;
    private String date;
    private boolean isBooked;
    private Doctor doctor;
}
