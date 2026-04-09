package com.rabibanik.appointment_Booking.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class Appointment {

        private long id;
        private Patient patient;
        private Doctor doctor;
        private String appointmentDateTime;
        private String status;
        private LocalTime timeSlot;
        private String reasonForVisit;
        private LocalDateTime createdAt;
}
