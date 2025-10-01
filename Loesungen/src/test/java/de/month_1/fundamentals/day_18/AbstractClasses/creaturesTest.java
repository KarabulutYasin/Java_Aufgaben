package de.month_1.fundamentals.day_18.AbstractClasses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CreaturesTest {

    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of("de.month_1.fundamentals.day_18.AbstractClasses.Creatures", true,
                        new String[]{"move", "eat", "sleep"},
                        new Class<?>[]{void.class, void.class, void.class},
                        new Class<?>[][]{new Class<?>[0], new Class<?>[0], new Class<?>[0]}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    void methods_of_Creatures_exists(String className, boolean isAbstract, String[] expectedMethods, Class<?>[] expectedReturnTypes, Class<?>[][] expectedParamTypes) {
        int i = 0;
        try {
            Class<?> clazz = Class.forName(className);

            assertEquals(isAbstract, java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()), className + " should be abstract");

            for (i = 0; i < expectedMethods.length; i++) {
                var method = clazz.getDeclaredMethod(expectedMethods[i], expectedParamTypes[i]);
                assertEquals(expectedReturnTypes[i], method.getReturnType(),
                        "Method " + expectedMethods[i] + " does not have the expected return type");
            }
        } catch (ClassNotFoundException e) {
            fail(className + " not found");
        } catch (NoSuchMethodException e) {
            fail("Method " + expectedMethods[i] + " is missing");
        }
    }

    private static Stream<Arguments> fieldSource() {
        return Stream.of(
                Arguments.of("de.month_1.fundamentals.day_18.AbstractClasses.Creatures", true,
                        new String[]{"name", "age", "weight"},
                        new Class<?>[]{String.class, int.class,double.class}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("fieldSource")
    void fields_of_Creatures_exists(String className, boolean areProtected, String[] expectedFields, Class<?>[] expectedFieldTypes) {
        int i = 0;
        try {
            Class<?> clazz = Class.forName(className);
            for (i = 0; i < expectedFields.length; i++) {
                var field = clazz.getDeclaredField(expectedFields[i]);
                assertEquals(expectedFieldTypes[i], field.getType(),
                        "Field " + expectedFields[i] + " does not have the expected type");
                assertEquals(areProtected, java.lang.reflect.Modifier.isProtected(field.getModifiers()),
                        "Field " + expectedFields[i] + " is not protected");
            }
        } catch (ClassNotFoundException e) {
            fail(className + " not found");
        } catch (NoSuchFieldException e) {
            fail("Field " + expectedFields[i] + " is missing");
        }
    }

    @Test
    void Creatures_is_abstract() {
        try {
            Class<?> clazz = Class.forName("de.month_1.fundamentals.day_18.AbstractClasses.Creatures");
            assertTrue(java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()), "Creatures should be abstract");
        } catch (ClassNotFoundException e) {
            fail("Creatures not found");
        }
    }

    @Test
    void move_method_is_abstract() {
        try {
            Class<?> clazz = Class.forName("de.month_1.fundamentals.day_18.AbstractClasses.Creatures");
            var method = clazz.getDeclaredMethod("move");
            assertTrue(java.lang.reflect.Modifier.isAbstract(method.getModifiers()), "move method should be abstract");
        } catch (ClassNotFoundException e) {
            fail("Creatures not found");
        } catch (NoSuchMethodException e) {
            fail("move method not found");
        }
    }
}