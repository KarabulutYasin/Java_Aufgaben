package de.month_1.fundamentals.day_10.modulo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ModMathTest {

    private final ModMath sut = new ModMath();

    @Test
    void normalizeModulo_returnsNonNegativeRemainder() {
        assertEquals(2, sut.normalizeModulo(14, 12));
        assertEquals(2, sut.normalizeModulo(-10, 12)); // -10 ≡ 2 (mod 12)
        assertEquals(0, sut.normalizeModulo(24, 12));
    }

    @Test
    void normalizeModulo_throwsOnNonPositiveModulus() {
        assertThrows(IllegalArgumentException.class, () -> sut.normalizeModulo(5, 0));
        assertThrows(IllegalArgumentException.class, () -> sut.normalizeModulo(5, -7));
    }

    @Test
    void addHours12_wrapsAroundCorrectly() {
        assertEquals(1, sut.addHours12(12, 1));     // 12 + 1 -> 1
        assertEquals(12, sut.addHours12(11, 1));    // 11 + 1 -> 12
        assertEquals(11, sut.addHours12(3, -4));    // 3 - 4 -> 11
        assertEquals(3, sut.addHours12(3, 0));      // no change
    }

    @Test
    void addHours12_normalizesWeirdInputs() {
        // Defensive normalization: even if hour is not 1..12
        assertEquals(1, sut.addHours12(0, 1));      // treats 0 as 12
        assertEquals(2, sut.addHours12(14, 0));     // 14 -> 2
        assertEquals(7, sut.addHours12(-5, 0));     // -5 -> 7 (equals 7 o'clock)
    }
}
