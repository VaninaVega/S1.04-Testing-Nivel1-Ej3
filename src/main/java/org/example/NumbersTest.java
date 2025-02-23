package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {
    @Test
    void testGetNumberInvalidPosition() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Numbers.getNumberByPosition(10);
        });
    }
}
