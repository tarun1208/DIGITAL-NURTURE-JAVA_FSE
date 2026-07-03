package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Welcome to Spring Testing";
    }

}