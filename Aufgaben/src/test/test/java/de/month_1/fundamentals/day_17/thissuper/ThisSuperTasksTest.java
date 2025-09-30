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
        Field a = cls.getDeclaredField("a");
        Field b = cls.getDeclaredField("b");
        assertEquals(int.class, a.getType(), "Feld 'a' muss vom Typ int sein.");
        assertEquals(int.class, b.getType(), "Feld 'b' muss vom Typ int sein.");
        assertTrue(Modifier.isPrivate(a.getModifiers()), "Feld 'a' muss private sein.");
        assertTrue(Modifier.isPrivate(b.getModifiers()), "Feld 'b' muss private sein.");
    }

    @Test
    void testConstructorChainingWithThis() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Object obj = cls.getDeclaredConstructor().newInstance();
        int sum = (int) cls.getDeclaredMethod("sum").invoke(obj);
        assertEquals(3, sum, "Default-Konstruktor sollte via this(1,2) initialisieren (sum() == 3).");
    }

    @Test
    void testTwoArgConstructorAndSum() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Constructor<?> c = cls.getDeclaredConstructor(int.class, int.class);
        Object obj = c.newInstance(5, 7);
        int sum = (int) cls.getDeclaredMethod("sum").invoke(obj);
        assertEquals(12, sum, "2-Arg-Konstruktor sollte Felder korrekt setzen (sum() == 12).");
    }

    @Test
    void testFluentAddReturnsThisAndAccumulates() throws Exception {
        Class<?> cls = Class.forName("de.month_1.fundamentals.day_17.thissuper.ThisSuperTasks");
        Object obj = cls.getDeclaredConstructor(int.class, int.class).newInstance(1, 1);

        Object after1 = cls.getDeclaredMethod("add", int.class, int.class).invoke(obj, 2, 3);
        assertSame(obj, after1, "add(...) sollte this zurückgeben (Fluent API).");

        Object after2 = cls.getDeclaredMethod("add", int.class, int.class).invoke(obj, 4, 5);
        assertSame(obj, after2, "add(...) sollte weiterhin this zurückgeben.");

        int sum = (int) cls.getDeclaredMethod("sum").invoke(obj);
        // Start (1,1) + (2,3) + (4,5) => (7,9) => sum=16
        assertEquals(16, sum, "add(...) sollte korrekt akkumulieren (erwartet sum() == 16).");
    }
}
