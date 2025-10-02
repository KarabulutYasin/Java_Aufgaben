package de.month_1.fundamentals.day_6.Classes;

import de.month_1.fundamentals.day_6.Classes.exception.EmptyNameException;
import de.month_1.fundamentals.day_6.Classes.exception.AgeNegativeException;

public class Person {
    //TODO
    // Write a class Person which has the attributes name and age
    // Write an all-args constructor
    // Write an AgeNegativeException and throw it if the person is younger than 0 years
    // Write a toString method that outputs as in the following example
    // Write getters and setters
    //TIP: Make sure that a person cannot be younger than 0 years

    // Name: Yasin, Age: 21
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new EmptyNameException("Name must not be empty");
        else this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) throw new AgeNegativeException("Age must not be negative");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}