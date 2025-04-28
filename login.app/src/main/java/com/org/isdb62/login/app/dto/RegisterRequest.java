package com.org.isdb62.login.app.dto;

import com.org.isdb62.login.app.annotation.ValidRole;
import com.org.isdb62.login.app.constants.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public record RegisterRequest(
        @NotBlank(message = "Email cannot be blank")
        @Email(message = "Email should be valid")
        String email,

        @NotBlank(message = "Password cannot be blank")
        @Size(min = 5, message = "Password must be at least 5 characters")
        String password,


        String role,

        String firstName,
        String lastName,
        String phoneNumber
) {
}
