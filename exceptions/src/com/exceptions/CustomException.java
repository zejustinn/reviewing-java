package com.exceptions;

public class CustomException extends RuntimeException {
    private final String errorMessage;
    public CustomException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }

    public String toString() {
        return this.errorMessage;
    }
}
