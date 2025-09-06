package de.block2.aufgabe4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterDemoTest {

    @BeforeEach
    void reset() {
        // vor jedem Test zurücksetzen, sonst beeinflussen sich die Tests
        CounterDemo.resetCounter();
    }

    @Test
    void zaehltNeuErstellteObjekte() {
        assertEquals(0, CounterDemo.getAnzahlErzeugteObjekte());

        new CounterDemo("A");
        new CounterDemo("B");

        assertEquals(2, CounterDemo.getAnzahlErzeugteObjekte());

        new CounterDemo("C");
        assertEquals(3, CounterDemo.getAnzahlErzeugteObjekte());
    }

    @Test
    void nameWirdGespeichert() {
        CounterDemo a = new CounterDemo("Alpha");
        assertEquals("Alpha", a.getName());
    }

    @Test
    void invalidNameWirftException() {
        assertThrows(IllegalArgumentException.class, () -> new CounterDemo(""));
        assertThrows(IllegalArgumentException.class, () -> new CounterDemo(null));
    }
}
