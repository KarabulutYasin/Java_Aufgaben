package de.loesungen6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModMathTest {

    private final ModMath sut = new ModMath();

    @Test
    void normalizeMod_returnsNonNegativeRemainder() {
        assertEquals(2, sut.normalizeMod(14, 12));
        assertEquals(2, sut.normalizeMod(-10, 12)); // -10 ≡ 2 (mod 12)
        assertEquals(0, sut.normalizeMod(24, 12));
    }

    @Test
    void normalizeMod_throwsOnNonPositiveModulus() {
        assertThrows(IllegalArgumentException.class, () -> sut.normalizeMod(5, 0));
        assertThrows(IllegalArgumentException.class, () -> sut.normalizeMod(5, -7));
    }

    @Test
    void addHours12_wrapsAroundCorrectly() {
        assertEquals(1, sut.addHours12(12, 1));     // 12 + 1 -> 1
        assertEquals(12, sut.addHours12(11, 1));    // 11 + 1 -> 12
        assertEquals(11, sut.addHours12(3, -4));    // 3 - 4 -> 11
        assertEquals(3, sut.addHours12(3, 0));      // keine Änderung
    }

    @Test
    void addHours12_normalizesWeirdInputs() {
        // Defensive Normalisierung: auch wenn hour nicht 1..12 ist
        assertEquals(1, sut.addHours12(0, 1));      // behandelt 0 wie 12
        assertEquals(2, sut.addHours12(14, 0));     // 14 -> 2
        assertEquals(7, sut.addHours12(-5, 0));     // -5 -> 7 (entspricht 7 Uhr)
    }
}
