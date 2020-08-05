package com.interview.exercise.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private Double id;
    private String name;
    private String lastName;
    public String roleType;
    public String upperName;

    @JsonBackReference
    @OneToOne
    public AppUser user;


}
