package dev.alexladeira.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindDigitsTest {
    @Test
    void testFindDigits12() {
        assertEquals(2, FindDigits.findDigits(12));
    }

    @Test
    void testFindDigits1012() {
        assertEquals(3, FindDigits.findDigits(1012));
    }
}
