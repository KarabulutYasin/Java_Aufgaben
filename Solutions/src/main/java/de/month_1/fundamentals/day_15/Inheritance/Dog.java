package de.month_1.fundamentals.day_15.Inheritance;

public class Dog extends Animal {
    public String species = "Dog"; // Field hiding demo

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() { return "Woof"; }

    /** Access to the overridden functionality of the base class (super) */
    public String soundWithBase() {
        return super.basicSound() + " " + makeSound();
    }
}
