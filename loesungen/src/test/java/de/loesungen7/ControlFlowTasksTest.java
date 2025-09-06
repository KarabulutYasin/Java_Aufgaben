package de.loesungen7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowTasksTest {

    private final ControlFlowTasks sut = new ControlFlowTasks();

    // ----- If-Else-Kaskaden -----
    @Test
    void gradeToText_mapsAllKnown() {
        assertEquals("Sehr gut", sut.gradeToText(1));
        assertEquals("Gut", sut.gradeToText(2));
        assertEquals("Befriedigend", sut.gradeToText(3));
        assertEquals("Ausreichend", sut.gradeToText(4));
        assertEquals("Mangelhaft", sut.gradeToText(5));
        assertEquals("Ungueltig", sut.gradeToText(0)); // Stolperfalle: Default-Zweig muss existieren
    }

    // ----- switch -----
    @Test
    void dayType_handlesWeekdayWeekendAndDefault() {
        assertEquals("Werktag", sut.dayType(1));
        assertEquals("Wochenende", sut.dayType(6));
        assertEquals("Ungueltig", sut.dayType(9)); // Stolperfalle: default nicht vergessen
    }

    // ----- Zählschleife (for) -----
    @Test
    void sumOneToN_inclusive() {
        assertEquals(55, sut.sumOneToN(10)); // 1+...+10
        assertEquals(1, sut.sumOneToN(1));
        assertEquals(0, sut.sumOneToN(0));   // leerer Bereich -> 0
        // Stolperfalle: i < n würde 1..n-1 summieren
    }

    // ----- foreach -----
    @Test
    void totalLength_sumsLengthsWithoutModifyingList() {
        assertEquals(5, sut.totalLength(List.of("Hi", "you")));      // 2+3
        assertEquals(3, sut.totalLength(Arrays.asList(null, "hey")));

    }

    @Test
    void removeNegatives_usesIteratorSafely() {
        assertEquals(List.of(1, 2, 3), sut.removeNegatives(List.of(-1, 1, -2, 2, 3)));
        // Stolperfalle: Entfernen in foreach würde ConcurrentModificationException werfen
    }

    // ----- while -----
    @Test
    void doublesUntilAtLeast_countsSteps() {
        assertEquals(0, sut.doublesUntilAtLeast(8, 4));  // schon >= limit
        assertEquals(1, sut.doublesUntilAtLeast(3, 5));  // 3 -> 6
        assertEquals(3, sut.doublesUntilAtLeast(2, 15)); // 2 -> 4 -> 8 -> 16
        // Stolperfalle: x nicht updaten -> Endlosschleife
    }

    // ----- break / continue -----
    @Test
    void firstEven_findsFirstOrMinusOne() {
        assertEquals(4, sut.firstEven(List.of(1, 3, 4, 6)));
        assertEquals(-1, sut.firstEven(List.of(1, 3, 5)));
        // Stolperfalle: break beendet nur innerste Schleife – hier nicht relevant, aber merken!
    }

    @Test
    void sumPositives_skipsNonPositives() {
        assertEquals(6, sut.sumPositives(List.of(-2, 1, 0, 5)));
        // Stolperfalle: Code nach "continue" wird übersprungen -> sum += n MUSS hinter der Bedingung stehen
    }

    // ----- do-while -----
    @Test
    void doAtLeastOnce_runsAtLeastOnce() {
        assertEquals(1, sut.doAtLeastOnce(5, 5)); // obwohl start == limit, läuft 1x
        assertEquals(2, sut.doAtLeastOnce(3, 5)); // 3->4 (1), 4->5 (2)
        // Stolperfalle: do-while läuft mindestens einmal, auch wenn Bedingung initial false
    }

    // ----- Geltungsbereich -----
    @Test
    void blockScopeExample_returnsValueWithoutLeakingTemp() {
        assertEquals(11, sut.blockScopeExample(5)); // (5*2)+1
        // Stolperfalle: "temp" außerhalb des Blocks nicht sichtbar (Compilerfehler, siehe Kommentar in Code)
    }

    @Test
    void shadowingSum_avoidsShadowingBug() {
        assertEquals(5 + (5 + 1), sut.shadowingSum(5));
        // Stolperfalle: keine innere Variable "sum" definieren, sonst Schatten & falsches Ergebnis
    }
}
