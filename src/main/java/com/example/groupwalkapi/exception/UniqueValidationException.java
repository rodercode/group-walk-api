package com.example.groupwalkapi.exception;

public class UniqueValidationException extends RuntimeException {
    public UniqueValidationException(String message) {
        super(message);
    }

    public UniqueValidationException(Throwable cause) {
        super(cause);
    }
}
