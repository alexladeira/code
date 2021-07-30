package dev.alexladeira.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChocolateFeastTest {
    @Test
    void testChocolateFeast() {
        assertEquals(9, ChocolateFeast.chocolateFeast(15, 3, 2));
    }

    @Test
    void testChocolateFeast2() {
        assertEquals(6, ChocolateFeast.chocolateFeast(10, 2, 5));
    }

    @Test
    void testChocolateFeast3() {
        assertEquals(3, ChocolateFeast.chocolateFeast(12, 4, 4));
    }

    @Test
    void testChocolateFeast4() {
        assertEquals(5, ChocolateFeast.chocolateFeast(6, 2, 2));
    }

    @Test
    void testChocolateFeast5() {
        assertEquals(899, ChocolateFeast.chocolateFeast(43203, 60, 5));
    }

}
