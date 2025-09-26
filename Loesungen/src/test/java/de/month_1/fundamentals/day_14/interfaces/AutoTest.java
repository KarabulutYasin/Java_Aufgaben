package de.month_1.fundamentals.day_14.interfaces;

import de.month_1.fundamentals.day_6.klassen.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    Class autoClass;

    @BeforeEach
    void setup() {
        try {
            autoClass = Class.forName("de.month_1.fundamentals.day_14.interfaces.Auto");
        } catch (ClassNotFoundException e) {
            fail("Auto class not found");
        }
    }

    @Test
    void Auto_is_instance_of_Fahrzeug() {
        assertDoesNotThrow(() -> {
            assertInstanceOf(Fahrzeug.class, autoClass.getDeclaredConstructor().newInstance(), "Auto should implement Fahrzeug interface");
        });
    }

    @ParameterizedTest
    @MethodSource("Test_of_print_method_provider")
    void Test_of_print_method(String methodName, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        try{
            Object object = autoClass.getDeclaredConstructor().newInstance();
            Method method = autoClass.getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(object);
            assertTrue(outContent.toString().contains(expectedOutput),methodName+" doesn't print expected output");
        }catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
           fail(e.getMessage());
        }

    }

    private static Stream<Arguments> Test_of_print_method_provider() {
        return Stream.of(
                Arguments.of("starten", "Auto wird gestartet wrom wrom"),
                Arguments.of("stoppen", "Auto wurde gestoppt")
        );
    }

    @ParameterizedTest
    @CsvSource({"-50", "-100", "-150"})
    void setGeschwindigkeit_with_negative_value_should_throw(int value) {
        assertDoesNotThrow(()->{
            Object object = autoClass.getDeclaredConstructor().newInstance();
            Method method = autoClass.getDeclaredMethod("setGeschwindigkeit",int.class);
            method.setAccessible(true);
            assertThrows(InvocationTargetException.class,()-> method.invoke(object,value),"setGeschwindigkeit should throw IllegalArgumentException when value is negative");
        },"Could not create instance of Auto or access setGeschwindigkeit method");
    }

    @ParameterizedTest
    @CsvSource({"0", "50", "100", "150"})
    void setGeschwindigkeit_and_getGeschwindigkeit_work(int value) {
        assertDoesNotThrow(()->{
            Object object = autoClass.getDeclaredConstructor().newInstance();
            Method setMethod = autoClass.getDeclaredMethod("setGeschwindigkeit",int.class);
            Method getMethod = autoClass.getDeclaredMethod("getGeschwindigkeit");
            setMethod.setAccessible(true);
            getMethod.setAccessible(true);
            setMethod.invoke(object,value);
            assertEquals(value,getMethod.invoke(object),"getGeschwindigkeit doesn't return the value set by setGeschwindigkeit");
        },"Could not create instance of Auto or access setGeschwindigkeit or getGeschwindigkeit method");
    }
}
