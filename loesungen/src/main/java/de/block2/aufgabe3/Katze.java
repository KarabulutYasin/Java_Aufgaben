package de.block2.aufgabe3;

public class Katze extends Tier {
    public Katze(String name) { super(name); }

    @Override
    public String lautGeben() { return "Miau"; }
}
