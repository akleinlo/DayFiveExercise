package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void add_shouldReturn4_when2And2AreGiven() {
        // GIVEN
        int a = 2;
        int b = 2;
        int expected = 4;

        // WHEN
        int actual = Main.add(a, b);

        // THEN
        assertEquals(expected, actual);
    }
}