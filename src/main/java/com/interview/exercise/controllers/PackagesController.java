package com.interview.exercise.controllers;

import com.interview.exercise.entities.Package;
import com.interview.exercise.repositories.AppUserRepository;
import com.interview.exercise.services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paczki")

public class PackagesController {

    @Autowired
    AppUserRepository appUserRepository;
    PackageService packageService;


    @GetMapping("/all")
    public List<Package> getAllPackagesInSystem() {
        return packageService.getAllPackagesInSystem();
    }

}
