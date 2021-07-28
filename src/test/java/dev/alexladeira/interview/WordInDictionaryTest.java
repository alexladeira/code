package dev.alexladeira.interview;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class WordInDictionaryTest {
    @Test
    void testContainsAllTrue() {
        assertTrue(WordInDictionary.containsAll("earth wind fire earth wind",
                "earth wind fire bacon ipsum earth bacon ipsum wind"));
    }

    @Test
    void testContainsAllFalse() {
        assertFalse(WordInDictionary.containsAll("earth wind fire earth wind",
                "earth wind bacon ipsum earth bacon ipsum wind"));
    }
}
