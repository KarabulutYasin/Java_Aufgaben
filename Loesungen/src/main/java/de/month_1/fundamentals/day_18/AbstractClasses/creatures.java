package de.month_1.fundamentals.day_18.AbstractClasses;

public abstract class creatures {
    protected String name;
    protected int alter;
    protected double gewicht;

    public abstract void bewegen();

    public void essen() {
        System.out.println(name + " isst.");
    }

    public void schlafen() {
        System.out.println(name + " schläft.");
    }
}
