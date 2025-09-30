package de.month_1.fundamentals.day_15.vererbung;

public class Bird extends Animal implements CanFly {

    public String art = "Vogel";

    public Bird(String name) { super(name); }

    @Override
    public String lautGeben() { return "Piep"; }

    @Override
    public String fliegen() { return getName() + " fliegt"; }
}
