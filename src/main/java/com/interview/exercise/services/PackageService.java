package com.interview.exercise.services;

import com.interview.exercise.dto.UserDto;
import com.interview.exercise.entities.AppUser;
import com.interview.exercise.entities.Package;
import com.interview.exercise.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageService {

    @Autowired
    AppUserRepository appUserRepository;

    public List<Package> getAllPackagesInSystem() {

        List<AppUser> all = appUserRepository.findAll();

        List<Package> packages = new ArrayList<>();

        for (AppUser user : all) {
            List<Package> aPackage = user.packages;
            packages.addAll(aPackage);
        }
        return packages;
    }
}
