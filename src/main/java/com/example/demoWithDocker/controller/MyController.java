package com.example.demoWithDocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/teste")
    @ResponseStatus(HttpStatus.OK)
    public String teste() {
        return "teste";
    }
}
