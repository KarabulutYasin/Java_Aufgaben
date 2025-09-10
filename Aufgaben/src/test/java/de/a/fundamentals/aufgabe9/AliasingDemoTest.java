package de.a.fundamentals.aufgabe9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class AliasingDemoTest {

    @Test
    void copyArray_createsIndependentArray() {
        AliasingDemo sut = new AliasingDemo();
        int[] a = {1, 2, 3};
        int[] b = sut.copyArray(a);

        b[0] = 99; // ändere nur b

        // a bleibt unverändert -> keine Alias-Problematik
        assertEquals(1, a[0]);
        assertEquals(99, b[0]);
        assertNotSame(a, b); // Referenzen unterschiedlich
    }
}
