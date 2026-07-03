package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorExceptionTest {

    Calculator calculator = new Calculator();

    @Test
    void testDivideByZero() {

        ArithmeticException exception =
                assertThrows(ArithmeticException.class,
                        () -> calculator.divide(10, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());

    }

}