package de.month_1.fundamentals.day_8.listaufgaben;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ListAufgabenTest {

    ListAufgaben objectUnderTest;

    @BeforeEach
    void setUp(){
        objectUnderTest = new ListAufgaben();
    }

    @Test
    void returnInstanceOfList() {
        assertInstanceOf(java.util.List.class, objectUnderTest.returnInstanceOfList());
    }

    @Test
    void returnListWithNumbersOneToTen() {
        List expected = new ArrayList(List.of(1,2,3,4,5,6,7,8,9,10));
        assertEquals(expected, objectUnderTest.returnListWithNumbersOneToTen());
    }

    @ParameterizedTest
    @MethodSource("listToStringProvider")
     void listToString(List list) {
        assertEquals(list == null ? "null" : list.toString(), objectUnderTest.listToString(list));
    }
    private static Stream<Arguments> listToStringProvider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1, 2, 3))),
                Arguments.of(new ArrayList<>(List.of(4, 5, 6))),
                Arguments.of(new LinkedList<>(List.of("Moin", "Hallo"))),
                Arguments.of((Object) null)
        );
    }

    @ParameterizedTest
    @MethodSource("entferneElementProvider")
    void entferneElement(List list, String element, List expected) {
        assertEquals(expected, objectUnderTest.entferneElement(list, element));
    }

    private static Stream<Arguments> entferneElementProvider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("A", "B", "C")), "B", new ArrayList<>(List.of("A", "C"))),
                Arguments.of(new ArrayList<>(List.of("1", "2", "3")), "4", new ArrayList<>(List.of("1", "2", "3"))),
                Arguments.of(new LinkedList<>(List.of("X", "Y", "Z")), "X", new LinkedList<>(List.of("Y", "Z"))),
                Arguments.of((Object) null, "Anything", null)
        );
    }

    @ParameterizedTest
    @MethodSource("isElementInListProvider")
    void isElementInList(List list, String element, Boolean expected) {
        assertEquals(expected, objectUnderTest.isElementInList(list, element));
    }

    private static Stream<Arguments> isElementInListProvider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of("A", "B", "C")), "B", true),
                Arguments.of(new ArrayList<>(List.of("1", "2", "3")), "4", false),
                Arguments.of(new LinkedList<>(List.of("X", "Y", "Z")), "X", true),
                Arguments.of((Object) null, "Anything", false)
        );
    }

    @ParameterizedTest
    @MethodSource("sortiereListeProvider")
    void sortiereListe(List<Integer> list, List<Integer> expected) {
        assertEquals(expected, objectUnderTest.sortiereListe(list));
    }

    private static Stream<Arguments> sortiereListeProvider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(3, 1, 2)), new ArrayList<>(List.of(1, 2, 3))),
                Arguments.of(new ArrayList<>(List.of(10, 5, 7, 3)), new ArrayList<>(List.of(3, 5, 7, 10))),
                Arguments.of(new LinkedList<>(List.of(4, 4, 4)), new LinkedList<>(List.of(4, 4, 4))),
                Arguments.of((Object) null, null)
        );
    }
}