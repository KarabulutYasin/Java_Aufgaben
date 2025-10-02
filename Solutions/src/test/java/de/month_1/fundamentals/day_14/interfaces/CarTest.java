package de.month_1.fundamentals.day_14.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

public class CarTest {

    Class<?> carClass;

    @BeforeEach
    void setup() {
        try {
            carClass = Class.forName("de.month_1.fundamentals.day_14.interfaces.Car");
        } catch (ClassNotFoundException e) {
            fail("Car class not found");
        }
    }

    @Test
    void Car_is_instance_of_Vehicle() {
        assertDoesNotThrow(() -> {
            assertInstanceOf(Class.forName("de.month_1.fundamentals.day_14.interfaces.Vehicle"), carClass.getDeclaredConstructor().newInstance(), "Car should implement Vehicle interface\nIs the Vehicle class in de.month_1.fundamentals.day_14.interfaces.Vehicle?");
        });
    }

    @ParameterizedTest
    @MethodSource("print_method_provider")
    void print_method_test(String methodName, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        try{
            Object object = carClass.getDeclaredConstructor().newInstance();
            Method method = carClass.getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(object);
            assertTrue(outContent.toString().contains(expectedOutput),methodName+" doesn't print expected output");
        }catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
           fail(e.getMessage());
        }
    }

    private static Stream<Arguments> print_method_provider() {
        return Stream.of(
                Arguments.of("start", "Car is starting vroom vroom"),
                Arguments.of("stop", "Car has stopped")
        );
    }

    @ParameterizedTest
    @CsvSource({"-50", "-100", "-150"})
    void setSpeed_with_negative_value_should_throw(int value) {
        assertDoesNotThrow(()->{
            Object object = carClass.getDeclaredConstructor().newInstance();
            Method method = carClass.getDeclaredMethod("setSpeed", int.class);
            method.setAccessible(true);
            assertThrows(InvocationTargetException.class, () -> method.invoke(object, value), "setSpeed should throw IllegalArgumentException when value is negative");
        }, "Could not create instance of Car or access setSpeed method");
    }

    @ParameterizedTest
    @CsvSource({"0", "50", "100", "150"})
    void setSpeed_and_getSpeed_work(int value) {
        assertDoesNotThrow(()->{
            Object object = carClass.getDeclaredConstructor().newInstance();
            Method setMethod = carClass.getDeclaredMethod("setSpeed", int.class);
            Method getMethod = carClass.getDeclaredMethod("getSpeed");
            setMethod.setAccessible(true);
            getMethod.setAccessible(true);
            setMethod.invoke(object,value);
            assertEquals(value, getMethod.invoke(object), "getSpeed doesn't return the value set by setSpeed");
        }, "Could not create instance of Car or access setSpeed or getSpeed method");
    }
}
