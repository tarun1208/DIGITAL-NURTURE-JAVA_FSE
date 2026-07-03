package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 20;
        
        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication() {

        // Arrange
        int a = 5;
        int b = 4;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
    }
}