package de.month_1.fundamentals.day_15.vererbung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class VogelTest {


    Class vogelClass;
    Class kannFliegenClass;

    @BeforeEach
    void setUpVogelClass() {
        try {
            vogelClass = Class.forName("de.month_1.fundamentals.day_15.vererbung.Vogel");
        } catch (ClassNotFoundException e) {
            fail("Die Klasse Vogel existiert nicht. Hast du sie richtig benannt und im richtigen Package de.month_1.fundamentals.day_15.vererbung erstellt?");
        }
    }

    @BeforeEach
    void setUpInterface() {
        try {
            kannFliegenClass = Class.forName("de.month_1.fundamentals.day_15.vererbung.KannFliegen");
        } catch (ClassNotFoundException e) {
            fail("Das Interface KannFliegen existiert nicht. Hast du es richtig benannt und im richtigen Package de.month_1.fundamentals.day_15.vererbung erstellt?");
        }
    }

    @Test
    void testVogelErbtVonTier() throws Exception {
        assertInstanceOf(
                Tier.class,
                vogelClass.getDeclaredConstructor(String.class).newInstance("Tweety"),
                "Die Klasse Vogel muss von der Klasse Tier erben."
        );
    }

    @Test
    void testVogelImplementiertKannFliegen() {
        // Prüfen, ob das Interface implementiert wird (nicht nur Methode vorhanden)
        assertTrue(
                kannFliegenClass.isAssignableFrom(vogelClass),
                "Die Klasse Vogel muss das Interface KannFliegen implementieren."
        );
        // Optional: Sicherstellen, dass 'KannFliegen' wirklich ein Interface ist
        assertTrue(
                kannFliegenClass.isInterface(),
                "KannFliegen sollte ein Interface sein."
        );
    }

    @Test
    void lautGeben_returns_as_expected() {
        try {
            Object vogel = vogelClass.getDeclaredConstructor(String.class).newInstance("Tweety");
            assertEquals(
                    "Piep",
                    vogelClass.getDeclaredMethod("lautGeben").invoke(vogel),
                    "Die Methode lautGeben() der Klasse Vogel gibt nicht den erwarteten Wert zurück."
            );
        } catch (Exception e) {
            fail("Die Methode lautGeben() der Klasse Vogel konnte nicht aufgerufen werden. Hast du sie richtig benannt und deklariert?");
        }
    }

    @Test
    void fliegen_returns_as_expected() {
        try {
            Object vogel = vogelClass.getDeclaredConstructor(String.class).newInstance("Tweety");
            assertEquals(
                    "Tweety fliegt",
                    vogelClass.getDeclaredMethod("fliegen").invoke(vogel),
                    "Die Methode fliegen() der Klasse Vogel gibt nicht den erwarteten Wert zurück."
            );
        } catch (Exception e) {
            fail("Die Methode fliegen() der Klasse Vogel konnte nicht aufgerufen werden. Hast du sie richtig benannt und deklariert?");
        }
    }
}
