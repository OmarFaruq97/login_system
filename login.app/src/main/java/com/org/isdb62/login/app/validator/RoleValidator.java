package com.org.isdb62.login.app.validator;

import com.org.isdb62.login.app.annotation.ValidRole;
import com.org.isdb62.login.app.constants.Role;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RoleValidator implements ConstraintValidator<ValidRole, Role> {
    @Override
    public boolean isValid(Role role, ConstraintValidatorContext context) {
        if (role == null) {
            return false;
        }
        try {
            Role.valueOf(role.name());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
