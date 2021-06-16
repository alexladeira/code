package dev.alexladeira.codility;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class VertexPathTest {
    @Test
    void testSolutionTrue() {
        assertTrue(VertexPath.solution(4, new int[] { 1, 2, 4, 4, 3 }, new int[] { 2, 3, 1, 3, 1 }));
    }

    @Test
    void testSolutionFalse() {
        assertFalse(VertexPath.solution(4, new int[] { 1, 2, 4, 3 }, new int[] { 2, 3, 1, 1 }));
    }
}
