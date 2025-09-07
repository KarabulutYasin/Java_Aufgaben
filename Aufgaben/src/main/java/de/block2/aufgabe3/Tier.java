package de.block2.aufgabe3;

import java.util.Objects;

// Diese Klasse ist Vorgegeben lies sie und versuch sie nachzuvollziehen
public abstract class Tier {
    private final String name;
    public String art = "Tier";

    public Tier(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name");
        this.name = name;
    }

    public String getName() { return name; }

    public String basisLaut() { return "..."; }

    public abstract String lautGeben();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // gleiche konkrete Klasse
        Tier tier = (Tier) o;
        return Objects.equals(name, tier.name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
