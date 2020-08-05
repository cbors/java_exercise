package com.interview.exercise;

import com.interview.exercise.entities.AppUser;

import javax.persistence.Entity;

@Entity
public class Package {

    private int id;

    private AppUser PackageUserToDeliveryFrom;

}
