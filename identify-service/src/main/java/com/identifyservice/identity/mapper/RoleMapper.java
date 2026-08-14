package com.identifyservice.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.identifyservice.identity.dto.request.RoleRequest;
import com.identifyservice.identity.dto.response.RoleResponse;
import com.identifyservice.identity.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
