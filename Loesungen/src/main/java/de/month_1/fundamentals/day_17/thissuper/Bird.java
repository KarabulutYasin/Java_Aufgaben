package de.month_1.fundamentals.day_17.thissuper;

public class Bird extends Animal {

    //TODO
    // Konstruktor Vogel(String name) – rufe den Super-Konstruktor auf

    public Bird(String name) {
         super(name);
    }

    //TODO
    // Überschreibe lautGeben(): gib "Piep" zurück

    @Override
    public String lautGeben() {
         return "Piep";
    }

    //TODO
    // Methode basisUndEigenLaut(): kombiniere super.lautGeben() + " " + this.lautGeben()

    public String basisUndEigenLaut() {
         return super.lautGeben() + " " + this.lautGeben();
    }
}
