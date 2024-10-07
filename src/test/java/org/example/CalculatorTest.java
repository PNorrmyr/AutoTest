package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();

        int result = calc.add(3, 5);

        assertEquals(8, result);
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();

        int result = calc.subtract(3, 1);

        assertEquals(1, result);

    }
}