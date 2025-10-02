package de.month_1.fundamentals.day_16.staticDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StaticDemoTest {

    Class<?> staticDemoClass;

    @BeforeEach
    void setUp() {
        try {
            staticDemoClass = Class.forName("de.month_1.fundamentals.day_16.staticDemo.StaticDemo");
        } catch (ClassNotFoundException e) {
            fail("Die Klasse StaticDemo existiert nicht. Hast du sie richtig benannt und im richtigen Package de.month_1.fundamentals.day_16.staticDemo erstellt?");
        }
    }

    @Test
    void testMyPiExistsAndValue() throws Exception {
        var field = staticDemoClass.getDeclaredField("MY_PI");
        assertTrue(Modifier.isStatic(field.getModifiers()), "MY_PI muss static sein.");
        assertTrue(Modifier.isFinal(field.getModifiers()), "MY_PI muss final sein.");
        assertEquals(3.14159, field.getDouble(null), 1e-9, "MY_PI hat nicht den erwarteten Wert.");
    }

    @Test
    void testGetMyPiReturnsCorrectValue() throws Exception {
        assertEquals(
                3.14159,
                staticDemoClass.getDeclaredMethod("getMyPi").invoke(null),
                "Die Methode getMyPi() gibt nicht den erwarteten Wert zurück."
        );
    }

    @Test
    void testMultiply() throws Exception {
        assertEquals(
                20,
                staticDemoClass.getDeclaredMethod("multiply", int.class, int.class).invoke(null, 4, 5),
                "Die Methode multiply(int, int) liefert nicht das richtige Ergebnis."
        );
    }

    @Test
    void testInstanceCounter() throws Exception {
        // Counter vorher merken
        int before = (int) staticDemoClass.getDeclaredMethod("getInstanceCount").invoke(null);

        // Zwei neue Instanzen erzeugen
        staticDemoClass.getDeclaredConstructor().newInstance();
        staticDemoClass.getDeclaredConstructor().newInstance();

        int after = (int) staticDemoClass.getDeclaredMethod("getInstanceCount").invoke(null);

        assertEquals(
                before + 2,
                after,
                "Der InstanceCounter wurde nicht korrekt hochgezählt."
        );
    }

    @Test
    void testMaxFromList() throws Exception {
        Object result = staticDemoClass
                .getDeclaredMethod("maxFromList", java.util.List.class)
                .invoke(null, Arrays.asList(3, 7, 1, 9, 2));

        assertEquals(9, result, "Die Methode maxFromList() liefert nicht das erwartete Maximum.");
    }

    @Test
    void testMaxFromListThrowsOnEmptyList() throws Exception {
        var method = staticDemoClass.getDeclaredMethod("maxFromList", java.util.List.class);
        assertThrows(
                java.lang.reflect.InvocationTargetException.class,
                () -> method.invoke(null, Arrays.asList()),
                "Die Methode maxFromList() sollte bei leerer Liste eine Exception werfen."
        );
    }

    static Stream<Arguments> maxProvider() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(List.of(1, 2, 3), 3),
                org.junit.jupiter.params.provider.Arguments.of(List.of(10, 5, 7, 2), 10),
                org.junit.jupiter.params.provider.Arguments.of(List.of(-5, -2, -9), -2),
                org.junit.jupiter.params.provider.Arguments.of(List.of(42), 42)
        );
    }

    @ParameterizedTest
    @MethodSource("maxProvider")
    void testGetMaxFromList(List<Integer> input, int expected) {
        try {
            assertEquals(
                    expected,
                    staticDemoClass.getDeclaredMethod("getMaxFromList", List.class).invoke(staticDemoClass.getDeclaredConstructor().newInstance(), input),
                    "Die Methode getMaxFromList() liefert nicht das erwartete Maximum für Eingabe: " + input
            );

        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
