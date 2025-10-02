package de.month_1.fundamentals.day_15.Inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    Class birdClass;
    Class canFlyClass;

    @BeforeEach
    void setUpBirdClass() {
        try {
            birdClass = Class.forName("de.month_1.fundamentals.day_15.Inheritance.Bird");
        } catch (ClassNotFoundException e) {
            fail("The class Bird does not exist. Did you name it correctly and put it in the correct package de.month_1.fundamentals.day_15.Inheritance?");
        }
    }

    @BeforeEach
    void setUpInterface() {
        try {
            canFlyClass = Class.forName("de.month_1.fundamentals.day_15.Inheritance.CanFly");
        } catch (ClassNotFoundException e) {
            fail("The interface CanFly does not exist. Did you name it correctly and put it in the correct package de.month_1.fundamentals.day_15.Inheritance?");
        }
    }

    @Test
    void testBirdExtendsAnimal() throws Exception {
        assertInstanceOf(
                Animal.class,
                birdClass.getDeclaredConstructor(String.class).newInstance("Tweety"),
                "The class Bird must extend the class Animal."
        );
    }

    @Test
    void testBirdImplementsCanFly() {
        // Check if the interface is implemented (not just method present)
        assertTrue(
                canFlyClass.isAssignableFrom(birdClass),
                "The class Bird must implement the interface CanFly."
        );
        // Optional: Ensure 'CanFly' is really an interface
        assertTrue(
                canFlyClass.isInterface(),
                "CanFly should be an interface."
        );
    }

    @Test
    void makeSound_returns_as_expected() {
        try {
            Object bird = birdClass.getDeclaredConstructor(String.class).newInstance("Tweety");
            assertEquals(
                    "Chirp",
                    birdClass.getDeclaredMethod("makeSound").invoke(bird),
                    "The method makeSound() of the class Bird does not return the expected value."
            );
        } catch (Exception e) {
            fail("The method makeSound() of the class Bird could not be called. Did you name and declare it correctly?");
        }
    }

    @Test
    void fly_returns_as_expected() {
        try {
            Object bird = birdClass.getDeclaredConstructor(String.class).newInstance("Tweety");
            assertEquals(
                    "Tweety flies",
                    birdClass.getDeclaredMethod("fly").invoke(bird),
                    "The method fly() of the class Bird does not return the expected value."
            );
        } catch (Exception e) {
            fail("The method fly() of the class Bird could not be called. Did you name and declare it correctly?");
        }
    }
}
