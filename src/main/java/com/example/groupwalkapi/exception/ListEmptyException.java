package com.example.groupwalkapi.exception;

public class ListEmptyException extends RuntimeException{
    public ListEmptyException(String message) {
        super(message);
    }

    public ListEmptyException(Throwable cause) {
        super(cause);
    }
}
