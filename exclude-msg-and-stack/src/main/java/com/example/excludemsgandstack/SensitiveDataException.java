package com.example.excludemsgandstack;

public class SensitiveDataException extends RuntimeException {

    public SensitiveDataException(String message) {
        super(message);
    }
}
