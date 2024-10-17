package com.hotel.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Reservation {
    private long id;
    private String guestName;
    private int roomNumber;
    private String checkInDate;
    private String checkOutDate;
    private double totalPrice;
    private RESERVATION_STATUS status;


}
