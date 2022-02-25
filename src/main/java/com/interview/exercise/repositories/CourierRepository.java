package com.interview.exercise.repositories;

import com.interview.exercise.entities.AppUser;
import com.interview.exercise.entities.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends JpaRepository<Courier, Integer> {

    Courier findAByNameAndLastName(String name, String lastName);
}
