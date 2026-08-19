package com.profileservice.service;

import com.profileservice.dto.request.UserProfileRequest;
import com.profileservice.dto.response.UserProfileResponse;
import com.profileservice.entity.UserProfile;
import com.profileservice.mapper.UserProfileMapper;
import com.profileservice.repository.UserProfileRepository;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;

    @Transactional
    public UserProfileResponse createProfile(UserProfileRequest userProfileRequest) {
        UserProfile userProfile = userProfileMapper.toUserProfile(userProfileRequest);
        userProfile = userProfileRepository.save(userProfile);
        return userProfileMapper.toUserProfileResponse(userProfile);
    }
    public UserProfileResponse getProfile(String id) {
        UserProfile userProfile = userProfileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));
        return userProfileMapper.toUserProfileResponse(userProfile);
    }
}
