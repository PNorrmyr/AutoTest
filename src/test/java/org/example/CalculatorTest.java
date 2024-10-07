package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();

        int result = calc.add(3, 5);

        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();

        int result = calc.subtract(3, 1);

        assertEquals(2, result);

    }

    @Test
    void testMultiply(){
        Calculator calc = new Calculator();

        int result = calc.multiply(2,3);

        assertEquals(6, result);
    }
}