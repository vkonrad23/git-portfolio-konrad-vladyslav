//This file contains unit tests for the Calculator class using JUnit 5

package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(24, calculator.multiply(4, 6));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    @Test
    void shouldThrowOnDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
