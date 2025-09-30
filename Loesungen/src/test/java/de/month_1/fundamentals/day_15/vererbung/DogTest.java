package de.month_1.fundamentals.day_15.vererbung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Class hundClass;

    @BeforeEach
    void setUp() {
        try {
            hundClass = Class.forName("de.month_1.fundamentals.day_15.vererbung.Dog");
        }catch (ClassNotFoundException e) {
            fail("Die Klasse Hund existiert nicht. Hast du sie richtig benannt und im richtigen Package de.month_1.fundamentals.day_15.vererbung erstellt?");
        }
    }

    @Test
    void testHundErbtVonTier() throws Exception{
        assertInstanceOf(Animal.class,hundClass.getDeclaredConstructor(String.class).newInstance("Bello"), "Die Klasse Hund muss von der Klasse Tier erben.");
    }

    @Test
    void lautGeben_returns_as_expected(){
        try{
            Object hund = hundClass.getDeclaredConstructor(String.class).newInstance("Bello");
            assertEquals("Wuff", hundClass.getDeclaredMethod("lautGeben").invoke(hund), "Die Methode lautGeben() der Klasse Hund gibt nicht den erwarteten Wert zurück.");
        }catch (Exception e){
            fail("Die Methode lautGeben() der Klasse Hund konnte nicht aufgerufen werden. Hast du sie richtig benannt und deklariert?");
        }
    }

    @Test
    void lautMitBasis(){
        try{
            Object hund = hundClass.getDeclaredConstructor(String.class).newInstance("Bello");
            assertEquals("... Wuff", hundClass.getDeclaredMethod("lautMitBasis").invoke(hund), "Die Methode lautMitBasis() der Klasse Hund gibt nicht den erwarteten Wert zurück.");
        }catch (Exception e){
            fail("Die Methode lautMitBasis() der Klasse Hund konnte nicht aufgerufen werden. Hast du sie richtig benannt und deklariert?");
        }
    }
}