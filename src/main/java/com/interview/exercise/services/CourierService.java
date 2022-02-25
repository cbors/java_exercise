package com.interview.exercise.services;

import com.interview.exercise.entities.Courier;
import com.interview.exercise.repositories.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourierService {

    @Autowired
    CourierRepository courierRepository;

    public Courier getCourierByNameAndLastName(String name, String lastName){
        return courierRepository.findAByNameAndLastName(name,lastName);
    }

    public List<Courier> getAllCouriersWithPackage(){

        List<Courier> courierList = courierRepository.findAll();
        return courierList.stream().filter(courier -> !courier.getAppUser().getPackages().isEmpty()).collect(Collectors.toList());

    }

}
