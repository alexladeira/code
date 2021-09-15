package dev.alexladeira.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AngryProfessorTest {

    @Test
    void isCancelledYes() {
        assertEquals("YES", AngryProfessor.isCancelled(3, Arrays.asList(-1, -3, 4, 2)));
    }

    @Test
    void isCancelledNo() {
        assertEquals("NO", AngryProfessor.isCancelled(2, Arrays.asList(0, -1, 2, 1)));
    }
}