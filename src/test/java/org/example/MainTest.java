package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void add_shouldReturn6_when2And2And2AreGiven() {
        // GIVEN
        int a = 2;
        int b = 2;
        int c = 2;
        int expected = 6;

        // WHEN
        int actual = Main.add(a, b, c);

        // THEN
        assertEquals(expected, actual);
    }
}