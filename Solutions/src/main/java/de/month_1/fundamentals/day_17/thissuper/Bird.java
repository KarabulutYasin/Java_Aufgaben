package de.month_1.fundamentals.day_17.thissuper;

public class Bird extends Animal {

    //TODO
    // Constructor Bird(String name) – call the super constructor

    public Bird(String name) {
         super(name);
    }

    //TODO
    // Override makeSound(): return "Tweet"

    @Override
    public String makeSound() {
        return "Tweet";
    }

    //TODO
    // Method baseAndOwnSound(): combine super.makeSound() + " " + this.makeSound()

    public String baseAndOwnSound() {
        return super.makeSound() + " " + this.makeSound();
    }
}
