package de.loesungen8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test void equality() {
        Point a = new Point(3,4);
        Point b = new Point(3,4);
        assertEquals(a, b);
    }
    @Test void distance_works() {
        Point a = new Point(0,0);
        Point b = new Point(3,4);
        assertEquals(5.0, a.distanceTo(b), 1e-9);
    }
    @Test void toString_format() {
        assertEquals("Point(1,2)", new Point(1,2).toString());
    }
}
