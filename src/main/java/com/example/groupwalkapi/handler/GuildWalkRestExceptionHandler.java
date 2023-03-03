package com.example.groupwalkapi.handler;
import com.example.groupwalkapi.bean.ExceptionResponse;
import com.example.groupwalkapi.exception.ListEmptyException;
import com.example.groupwalkapi.exception.ResourceNotFoundException;
import com.example.groupwalkapi.exception.UniqueValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class GuildWalkRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(ListEmptyException e) {
        ExceptionResponse error = new ExceptionResponse
                (
                        HttpStatus.NO_CONTENT.value(),
                        e.getMessage(),
                        ZonedDateTime.now(ZoneId.of("Z"))
                );
        return new ResponseEntity<>(error, HttpStatus.NO_CONTENT);
    }
    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(ResourceNotFoundException e) {
        ExceptionResponse error = new ExceptionResponse
                (
                        HttpStatus.NOT_FOUND.value(),
                        e.getMessage(),
                        ZonedDateTime.now(ZoneId.of("Z"))
                );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handleException(UniqueValidationException e){
        ExceptionResponse error = new ExceptionResponse
                (
                        HttpStatus.UNPROCESSABLE_ENTITY.value(),
                        e.getMessage(),
                        ZonedDateTime.now(ZoneId.of("Z"))
                );
        return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
