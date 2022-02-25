package com.interview.exercise.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourierDto {

    private String name;
    private String surname;
    private UserDto userDto;
}
