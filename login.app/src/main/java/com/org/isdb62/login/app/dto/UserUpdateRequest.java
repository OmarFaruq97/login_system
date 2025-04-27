package com.org.isdb62.login.app.dto;

import com.org.isdb62.login.app.constants.Role;
import jakarta.validation.constraints.Email;


public record UserUpdateRequest(
        @Email(message = "Email should be valid")
        String email,

        Role role,
        String firstName,
        String lastName,
        String phoneNumber
) {
}
