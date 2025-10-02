package de.month_1.fundamentals.day_18.AbstractClasses;

public abstract class Creatures {
    protected String name;
    protected int age;
    protected double weight;

    public abstract void move();

    public void eat() {
        System.out.println(name + " eats.");
    }

    public void sleep() {
        System.out.println(name + " sleeps.");
    }
}
