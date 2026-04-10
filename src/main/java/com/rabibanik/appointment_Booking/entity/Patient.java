package com.rabibanik.appointment_Booking.entity;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Patient {

    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private String gender;
    private String address;
    private LocalDateTime appointmentDateTime;


}
