package de.block2.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class TierUtils {
    // Nichts zu tun hier
    /** polymorphe Verarbeitung: ruft lautGeben() für alle konkreten Instanzen auf */
    public static List<String> alleLaute(List<Tier> tiere) {
        List<String> out = new ArrayList<>();
        for (Tier t : tiere) out.add(t.lautGeben());
        return out;
    }
}
