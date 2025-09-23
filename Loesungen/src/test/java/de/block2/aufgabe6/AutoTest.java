package de.block2.aufgabe6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AutoTest {

    @Test
    void Auto_implements_Fahrzeug() {
        Class autoClass = Auto.class;
        Class fahrzeugInterface = Fahrzeug.class;
        assertTrue(fahrzeugInterface.isAssignableFrom(autoClass),
                "Auto implementiert nicht das Interface Fahrzeug");
    }

    @Test
    void Auto_constructor_exists() {
        Class autoClass = Auto.class;
        try {
            assertNotNull(autoClass.getConstructor(String.class));
        } catch (NoSuchMethodException e) {
            fail("Konstruktor mit String-Parameter fehlt");
        }
    }

    @Test
    void Auto_Declares_All_Methods(){
        Class autoClass = Auto.class;
        String[] methodNames = {"getAnzahlRaeder", "fahren", "getKennzeichen"};
        Class<?>[] returnTypes = {int.class, String.class, String.class};
        Class<?>[][] paramTypes = { {}, {}, {} };

        for (int i = 0; i < methodNames.length; i++) {
            try {
                Method method = autoClass.getMethod(methodNames[i], paramTypes[i]);
                assertEquals(returnTypes[i], method.getReturnType(),
                        "Methode " + methodNames[i] + " hat nicht den erwarteten Rückgabetyp");
            } catch (NoSuchMethodException e) {
                fail("Methode " + methodNames[i] + " fehlt");
            }
        }
    }

    @Test
    void getKennzeichen_exists() {
        Class autoClass = Auto.class;
        try {
            assertNotNull(autoClass.getMethod("getKennzeichen"));
        } catch (NoSuchMethodException e) {
            fail("Methode getKennzeichen() fehlt");
        }
    }
}