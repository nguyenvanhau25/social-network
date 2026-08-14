package com.identifyservice.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.identifyservice.identity.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
