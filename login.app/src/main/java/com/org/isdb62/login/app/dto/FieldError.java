package com.org.isdb62.login.app.dto;

public record FieldError(
        String field,
        String errorCode,
        String errorMessage
) {
}