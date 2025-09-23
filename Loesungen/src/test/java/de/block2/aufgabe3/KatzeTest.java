package de.block2.aufgabe3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class KatzeTest {
    Katze objUnderTest;

    @BeforeEach
    void setup() {
        try {
            objUnderTest = Katze.class.getDeclaredConstructor(String.class).newInstance("Miezi");
        }catch (Exception e){
            fail("Konstruktor existiert nicht oder ist nicht sichtbar: " + e.getMessage());
        }
    }

    @Test
    void Katze_implements_Tier(){
        assertTrue(Tier.class.isAssignableFrom(objUnderTest.getClass()), "Katze erbt nicht von Tier");
    }

    @Test
    void Katze_constructor_exists() {
        assertDoesNotThrow(() -> objUnderTest.getClass().getConstructor(String.class), "Konstruktor mit String-Parameter fehlt");
    }

    @Test
    void Katze_contains_method_lautGeben() {
        assertDoesNotThrow(() -> objUnderTest.getClass().getMethod("lautGeben"), "Methode lautGeben() fehlt");
    }

    @Test
    void lautGeben_returnsMiau() {
        try{
            assertEquals("Miau", objUnderTest.getClass().getMethod("lautGeben").invoke(objUnderTest), "lautGeben() gibt nicht 'Miau' zurück");
        }catch (Exception e){
            fail("Fehler beim Testen der Methode lautGeben: " + e.getMessage());
        }
    }
}