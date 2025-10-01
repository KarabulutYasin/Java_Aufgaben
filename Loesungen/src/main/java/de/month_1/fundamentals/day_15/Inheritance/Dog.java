package de.month_1.fundamentals.day_15.Inheritance;

public class Dog extends Animal {
    public String art = "Hund"; // Feld-Verdecken (hiding) Demo

    public Dog(String name) {
        super(name);
    }

    @Override
    public String lautGeben() { return "Wuff"; }

    /** Zugriff auf die überschriebene Funktionalität der Basisklasse (super) */
    public String lautMitBasis() {
        return super.basisLaut() + " " + lautGeben();
    }
}
