package de.block2.aufgabe3;

public class Hund extends Tier {
    public String art = "Hund"; // Feld-Verdecken (hiding) Demo

    public Hund(String name) { super(name); }

    @Override
    public String lautGeben() { return "Wuff"; }

    /** Zugriff auf die überschriebene Funktionalität der Basisklasse (super) */
    public String lautMitBasis() {
        return super.basisLaut() + " " + lautGeben();
    }
}
