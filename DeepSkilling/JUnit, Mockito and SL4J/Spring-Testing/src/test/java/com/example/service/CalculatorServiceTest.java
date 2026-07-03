package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void testAddition() {

        // Create Service Object
        CalculatorService service = new CalculatorService();

        // Call Method
        int result = service.add(10, 20);

        // Verify Result
        assertEquals(30, result);

    }

}