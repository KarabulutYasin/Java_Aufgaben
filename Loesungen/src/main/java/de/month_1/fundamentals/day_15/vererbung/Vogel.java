package de.month_1.fundamentals.day_15.vererbung;

public class Vogel extends Tier implements KannFliegen {

    public String art = "Vogel";

    public Vogel(String name) { super(name); }

    @Override
    public String lautGeben() { return "Piep"; }

    @Override
    public String fliegen() { return getName() + " fliegt"; }
}
