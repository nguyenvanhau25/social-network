package com.profileservice.mapper;

import com.profileservice.dto.request.UserProfileRequest;
import com.profileservice.dto.response.UserProfileResponse;
import com.profileservice.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(UserProfileRequest userProfileRequest);
    UserProfileResponse toUserProfileResponse(UserProfile userProfile);

}
