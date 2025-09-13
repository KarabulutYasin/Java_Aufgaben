package de.a.fundamentals.loesungen8;

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
    void Point_attributes_contains_x_and_y() {
        try{
            int[] expectedValues = new int[]{x,y};
            String[] expectedFields = new String[]{"x", "y"};
            for (int i = 0; i < expectedValues.length; i++) {
                Field currentField = objUnderTest.getClass().getDeclaredField(expectedFields[i]);
                currentField.setAccessible(true);
                assertEquals(expectedValues[i], (int) currentField.get(objUnderTest));
            }
        }catch (Exception e){
            fail("Could not access field (Attribut): " + e.getMessage());
        }
    }

    @Test
    void Point_contains_constructor_with_x_and_y() {
        assertDoesNotThrow(() -> {
            Constructor<Point> pointConstructor = Point.class.getDeclaredConstructor(int.class, int.class);
            pointConstructor.setAccessible(true);
            Point p = pointConstructor.newInstance(Integer.valueOf(x),Integer.valueOf(y));
        }, "Could not find constructor with two int parameters");
    }

    @Test
    void Point_contains_declared_methods(){
        String[] methodNames = {"getX", "getY", "distanceTo", "equals", "toString"};
        Class<?>[] returnTypes = {int.class, int.class, double.class, boolean.class, String.class};
        Class<?>[][] paramTypes = { {}, {}, {Point.class}, {Object.class}, {} };

        for (int i = 0; i < methodNames.length; i++) {
            try {
                Method method = objUnderTest.getClass().getMethod(methodNames[i], paramTypes[i]);
                assertEquals(returnTypes[i], method.getReturnType(),
                        "Methode " + methodNames[i] + " hat nicht den erwarteten Rückgabetyp");
            } catch (NoSuchMethodException e) {
                fail("Methode " + methodNames[i] + " fehlt");
            }
        }
    }

//    @Test
//    void Distance_works_how_it_should(){
//        List<Point> point1Liste = Arrays.asList(
//                CreatePoint(1,1),
//                CreatePoint(2,0),
//                CreatePoint(0,2),
//                CreatePoint(4,4)
//        );
//        List<Point> point2Liste = Arrays.asList(
//                CreatePoint(1,1), // Kein Abstand
//                CreatePoint(0,2), // Hinrichtung
//                CreatePoint(2,0), // Rückrichtung
//                CreatePoint(2,2) // Erweiterung
//
//        );
//    }

    @Test
    void Equals_works_for_equal_objects() {
        try {
            Point testPoint1;
            Point testPoint2;

            //Gleiche Instanz
            testPoint1 = new Point(0,0);
            assertTrue(testPoint1.equals(testPoint1));

            //Falsche Dynamischer Datentyp
            assertFalse(testPoint1.equals(new Object()));

            //Happy Day
            testPoint1 = CreatePoint(1,2);
            testPoint2 = CreatePoint(1,2);
            assertTrue(testPoint1.equals(testPoint2), "Equals does not work for equal objects");

            // Y Wert Unterschiedlich
            testPoint1 = CreatePoint(0,10);
            testPoint2 = CreatePoint(0,0);
            assertFalse(testPoint1.equals(testPoint2), "Equals does not work for non-equal objects");

            // X Wert Unterschiedlich
            testPoint1 = CreatePoint(0,0);
            testPoint2 = CreatePoint(5,0);
            assertFalse(testPoint1.equals(testPoint2), "Equals does not work for non-equal objects");

            //X und Y Vertauscht
            testPoint1 = CreatePoint(2,1);
            testPoint2 = CreatePoint(1,2);
            assertFalse(testPoint1.equals(testPoint2), "Equals does not work for equal objects");

        }catch (Exception e){
            fail("Could not access field (Attribut): " + e.getMessage());
        }

    }

    private Point CreatePoint(int x, int y) {
        try {
            Constructor<Point> pointConstructor = Point.class.getDeclaredConstructor(int.class, int.class);
            pointConstructor.setAccessible(true);
            return pointConstructor.newInstance(Integer.valueOf(x), Integer.valueOf(y));
        } catch (Exception e) {
            fail("Could not create Object via int int Constructor" + e.getMessage());
            return null;
        }

//    @Test void equality() {
//        Point a = new Point(3,4);
//        Point b = new Point(3,4);
//        assertEquals(a, b);
//    }
//    @Test void distance_works() {
//        Point a = new Point(0,0);
//        Point b = new Point(3,4);
//        assertEquals(5.0, a.distanceTo(b), 1e-9);
//    }
//    @Test void toString_format() {
//        assertEquals("Point(1,2)", new Point(1,2).toString());
//    }
    }
}
