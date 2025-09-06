package de.block1.loesungen5;

import de.block1.loesungen5.MathTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTasksTest {

    private final MathTasks sut = new MathTasks();

    @Test
    void sqrt_returnsCorrectResult() {
        assertEquals(5.0, sut.sqrt(25.0), 1e-9);
    }

    @Test
    void pow_returnsCorrectResult() {
        assertEquals(8.0, sut.pow(2, 3), 1e-9);
        assertEquals(1.0, sut.pow(5, 0), 1e-9);
    }

    @Test
    void round_roundsProperly() {
        assertEquals(3, sut.round(2.6));
        assertEquals(-3, sut.round(-2.6));
    }

    @Test
    void absInt_returnsNonNegative() {
        assertEquals(5, sut.absInt(-5));
        assertEquals(7, sut.absInt(7));
    }

    @Test
    void sin_returnsExpectedValue() {
        double pi = Math.PI;
        assertEquals(0.0, sut.sin(0), 1e-9);
        assertEquals(1.0, sut.sin(pi / 2), 1e-9);
    }

    @Test
    void random01_inRange() {
        for (int i = 0; i < 100; i++) {
            double r = sut.random01();
            assertTrue(r >= 0.0 && r < 1.0);
        }
    }

    @Test
    void randomInt_inRangeAndInclusive() {
        for (int i = 0; i < 100; i++) {
            int r = sut.randomInt(5, 10);
            assertTrue(r >= 5 && r <= 10);
        }
    }

    @Test
    void randomInt_minGreaterThanMax_throws() {
        assertThrows(IllegalArgumentException.class, () -> sut.randomInt(10, 5));
    }
}
