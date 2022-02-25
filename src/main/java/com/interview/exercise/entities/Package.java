package com.interview.exercise.entities;

import com.interview.exercise.enums.Status;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Package {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="")
    private AppUser user;

    @Enumerated(EnumType.STRING)
    private Status status;

}
