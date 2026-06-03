package com.userapp.mapper;

import org.mapstruct.Mapper;

import com.userapp.dto.UserDTO;
import com.userapp.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO dto);
    UserDTO toDTO(User entity);
}