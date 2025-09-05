package de.loesungen;

public class ModMath {

    public int normalizeMod(int a, int m) {
        //TODO Finde heraus was Modulu rechnung ist
        //TODO und welche modulo Art es in Java gibt
        //TODO die methode soll a mod m ausgeben im positiven zurückgeben
        //TODO und wenn m <= null eine IllegalArgumentException werfen

        if (m <= 0) throw new IllegalArgumentException("m must be > 0");
        int r = a % m;
        return (r < 0) ? r + m : r;
    }

    /**
     * 12h-Uhrarithmetik: Ergebnis immer im Bereich 1..12.
     * Beispiel: addHours12(12, 1) -> 1 ; addHours12(3, -4) -> 11
     */
    public int addHours12(int hour, int delta) {
        int base = normalizeMod(hour - 1, 12);
        int res0 = normalizeMod(base + delta, 12);
        return res0 + 1;
    }
}
