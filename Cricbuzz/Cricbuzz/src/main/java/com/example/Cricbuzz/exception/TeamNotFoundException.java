package com.example.Cricbuzz.exception;

public class TeamNotFoundException extends RuntimeException{

    public TeamNotFoundException(String message) {
        super(message);
    }
}
