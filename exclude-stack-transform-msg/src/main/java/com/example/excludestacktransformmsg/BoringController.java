package com.example.excludestacktransformmsg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoringController {

    @GetMapping("/throw")
    public void throwAnException() {
        throw new SensitiveDataException("This message includes sensitive data and should not be included in the error response");
    }
}
