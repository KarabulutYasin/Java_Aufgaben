package de.month_1.fundamentals.loesungen6;

public class ModMath {

    //TODO
    // Finde heraus was Modulo rechnung ist
    // Finde heraus welche modulo Art Java verwendet
    // Die methode soll a mod m im positiven Bereich zurückgeben
    // Falls m <= 0 soll eine IllegalArgumentException geworfen werden

    public int normalizeMod(int a, int m) {
        if (m <= 0) throw new IllegalArgumentException("m must be > 0");
        int r = a % m;
        return (r < 0) ? r + m : r;
    }

    //TODO
    // Schreibe eine Methode die Stunden im 12h Format addiert

    // Bsp:
    // addHours12(12, 1) -> 1
    // addHours12(3, -4) -> 11

    public int addHours12(int hour, int delta) {
        int base = normalizeMod(hour - 1, 12);
        int res0 = normalizeMod(base + delta, 12);
        return res0 + 1;
    }
}
