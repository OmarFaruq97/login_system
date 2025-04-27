package com.org.isdb62.login.app.dto;

import java.util.List;

public record ErrorResponse(
        Integer httpStatus,
        String exception,
        String message,
        List<FieldError> fieldErrors
) {
}
