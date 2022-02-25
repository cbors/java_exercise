package com.interview.exercise.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Courier {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;

    @OneToOne
    private AppUser appUser;

}
