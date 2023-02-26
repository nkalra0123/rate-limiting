package com.example.ratelimiterdemo;

public class TooManyRequestsException extends Exception {

    public TooManyRequestsException() {
        super("Too many requests");
    }
}
