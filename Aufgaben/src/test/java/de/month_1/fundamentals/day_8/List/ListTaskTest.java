package de.month_1.fundamentals.day_8.List;

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

class ListTaskTest {

    ListTask objectUnderTest;

    @BeforeEach
    void setUp(){
        objectUnderTest = new ListTask();
    }

    @Test
    void returnInstanceOfList() {
        assertInstanceOf(List.class, objectUnderTest.returnInstanceOfList());
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
    @MethodSource("removeElementProvider")
    void removeElement(List list, String element, List expected) {
        assertEquals(expected, objectUnderTest.removeElement(list, element));
    }

    private static Stream<Arguments> removeElementProvider() {
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
    @MethodSource("sortListProvider")
    void sortList(List<Integer> list, List<Integer> expected) {
        assertEquals(expected, objectUnderTest.sortList(list));
    }

    private static Stream<Arguments> sortListProvider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(3, 1, 2)), new ArrayList<>(List.of(1, 2, 3))),
                Arguments.of(new ArrayList<>(List.of(10, 5, 7, 3)), new ArrayList<>(List.of(3, 5, 7, 10))),
                Arguments.of(new LinkedList<>(List.of(4, 4, 4)), new LinkedList<>(List.of(4, 4, 4))),
                Arguments.of((Object) null, null)
        );
    }

    @Test
    void main_does_not_throw() {
        assertDoesNotThrow(() -> ListTask.main(new String[]{}));
    }
}