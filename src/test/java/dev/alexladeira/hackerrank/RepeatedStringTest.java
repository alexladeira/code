package dev.alexladeira.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepeatedStringTest {
    @Test
    void testRepeatedString() {
        assertEquals(7L, RepeatedString.repeatedString("aba", 10));
    }
}
