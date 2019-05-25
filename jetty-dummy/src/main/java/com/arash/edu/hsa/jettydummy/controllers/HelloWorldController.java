package com.arash.edu.hsa.jettydummy.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public HttpEntity<String> hello() {
        final String GREETING = "Hello world!";
        return new HttpEntity<>(GREETING);
    }
}
