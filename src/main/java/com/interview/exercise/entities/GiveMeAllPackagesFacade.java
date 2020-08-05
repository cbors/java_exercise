package com.interview.exercise.entities;

import com.interview.exercise.Package;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paczki")

public class GiveMeAllPackagesFacade {

    @Autowired
    AppUserRepository appUserRepository;


    @GetMapping("/all")
    public List<Package> getAllPackagesInSystem(List<UserDto> użytkownicy) {

        int helper = 0;

        List<AppUser> wszyscy = new ArrayList<AppUser>();
        List <String> userSurnames  = new ArrayList<>();
        for (UserDto myUser :użytkownicy) {

            System.out.println(myUser.getName());

                   userSurnames.add( użytkownicy.get(helper).getSurname());

                    helper++;


            wszyscy = appUserRepository.findAllByLastName(userSurnames);
        }

        List<Package> paczki = new ArrayList<>();

        for (AppUser user: wszyscy) {
            List<Package> aPackage = user.aPackage;
            paczki.addAll(aPackage);
        }


        return paczki;


    }

}
