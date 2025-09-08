package de.block2.aufgabe3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HundTest {

    private final String name = "Bello";
    private Hund objUnderTest;

    @BeforeEach
    void setUp() {
        try{
            this.objUnderTest = Hund.class.getDeclaredConstructor(String.class).newInstance(name);
        }catch (Exception e){
            fail("Fehler beim Erzeugen der Test-Instanz: " + e.getMessage());
        }
    }

    @Test
    void Hund_extends_Tier() {
        assertTrue(Tier.class.isAssignableFrom(Hund.class), "Hund erbt nicht von Tier");
    }

    @Test
    void constructor_exists() {
        assertDoesNotThrow(() -> objUnderTest.getClass().getDeclaredConstructor(String.class), "Konstruktor mit (String) Parametern fehlt");
    }

    @Test
    void Hund_contains_declared_methods(){
        Class hundClass = Hund.class;
        String[] methodNames = {"lautGeben", "lautMitBasis"};
        Class<?>[] returnTypes = {String.class, String.class};
        Class<?>[][] paramTypes = { {}, {} };

        for (int i = 0; i < methodNames.length; i++) {
            try {
                var method = hundClass.getMethod(methodNames[i], paramTypes[i]);
                assertEquals(returnTypes[i], method.getReturnType(),
                        "Methode " + methodNames[i] + " hat nicht den erwarteten Rückgabetyp");
            } catch (NoSuchMethodException e) {
                fail("Methode " + methodNames[i] + " fehlt");
            }
        }
    }

    @Test
    void lautGeben_returnsWuff() {
        try {
            assertEquals("Wuff", objUnderTest.getClass().getDeclaredMethod("lautGeben").invoke(objUnderTest), "lautGeben() gibt nicht 'Wuff' zurück");
        } catch (Exception e) {
            fail("Fehler beim Aufruf von lautGeben(): " + e.getMessage());
        }
    }

    @Test
    void constructor_sets_name_of_super_class(){
        try {
            assertEquals(name, Tier.class.getDeclaredMethod("getName").invoke(objUnderTest), "Konstruktor setzt den Namen nicht korrekt");
        } catch (Exception e) {
            fail("Fehler beim Aufruf von getName(): " + e.getMessage());
        }
    }

    @Test
    void lautMitBasis_returnsCorrectString() {
        try{
            assertEquals("... Wuff", objUnderTest.getClass().getMethod("lautMitBasis").invoke(objUnderTest), "lautMitBasis() gibt nicht '... Wuff' zurück");
        }catch (Exception e){
            fail("Fehler beim Aufruf von lautMitBasis(): " + e.getMessage());
        }
    }
}