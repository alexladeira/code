package dev.alexladeira.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CutTheSticksTest {
    @Test
    void testCutTheSticks() {
        assertEquals(Arrays.asList(6, 4, 2, 1), CutTheSticks.cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8)));
    }
}
