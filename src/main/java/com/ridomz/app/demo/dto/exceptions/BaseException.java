package com.ridomz.app.demo.dto.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class BaseException extends RuntimeException {
    private final String errorCode;
    private final HttpStatus status;
}
