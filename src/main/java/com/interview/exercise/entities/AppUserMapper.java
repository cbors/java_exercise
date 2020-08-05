package com.interview.exercise.entities;

//Zakres szkolenia:

import com.interview.exercise.entities.AppUser;
import com.interview.exercise.entities.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDateTime;

public interface AppUserMapper {

    AppUser userDtoToAppUser(UserDto userDto);

    default LocalDateTime modifyInsertName (UserDto userDto) {
        return LocalDateTime.now();
    }
}
