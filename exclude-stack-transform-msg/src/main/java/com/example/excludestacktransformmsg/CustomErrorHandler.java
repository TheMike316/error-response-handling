package com.example.excludestacktransformmsg;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomErrorHandler {

    // teapot just for demonstration purposes, default is internal server error
    @ResponseStatus(
            code = HttpStatus.I_AM_A_TEAPOT,
            reason = "This message is totally fine and also a bit boring to be honest"
    )
    @ExceptionHandler(SensitiveDataException.class)
    void handleError(SensitiveDataException e) {
    }
}
