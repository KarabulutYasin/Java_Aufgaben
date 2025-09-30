package de.month_1.fundamentals.day_15.vererbung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class KannFliegenTest {

    Class<?> interfaceKannFliegen;

    @BeforeEach
    void setup() {
        try {
            interfaceKannFliegen = Class.forName("de.month_1.fundamentals.day_15.vererbung.KannFliegen");
        } catch (ClassNotFoundException e) {
            fail("Vogel class not found");
        }
    }

    @Test
    void testKannFliegenInterface() {
        assertTrue(interfaceKannFliegen.isInterface(), "Class \"KannFliegen\" isn't an interface");
        assertDoesNotThrow(() -> {
            Method fliegenMethod = interfaceKannFliegen.getDeclaredMethod("fliegen");
            assertEquals(String.class, fliegenMethod.getReturnType(), "Method \"fliegen\" has wrong return type");
        }, "Method \"fliegen\" not found");
    }
}