package dev.alexladeira.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VacationWeekCounterTest {
    @Test
    void testSolution() {
        assertEquals(7, VacationWeekCounter.solution(2014, "April", "May", "Wednesday"));
    }
}
