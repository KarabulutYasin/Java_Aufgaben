package de.month_1.fundamentals.day_14.interfaces;

public class Car implements Vehicle {

    private int speed;

    @Override
    public void start() {
        System.out.println("Car is starting vroom vroom");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Speed cannot be negative");
        }
        speed = value;
    }

}
