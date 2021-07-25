package dev.alexladeira.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LibraryFineTest {
    @Test
    void testFine() {
        assertEquals(135, LibraryFine.fine(14, 7, 2018, 5, 7, 2018));
    }

    @Test
    void testFineSecondCase() {
        assertEquals(45, LibraryFine.fine(9, 6, 2015, 6, 6, 2015));
    }

    @Test
    void testFineSixMonthsInterval() {
        assertEquals(3000, LibraryFine.fine(2, 7, 1014, 1, 1, 1014));
    }

    @Test
    void testFineThreeMonthsInterval() {
        assertEquals(1500, LibraryFine.fine(5, 5, 2014, 23, 2, 2014));
    }

    @Test
    void testFineSevenMonthsInterval() {
        assertEquals(3500, LibraryFine.fine(31, 8, 2004, 20, 1, 2004));
    }
}
