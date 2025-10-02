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
            fail("The class StaticDemo does not exist. Did you name it correctly and put it in the correct package de.month_1.fundamentals.day_16.staticDemo?");
        }
    }

    @Test
    void testMyPiExistsAndValue() throws Exception {
        var field = staticDemoClass.getDeclaredField("MY_PI");
        assertTrue(Modifier.isStatic(field.getModifiers()), "MY_PI must be static.");
        assertTrue(Modifier.isFinal(field.getModifiers()), "MY_PI must be final.");
        assertEquals(3.14159, field.getDouble(null), 1e-9, "MY_PI does not have the expected value.");
    }

    @Test
    void testGetMyPiReturnsCorrectValue() throws Exception {
        assertEquals(
                3.14159,
                staticDemoClass.getDeclaredMethod("getMyPi").invoke(null),
                "The method getMyPi() does not return the expected value."
        );
    }

    @Test
    void testMultiply() throws Exception {
        assertEquals(
                20,
                staticDemoClass.getDeclaredMethod("multiply", int.class, int.class).invoke(null, 4, 5),
                "The method multiply(int, int) does not return the correct result."
        );
    }

    @Test
    void testInstanceCounter() throws Exception {
        // Remember counter before
        int before = (int) staticDemoClass.getDeclaredMethod("getInstanceCount").invoke(null);

        // Create two new instances
        staticDemoClass.getDeclaredConstructor().newInstance();
        staticDemoClass.getDeclaredConstructor().newInstance();

        int after = (int) staticDemoClass.getDeclaredMethod("getInstanceCount").invoke(null);

        assertEquals(
                before + 2,
                after,
                "The instanceCounter was not incremented correctly."
        );
    }

    @Test
    void testMaxFromList() throws Exception {
        Object result = staticDemoClass
                .getDeclaredMethod("maxFromList", List.class)
                .invoke(null, Arrays.asList(3, 7, 1, 9, 2));

        assertEquals(9, result, "The method maxFromList() does not return the expected maximum.");
    }

    @Test
    void testMaxFromListThrowsOnEmptyList() throws Exception {
        var method = staticDemoClass.getDeclaredMethod("maxFromList", List.class);
        assertThrows(
                InvocationTargetException.class,
                () -> method.invoke(null, Arrays.asList()),
                "The method maxFromList() should throw an exception for an empty list."
        );
    }

    static Stream<Arguments> maxProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), 3),
                Arguments.of(List.of(10, 5, 7, 2), 10),
                Arguments.of(List.of(-5, -2, -9), -2),
                Arguments.of(List.of(42), 42)
        );
    }

    @ParameterizedTest
    @MethodSource("maxProvider")
    void testGetMaxFromList(List<Integer> input, int expected) {
        try {
            assertEquals(
                    expected,
                    staticDemoClass.getDeclaredMethod("getMaxFromList", List.class).invoke(staticDemoClass.getDeclaredConstructor().newInstance(), input),
                    "The method getMaxFromList() does not return the expected maximum for input: " + input
            );

        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
