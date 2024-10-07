package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse() {
        //Given
        StringUtils stringUtils = new StringUtils();
        String string = "Paris";
        StringBuilder sb = new StringBuilder(string);

        //When
        String reversedString = stringUtils.reverse(string);
        String emptyString = stringUtils.reverse("");

        //Then
        assertAll(
                () -> assertEquals(sb.reverse().toString(), reversedString),
                () -> assertEquals("", emptyString),
                () -> assertThrows(IllegalArgumentException.class, () -> {
                    stringUtils.reverse(null);
                }));
    }

    @Test
    void isPalindrome() {
        StringUtils stringUtils = new StringUtils();

        boolean pal = stringUtils.isPalindrome("bob");
        boolean noPal = stringUtils.isPalindrome("lars");

        assertAll(
                () -> assertTrue(pal),
                () -> assertFalse(noPal),
                () -> assertThrows(IllegalArgumentException.class, () -> {
                    stringUtils.isPalindrome(null);
                })
        );

    }
}