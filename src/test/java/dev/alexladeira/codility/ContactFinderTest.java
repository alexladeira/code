package dev.alexladeira.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContactFinderTest {
    @Test
    void testSolution() {
        assertEquals("pom", ContactFinder.solution(new String[] { "pim", "pom" },
                new String[] { "999999999", "777888999" }, "88999"));
    }

    @Test
    void testSolutionWithMap() {
        assertEquals("pom", ContactFinder.solutionWithMap(new String[] { "pim", "pom" },
                new String[] { "999999999", "777888999" }, "88999"));
    }
}
