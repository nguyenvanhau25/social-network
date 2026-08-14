package com.identifyservice.identity.mapper;

import org.mapstruct.Mapper;

import com.identifyservice.identity.dto.request.ProfileCreationRequest;
import com.identifyservice.identity.dto.request.UserCreationRequest;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
