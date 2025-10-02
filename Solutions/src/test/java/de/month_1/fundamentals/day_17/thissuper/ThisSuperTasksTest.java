package de.month_1.fundamentals.day_17.thissuper;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class ThisSuperTasksTest {

    @Test
    void testFieldsExist() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Field x = cls.getDeclaredField("x");
        Field y = cls.getDeclaredField("y");
        assertEquals(int.class, x.getType(), "Field 'x' must be of type int.");
        assertEquals(int.class, y.getType(), "Field 'y' must be of type int.");
        assertTrue(Modifier.isPrivate(x.getModifiers()), "Field 'x' must be private.");
        assertTrue(Modifier.isPrivate(y.getModifiers()), "Field 'y' must be private.");
    }

    @Test
    void testConstructorChainingWithThis() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Object obj = cls.getDeclaredConstructor().newInstance();
        int sum = (int) cls.getDeclaredMethod("sum").invoke(obj);
        assertEquals(3, sum, "Default constructor should initialize via this(1,2) (sum() == 3).");
    }

    @Test
    void testTwoArgConstructorAndSum() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Constructor<?> c = cls.getDeclaredConstructor(int.class, int.class);
        Object obj = c.newInstance(5, 7);
        int sum = (int) cls.getDeclaredMethod("sum").invoke(obj);
        assertEquals(12, sum, "2-arg constructor should set fields correctly (sum() == 12).");
    }

    @Test
    void testFluentAddReturnsThisAndAccumulates() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Object obj = cls.getDeclaredConstructor(int.class, int.class).newInstance(1, 1);

        Object after1 = cls.getDeclaredMethod("add", int.class, int.class).invoke(obj, 2, 3);
        assertSame(obj, after1, "add(...) should return this (Fluent API).");

        Object after2 = cls.getDeclaredMethod("add", int.class, int.class).invoke(obj, 4, 5);
        assertSame(obj, after2, "add(...) should still return this.");

        int sum = (int) cls.getDeclaredMethod("sum").invoke(obj);
        // Start (1,1) + (2,3) + (4,5) => (7,9) => sum=16
        assertEquals(16, sum, "add(...) should accumulate correctly (expected sum() == 16).");
    }
}
