package com.example.controller;

import com.example.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return service.getMessage();
    }

}