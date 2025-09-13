package de.block2.aufgabe3;

public class Vogel extends Tier implements KannFliegen {

    public String art = "Vogel";

    public Vogel(String name) { super(name); }

    @Override
    public String lautGeben() { return "Piep"; }

    @Override
    public String fliegen() { return getName() + " fliegt"; }
}
