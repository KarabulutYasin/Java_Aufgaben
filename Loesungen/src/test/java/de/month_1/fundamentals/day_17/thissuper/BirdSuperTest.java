package de.month_1.fundamentals.day_17.thissuper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BirdSuperTest {

    @Test
    void testSuperConstructorIsUsed() throws Exception {
        Class<?> birdCls = Class.forName("de.month_1.fundamentals.day_17.thissuper.Bird");
        Object b = birdCls.getDeclaredConstructor(String.class).newInstance("Tweety");

        var getName = birdCls.getSuperclass().getDeclaredMethod("getName");
        assertEquals("Tweety", getName.invoke(b), "Bird(String) should call the super constructor with the name.");
    }

    @Test
    void testOverrideSound() throws Exception {
        Class<?> birdCls = Class.forName("de.month_1.fundamentals.day_17.thissuper.Bird");
        Object b = birdCls.getDeclaredConstructor(String.class).newInstance("Tweety");

        var makeSound = birdCls.getDeclaredMethod("makeSound");
        assertEquals("Chirp", makeSound.invoke(b), "Bird.makeSound() should return 'Chirp'.");
    }

    @Test
    void testSuperAndThisCombined() throws Exception {
        Class<?> birdCls = Class.forName("de.month_1.fundamentals.day_17.thissuper.Bird");
        Object b = birdCls.getDeclaredConstructor(String.class).newInstance("Tweety");

        var combo = birdCls.getDeclaredMethod("baseAndOwnSound");
        assertEquals("... Chirp", combo.invoke(b),
                "baseAndOwnSound() should return super.makeSound() + ' ' + this.makeSound() ('... Chirp').");
    }
}