package de.month_1.fundamentals.day_15.Inheritance;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    public String species = "Animal";

    public Animal(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name");
        this.name = name;
    }

    public String getName() { return name; }

    public String basicSound() { return "..."; }

    public abstract String makeSound();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // Checks if the class is the same
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
