package de.month_1.fundamentals.day_18.AbstractClasses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LebewesenTest {

    private static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of("de.month_1.fundamentals.day_18.abstrakteKlassen.Lebewesen", true,
                        new String[]{"bewegen", "essen", "schlafen"},
                        new Class<?>[]{void.class, void.class, void.class},
                        new Class<?>[][]{new Class<?>[0], new Class<?>[0], new Class<?>[0]}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("methodSource")
    void methods_of_Lebewesen_exists(String className, boolean isAbstract, String[] expectedMethods, Class<?>[] expectedReturnTypes, Class<?>[][] expectedParamTypes) {
        int i = 0;
        try {
            Class<?> clazz = Class.forName(className);

            assertEquals(isAbstract, java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()), className + " should be abstract");

            for (i = 0; i < expectedMethods.length; i++) {
                var method = clazz.getDeclaredMethod(expectedMethods[i], expectedParamTypes[i]);
                assertEquals(expectedReturnTypes[i], method.getReturnType(),
                        "Methode " + expectedMethods[i] + " hat nicht den erwarteten Rückgabetyp");
            }
        } catch (ClassNotFoundException e) {
            fail(className + " not found");
        } catch (NoSuchMethodException e) {
            fail("Methode " + expectedMethods[i] + " fehlt");
        }
    }

    private static Stream<Arguments> fieldSource() {
        return Stream.of(
                Arguments.of("de.month_1.fundamentals.day_18.abstrakteKlassen.Lebewesen", true,
                        new String[]{"name", "alter","gewicht"},
                        new Class<?>[]{String.class, int.class,double.class}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("fieldSource")
    void fields_of_Lebewesen_exists(String className, boolean areProtected, String[] expectedFields, Class<?>[] expectedFieldTypes) {
        int i = 0;
        try {
            Class<?> clazz = Class.forName(className);
            for (i = 0; i < expectedFields.length; i++) {
                var field = clazz.getDeclaredField(expectedFields[i]);
                assertEquals(expectedFieldTypes[i], field.getType(),
                        "Attribut " + expectedFields[i] + " hat nicht den erwarteten Typ");
                assertEquals(areProtected, java.lang.reflect.Modifier.isProtected(field.getModifiers()),
                        "Attribut " + expectedFields[i] + " ist nicht protected");
            }
        } catch (ClassNotFoundException e) {
            fail(className + " not found");
        } catch (NoSuchFieldException e) {
            fail("Attribut " + expectedFields[i] + " fehlt");
        }
    }

    @Test
    void Lebewesen_is_abstract(){
        try {
            Class<?> clazz = Class.forName("de.month_1.fundamentals.day_18.AbstractClasses.Lebewesen");
            assertTrue(java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()), "Lebewesen should be abstract");
        } catch (ClassNotFoundException e) {
            fail("Lebewesen not found");
        }
    }

    @Test
    void bewegen_method_is_abstract() {
        try {
            Class<?> clazz = Class.forName("de.month_1.fundamentals.day_18.AbstractClasses.Lebewesen");
            var method = clazz.getDeclaredMethod("bewegen");
            assertTrue(java.lang.reflect.Modifier.isAbstract(method.getModifiers()), "bewegen method should be abstract");
        } catch (ClassNotFoundException e) {
            fail("Lebewesen not found");
        } catch (NoSuchMethodException e) {
            fail("bewegen method not found");
        }
    }
}