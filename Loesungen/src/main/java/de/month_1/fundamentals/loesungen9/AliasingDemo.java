package de.month_1.fundamentals.loesungen9;

import java.util.Arrays;

public class AliasingDemo {

    public int[] copyArray(int[] original) {
        // TODO Gib eine echte Kopie des Arrays zurück
        // Stichwort Aliasing

        return Arrays.copyOf(original, original.length);
    }
}
