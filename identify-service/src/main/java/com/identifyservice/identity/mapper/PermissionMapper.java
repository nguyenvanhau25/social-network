package com.identifyservice.identity.mapper;

import org.mapstruct.Mapper;

import com.identifyservice.identity.dto.request.PermissionRequest;
import com.identifyservice.identity.dto.response.PermissionResponse;
import com.identifyservice.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
