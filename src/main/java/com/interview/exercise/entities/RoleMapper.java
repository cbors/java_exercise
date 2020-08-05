package com.interview.exercise.entities;

public interface RoleMapper {

    public Role roleDtoToRole(RoleDto roleDto);

    public default String nameToUpper (RoleDto roleDto) {
        return roleDto.getName().toUpperCase();
    }
}
