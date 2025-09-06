package de.loesungen10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTasksTest {

    private final ArrayTasks sut = new ArrayTasks();

    // --- 3.4.1 Grundfunktionen ---
    @Test
    void sum_basicAndEdgeCases() {
        assertEquals(6, sut.sum(new int[]{1, 2, 3}));
        assertEquals(0, sut.sum(new int[]{}));
        assertEquals(-3, sut.sum(new int[]{-1, -2, 0}));
        assertThrows(IllegalArgumentException.class, () -> sut.sum(null)); // Stolperfalle: null
    }

    // --- 3.4.2 Felder kopieren ---
    @Test
    void copyDoubled_returnsNewArrayAndOriginalUnchanged() {
        int[] a = {1, 2, 3};
        int[] b = sut.copyDoubled(a);
        assertArrayEquals(new int[]{2, 4, 6}, b);
        assertArrayEquals(new int[]{1, 2, 3}, a); // Original bleibt unverändert
        assertNotSame(a, b); // echte Kopie, kein Aliasing
        assertThrows(IllegalArgumentException.class, () -> sut.copyDoubled(null));
    }

    // --- 3.4.3 foreach / enthält ---
    @Test
    void contains_findsTargets() {
        int[] a = {5, 9, -2, 9};
        assertTrue(sut.contains(a, 9));
        assertTrue(sut.contains(a, -2));
        assertFalse(sut.contains(a, 7));
        assertThrows(IllegalArgumentException.class, () -> sut.contains(null, 1));
    }

    // --- 3.4.4 Ausgabe ---
    @Test
    void joinWithDash_formatsNicely() {
        assertEquals("1-2-3", sut.joinWithDash(new int[]{1, 2, 3}));
        assertEquals("", sut.joinWithDash(new int[]{}));
        assertEquals("42", sut.joinWithDash(new int[]{42}));
        assertThrows(IllegalArgumentException.class, () -> sut.joinWithDash(null));
    }

    // --- 3.4.5 Mehrdimensionale Arrays: Summe ---
    @Test
    void sum2D_accumulatesAllCells() {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertEquals(21, sut.sum2D(m));
    }

    @Test
    void sum2D_handlesEmptyRowsAndValidatesNullRows() {
        int[][] mEmpty = new int[][] { };
        assertEquals(0, sut.sum2D(mEmpty)); // keine Zeilen -> Summe 0

        int[][] withEmptyRow = new int[][] { {}, {1, 2} };
        assertEquals(3, sut.sum2D(withEmptyRow));

        int[][] withNullRow = new int[][] { null };
        assertThrows(IllegalArgumentException.class, () -> sut.sum2D(withNullRow)); // Stolperfalle: null-Zeile
        assertThrows(IllegalArgumentException.class, () -> sut.sum2D(null));        // Stolperfalle: matrix null
    }
}
