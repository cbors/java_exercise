package com.interview.exercise.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository   extends JpaRepository<AppUser, Integer> {

    List<AppUser> findAllByIdLike (List <Integer> ids);

    List<AppUser> findAllByLastName (List <String> nazwiska);
}
