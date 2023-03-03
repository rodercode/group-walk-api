package com.example.groupwalkapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GuildWalkRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(ListEmptyException e) {
        ErrorResponse error = new ErrorResponse
                (
                        HttpStatus.NO_CONTENT.value(),
                        e.getMessage(),
                        ZonedDateTime.now(ZoneId.of("Z"))
                );
        return new ResponseEntity<>(error, HttpStatus.NO_CONTENT);
    }
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(ResourceNotFoundException e) {
        ErrorResponse error = new ErrorResponse
                (
                        HttpStatus.NOT_FOUND.value(),
                        e.getMessage(),
                        ZonedDateTime.now(ZoneId.of("Z"))
                );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(UniqueValidationException e){
        ErrorResponse error = new ErrorResponse
                (
                        HttpStatus.UNPROCESSABLE_ENTITY.value(),
                        e.getMessage(),
                        ZonedDateTime.now(ZoneId.of("Z"))
                );
        return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
