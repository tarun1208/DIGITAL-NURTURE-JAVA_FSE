package com.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceIntegrationTest {

    @Autowired
    private CalculatorServices calculatorServices;

    @Test
    void testAddition() {

        int result = calculatorServices.add(15, 25);

        assertEquals(40, result);

    }

}