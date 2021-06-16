package dev.alexladeira.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmallestPositiveIntegerTest {
    @Test
    void testSolution() {
        assertEquals(5, SmallestPositiveInteger.solution(new int[] { 1, 2, 3, 6, 4, 1 }));
    }
}
