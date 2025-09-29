package de.month_1.fundamentals.day_10.modulo;

public class ModMath {

    //TODO
    // Finde heraus was Modulo rechnung ist
    // Finde heraus welche modulo Art Java verwendet
    // Die methode soll a mod m im positiven Bereich zurückgeben
    // Falls m <= 0 soll eine IllegalArgumentException geworfen werden


    public int normalizeMod(int a, int m) {

        return 0;
    }

    //TODO
    // Schreibe eine Methode die Stunden im 12h Format addiert

    // Bsp:
    // addHours12(12, 1) -> 1
    // addHours12(3, -4) -> 11

    public int addHours12(int hour, int delta) {
        return 0;
    }

    public static void main(String[] args) {
        // Hier ist nichts zu bearbeiten
        ModMath modMath = new ModMath();
        String divider = "----------------------";

        System.out.println(divider);
        System.out.println("normalizeMod with parameters 10,4:");
        System.out.println(modMath.normalizeMod(10,4));

        System.out.println(divider);
        System.out.println("addHours12 with parameters 11, 9");
        System.out.println(modMath.addHours12(11,9));

        System.out.println(divider);
    }
}
