package com.identifyservice.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.identifyservice.identity.dto.request.UserCreationRequest;
import com.identifyservice.identity.dto.request.UserUpdateRequest;
import com.identifyservice.identity.dto.response.UserResponse;
import com.identifyservice.identity.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
