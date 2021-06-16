package dev.alexladeira.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PartitalPhoneNumberTest {
    @Test
    void testSolution10Digits() {
        assertEquals("022-198-53-24", PartitalPhoneNumber.solution("0 - 22 1985--324"));
    }

    @Test
    void testSolution12Digits() {
        assertEquals("004-448-555-583", PartitalPhoneNumber.solution("00-44 48 5555 83"));
    }

    @Test
    void testSolution14Digits() {
        assertEquals("004-448-555-583-61", PartitalPhoneNumber.solution("00-44 48 5555 8361"));
    }

    @Test
    void testSolution19Digits() {
        assertEquals("022-198-532-402-219-85-32", PartitalPhoneNumber.solution("0 - 22 1985--3240 - 22 1985--32"));
    }

}
