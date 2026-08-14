package com.profileservice.controller;

import com.profileservice.dto.request.UserProfileRequest;
import com.profileservice.dto.response.UserProfileResponse;
import com.profileservice.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @PostMapping("/users")
    UserProfileResponse createUser(@RequestBody UserProfileRequest userProfileRequest) {
        return userProfileService.createProfile(userProfileRequest);
    }
    @GetMapping("/users/{profileId}")
    UserProfileResponse getUserProfile(@PathVariable String profileId) {
        return userProfileService.getProfile(profileId);
    }
}
