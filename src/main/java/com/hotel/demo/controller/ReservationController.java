package com.hotel.demo.controller;


import com.hotel.demo.entity.Room;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    Map<Integer , Room> rooms;

    @PostConstruct
    public void init(){
        rooms = new HashMap<>();
    }


}
