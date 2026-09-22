package com.sentinelai.backend.dto;

import com.sentinelai.backend.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private Role role;
    private Instant createdAt;
}