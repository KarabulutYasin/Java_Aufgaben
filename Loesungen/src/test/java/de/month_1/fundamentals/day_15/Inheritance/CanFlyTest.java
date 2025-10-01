package de.month_1.fundamentals.day_15.Inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CanFlyTest {

    Class<?> interfaceCanFly;
    @BeforeEach
    void setup() {
        try {
            interfaceCanFly = Class.forName("de.month_1.fundamentals.day_15.Inheritance.CanFly");
        } catch (ClassNotFoundException e) {
            fail("CanFly class not found");
        }
    }

    @Test
    void testCanFlyInterface() {
        assertTrue(interfaceCanFly.isInterface(), "Class \"CanFly\" isn't an interface");
        assertDoesNotThrow(() -> {
            Method flyMethod = interfaceCanFly.getDeclaredMethod("fly");
            assertEquals(String.class, flyMethod.getReturnType(), "Method \"fly\" has wrong return type");
        }, "Method \"fly\" not found");
    }
    }
}