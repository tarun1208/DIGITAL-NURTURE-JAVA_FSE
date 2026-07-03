package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatTest {

    Calculat calculator = new Calculat();

    @Test
    void testAddition() {

        assertEquals(30, calculator.add(10, 20));

    }

}