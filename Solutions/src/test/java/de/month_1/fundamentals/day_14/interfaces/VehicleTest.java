package de.month_1.fundamentals.day_14.interfaces;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testFahrzeug(){
        String[] expectedMethods = {"start", "stop", "getSpeed", "setSpeed"};
        Class<?>[] expectedReturnTypes = {void.class, void.class, int.class, void.class};
        Class<?>[][] expectedParamTypes = {new Class<?>[0], new Class<?>[0], new Class<?>[0], {int.class}};
        int i =0;
        try {
            Class<?> clazz = Class.forName("de.month_1.fundamentals.day_14.interfaces.Vehicle");

            assertTrue(clazz.isInterface(), "Vehicle should be an interface");


            for (i = 0; i < expectedMethods.length; i++) {
                    Method method = clazz.getDeclaredMethod(expectedMethods[i],expectedParamTypes[i]);
                    assertEquals(expectedReturnTypes[i], method.getReturnType(),
                            "Methode " + expectedMethods[i] + " does not have the expected return type");
            }
        }catch (ClassNotFoundException e){
            fail("Vehicle interface not found");
        } catch (NoSuchMethodException e) {
            fail("Method " + expectedMethods[i] + " is missing");
        }
    }

}