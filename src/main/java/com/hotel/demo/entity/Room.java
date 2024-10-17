package com.hotel.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Room {
    private long id;
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;

}
