package de.month_1.fundamentals.day_15.Inheritance;

public class Bird extends Animal implements CanFly {

    public String species = "Bird";

    public Bird(String name) { super(name); }

    @Override
    public String makeSound() { return "Chirp"; }

    @Override
    public String fly() { return getName() + " flies"; }
}
