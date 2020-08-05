package com.interview.exercise.entities;

import com.interview.exercise.Package;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastName;
    private String company;
    private LocalDateTime insertTime;

    @OneToOne
    private Role role;

    @ManyToMany
    public List<Package> aPackage;
}
