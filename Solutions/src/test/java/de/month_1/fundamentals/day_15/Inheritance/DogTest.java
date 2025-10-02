package de.month_1.fundamentals.day_15.Inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Class dogClass;

    @BeforeEach
    void setUp() {
        try {
            dogClass = Class.forName("de.month_1.fundamentals.day_15.Inheritance.Dog");
        }catch (ClassNotFoundException e) {
            fail("The class Dog does not exist. Did you name it correctly and put it in the correct package de.month_1.fundamentals.day_15.Inheritance?");
        }
    }

    @Test
    void testDogInheritsFromAnimal() throws Exception {
        assertInstanceOf(Animal.class, dogClass.getDeclaredConstructor(String.class).newInstance("Bello"), "The class Dog must inherit from the class Animal.");
    }

    @Test
    void makeSound_returns_as_expected() {
        try{
            Object dog = dogClass.getDeclaredConstructor(String.class).newInstance("Bello");
            assertEquals("Woof", dogClass.getDeclaredMethod("makeSound").invoke(dog), "The method makeSound() of the class Dog does not return the expected value.");
        }catch (Exception e){
            fail("The method makeSound() of the class Dog could not be called. Did you name and declare it correctly?");
        }
    }

    @Test
    void soundWithBase_returns_as_expected() {
        try{
            Object dog = dogClass.getDeclaredConstructor(String.class).newInstance("Bello");
            assertEquals("... Woof", dogClass.getDeclaredMethod("soundWithBase").invoke(dog), "The method soundWithBase() of the class Dog does not return the expected value.");
        }catch (Exception e){
            fail("The method soundWithBase() of the class Dog could not be called. Did you name and declare it correctly?");
        }
    }
}