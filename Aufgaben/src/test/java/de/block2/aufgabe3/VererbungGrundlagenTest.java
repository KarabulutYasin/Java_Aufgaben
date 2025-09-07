package de.block2.aufgabe3;//package de.block2.aufgabe3;
//
//import org.junit.jupiter.api.Test;
//import java.util.List;
//import static org.junit.jupiter.api.Assertions.*;
//
//class VererbungGrundlagenTest {
//
//    @Test
//    void konstruktor_und_getName() {
//        Hund h = new Hund("Bello");
//        Katze k = new Katze("Minka");
//        assertEquals("Bello", h.getName());
//        assertEquals("Minka", k.getName());
//    }
//
//    @Test
//    void ueberschreiben_lautGeben() {
//        assertEquals("Wuff", new Hund("Bello").lautGeben());
//        assertEquals("Miau", new Katze("Minka").lautGeben());
//        assertEquals("Piep", new Vogel("Spatz").lautGeben());
//    }
//
//    @Test
//    void super_aufruf_in_unterklasse() {
//        Hund h = new Hund("Bello");
//        // enthält Basislaut ("...") + konkreten Laut
//        assertEquals("... Wuff", h.lautMitBasis());
//    }
//
//    @Test
//    void toString_aus_Basisklasse() {
//        assertEquals("Hund: Bello", new Hund("Bello").toString());
//        assertEquals("Katze: Minka", new Katze("Minka").toString());
//    }
//
//    @Test
//    void equals_klasse_und_name() {
//        assertEquals(new Hund("Bello"), new Hund("Bello"));
//        assertNotEquals(new Hund("Bello"), new Katze("Bello")); // andere Klasse
//    }
//
//    @Test
//    void dynamische_bindung_mit_basis_typ() {
//        Tier t = new Hund("Bello"); // statischer Typ: Tier, dynamischer Typ: Hund
//        assertEquals("Wuff", t.lautGeben()); // dynamisch gebunden
//    }
//
//    @Test
//    void feld_verdecken_hiding_demo() {
//        Tier t = new Hund("Bello");
//        Hund h = (Hund) t;
//        assertEquals("Tier", t.art);   // statisch (nach Deklarationstyp)
//        assertEquals("Hund", h.art);   // konkretes Feld der Unterklasse
//    }
//
//    @Test
//    void polymorphie_in_liste() {
//        List<Tier> tiere = List.of(new Hund("Bello"), new Katze("Minka"), new Vogel("Spatz"));
//        assertEquals(List.of("Wuff", "Miau", "Piep"), TierUtils.alleLaute(tiere));
//    }
//
//    @Test
//    void interface_kannFliegen() {
//        Vogel v = new Vogel("Spatz");
//        assertEquals("Spatz fliegt", v.fliegen());
//        assertTrue(v instanceof KannFliegen);
//    }
//
//    @Test
//    void invalid_name_throws() {
//        assertThrows(IllegalArgumentException.class, () -> new Hund(""));
//        assertThrows(IllegalArgumentException.class, () -> new Katze(null));
//    }
//}
