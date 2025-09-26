package de.month_1.fundamentals.day_15.vererbung;

public class Hund extends Tier {
    public String art = "Hund"; // Feld-Verdecken (hiding) Demo

    public Hund(String name) {
        super(name);
    }

    @Override
    public String lautGeben() { return "Wuff"; }

    /** Zugriff auf die überschriebene Funktionalität der Basisklasse (super) */
    public String lautMitBasis() {
        return super.basisLaut() + " " + lautGeben();
    }
}
