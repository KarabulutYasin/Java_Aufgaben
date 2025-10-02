package de.month_1.fundamentals.day_11.point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point objUnderTest;
    int x = 1;
    int y = 2;

    @BeforeEach
    void setUp() {
        try {
            Constructor<Point>pointConstructor = Point.class.getDeclaredConstructor(int.class, int.class);
            pointConstructor.setAccessible(true);
            objUnderTest = pointConstructor.newInstance(Integer.valueOf(x),Integer.valueOf(y));
        } catch (Exception e) {
            fail("Could not instantiate Point via reflection: " + e.getMessage());
        }
    }

    @Test
    void pointAttributesContainXAndY() {
        try{
            int[] expectedValues = new int[]{x,y};
            String[] expectedFields = new String[]{"x", "y"};
            for (int i = 0; i < expectedValues.length; i++) {
                Field currentField = objUnderTest.getClass().getDeclaredField(expectedFields[i]);
                currentField.setAccessible(true);
                assertEquals(expectedValues[i], (int) currentField.get(objUnderTest));
            }
        }catch (Exception e){
            fail("Could not access field (attribute): " + e.getMessage());
        }
    }

    @Test
    void pointContainsConstructorWithXAndY() {
        assertDoesNotThrow(() -> {
            Constructor<Point> pointConstructor = Point.class.getDeclaredConstructor(int.class, int.class);
            pointConstructor.setAccessible(true);
            Point p = pointConstructor.newInstance(Integer.valueOf(x),Integer.valueOf(y));
        }, "Could not find constructor with two int parameters");
    }

    @Test
    void pointContainsDeclaredMethods() {
        String[] methodNames = {"getX", "getY", "distanceTo", "equals", "toString"};
        Class<?>[] returnTypes = {int.class, int.class, double.class, boolean.class, String.class};
        Class<?>[][] paramTypes = { {}, {}, {Point.class}, {Object.class}, {} };

        for (int i = 0; i < methodNames.length; i++) {
            try {
                Method method = objUnderTest.getClass().getMethod(methodNames[i], paramTypes[i]);
                assertEquals(returnTypes[i], method.getReturnType(),
                        "Method " + methodNames[i] + " does not have the expected return type");
            } catch (NoSuchMethodException e) {
                fail("Method " + methodNames[i] + " is missing");
            }
        }
    }

    @Test
    void equalsWorksForEqualObjects() {
        try {
            Point testPoint1;
            Point testPoint2;

            // Same instance
            testPoint1 = new Point(0,0);
            assertTrue(testPoint1.equals(testPoint1));

            // Wrong dynamic type
            assertFalse(testPoint1.equals(new Object()));

            // Happy path
            testPoint1 = createPoint(1, 2);
            testPoint2 = createPoint(1, 2);
            assertTrue(testPoint1.equals(testPoint2), "Equals does not work for equal objects");

            // Y value different
            testPoint1 = createPoint(0, 10);
            testPoint2 = createPoint(0, 0);
            assertFalse(testPoint1.equals(testPoint2), "Equals does not work for non-equal objects");

            // X value different
            testPoint1 = createPoint(0, 0);
            testPoint2 = createPoint(5, 0);
            assertFalse(testPoint1.equals(testPoint2), "Equals does not work for non-equal objects");

            // X and Y swapped
            testPoint1 = createPoint(2, 1);
            testPoint2 = createPoint(1, 2);
            assertFalse(testPoint1.equals(testPoint2), "Equals does not work for equal objects");

        }catch (Exception e){
            fail("Could not access field (attribute): " + e.getMessage());
        }
    }

    private Point createPoint(int x, int y) {
        try {
            Constructor<Point> pointConstructor = Point.class.getDeclaredConstructor(int.class, int.class);
            pointConstructor.setAccessible(true);
            return pointConstructor.newInstance(Integer.valueOf(x), Integer.valueOf(y));
        } catch (Exception e) {
            fail("Could not create object via int int constructor: " + e.getMessage());
            return null;
        }
    }
}
