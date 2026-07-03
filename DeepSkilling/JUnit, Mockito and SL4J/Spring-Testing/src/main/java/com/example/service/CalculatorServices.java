package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServices {

    public int add(int a, int b) {
        return a + b;
    }

}