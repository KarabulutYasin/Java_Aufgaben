package de.month_1.fundamentals.day_15.vererbung;

import java.util.Objects;

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
        if (o == null || getClass() != o.getClass()) return false; // Schaut nach ob die Klasse gleich ist
        Tier tier = (Tier) o;
        return Objects.equals(name, tier.name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
