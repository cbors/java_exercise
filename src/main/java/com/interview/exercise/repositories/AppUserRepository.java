package com.interview.exercise.repositories;

import com.interview.exercise.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AppUserRepository   extends JpaRepository<AppUser, Integer> {

    List<AppUser> findAllByIdIn(Collection<Long> id);

    List<AppUser> findAllByLastNameIn (List <String> lastNames);
}
