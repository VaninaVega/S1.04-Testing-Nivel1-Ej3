package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersTest {
    @Test
    void testGetNumberByPositionValidIndex() {
        assertEquals(20, Numbers.getNumberByPosition(1), "Number in position 1 should be 20.");
    }

    @Test
    void testGetNumberInvalidPosition() {
        boolean exceptionThrown = false;

        try {
            Numbers.getNumberByPosition(10);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptionThrown = true; // If the exception is thrown, we mark it as true
        }
        assertTrue(exceptionThrown, "Expected ArrayIndexOutOfBoundsException to be thrown.");
    }
}

