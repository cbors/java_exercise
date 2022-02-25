package com.interview.exercise.controllers;

import com.interview.exercise.dto.CourierDto;
import com.interview.exercise.entities.Courier;
import com.interview.exercise.services.CourierService;
import com.interview.exercise.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourierController {

    @Autowired
    private CourierService courierService;

    @GetMapping("/courier")
    ResponseEntity<Courier> searchCourier(CourierDto courierDto) {
        Courier courier = courierService.getCourierByNameAndLastName(courierDto.getName(),courierDto.getSurname());
        return ResponseEntity.ok().body(courier);
    }

    @GetMapping("/courierWithPackages")
    ResponseEntity<List<Courier>> searchCouriersWithPackages(CourierDto courierDto) {
        List<Courier> couriers = courierService.getAllCouriersWithPackage();
        return ResponseEntity.ok().body(couriers);
    }

}
