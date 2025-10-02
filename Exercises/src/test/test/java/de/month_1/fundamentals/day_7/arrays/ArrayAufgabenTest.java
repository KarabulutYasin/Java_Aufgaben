package de.month_1.fundamentals.day_7.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAufgabenTest {
    private final ArrayAufgaben sut = new ArrayAufgaben();

    @ParameterizedTest
    @MethodSource("provide_createSequence_createsCorrectSequence")
    void createSequence_createsCorrectSequence(int i, int[] expected) {
        assertArrayEquals(expected, sut.createSequence(i));
    }

    private static Stream<Arguments> provide_createSequence_createsCorrectSequence(){
        return Stream.of(
                Arguments.of(5, new int[]{1, 2, 3, 4, 5}),
                Arguments.of(1, new int[]{1}),
                Arguments.of(0, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provide_findMax_findsLargestValue")
    void findMax_findsLargestValue(int[] input, int expected) {
        assertEquals(expected, sut.findMax(input));
    }

    private static Stream<Arguments> provide_findMax_findsLargestValue(){
        return Stream.of(
                Arguments.of(new int[]{3, 7, 2, 9, 1}, 9),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-5, -2, -10, -1}, -1)
        );
    }

    @Test
    void findMax_findsLargestValue_with_empty_array() {
        assertThrows(IllegalArgumentException.class, () -> sut.findMax(new int[]{}));
    }

    @ParameterizedTest
    @CsvSource({"30,2", "10,0", "50,4", "100,-1"})
    void indexOf_findsCorrectIndex(int value, int expectedIndex) {
        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(expectedIndex, sut.indexOf(numbers, value));
    }

    @ParameterizedTest
    @MethodSource("provide_sum_calculatesCorrectTotal")
    void sum_calculatesCorrectTotal(int[] input, int expected) {
        assertEquals(expected, sut.sum(input));
    }

    private static Stream<Arguments> provide_sum_calculatesCorrectTotal() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 15),
                Arguments.of(new int[]{-5, 2, 3}, 0),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{42}, 42)
        );
    }

    @ParameterizedTest
    @CsvSource({"3.0,'1,2,3,4,5'", "1.0,'-2,0,4'", "42.0,'42'", "2.5,'1,2,3,4'"})
    void average_calculatesCorrectMean(double expected, String numbersStr) {
        int[] numbers = parseNumbers(numbersStr);
        assertEquals(expected, sut.average(numbers), 0.4);
    }

    @Test
    void average_throwsForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> sut.average(new int[]{}));
    }

    @ParameterizedTest
    @CsvSource({"2,3", "1,1", "10,0"})
    void countOccurrences_countsCorrectly(int value, int expectedCount) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        assertEquals(expectedCount, sut.countOccurrences(numbers, value));
    }

    @ParameterizedTest
    @MethodSource("provide_reverse_reversesInPlace")
    void reverse_reversesInPlace(int[] input, int[] expected) {
        sut.reverse(input);
        assertArrayEquals(expected, input);
    }

    private static Stream<Arguments> provide_reverse_reversesInPlace() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{4, 3, 2, 1}),
                Arguments.of(new int[]{42}, new int[]{42})
        );
    }

    @ParameterizedTest
    @MethodSource("provide_multiplyBy_modifiesArrayInPlace")
    void multiplyBy_modifiesArrayInPlace(int[] input, int factor, int[] expected) {
        sut.multiplyBy(input, factor);
        assertArrayEquals(expected, input);
    }

    private static Stream<Arguments> provide_multiplyBy_modifiesArrayInPlace() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 2, new int[]{2, 4, 6}),
                Arguments.of(new int[]{0, -1, -2}, -1, new int[]{0, 1, 2}),
                Arguments.of(new int[]{5}, 0, new int[]{0})
        );
    }

    // ----- Filterung -----
    @ParameterizedTest
    @MethodSource("provide_filterEven_returnsOnlyEvenNumbers")
    void filterEven_returnsOnlyEvenNumbers(int[] input, int[] expected) {
        assertArrayEquals(expected, sut.filterEven(input));
    }

    private static Stream<Arguments> provide_filterEven_returnsOnlyEvenNumbers() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 4, 6}),
                Arguments.of(new int[]{1, 3, 5, 7}, new int[]{}),
                Arguments.of(new int[]{2, 4, 6, 8}, new int[]{2, 4, 6, 8}),
                Arguments.of(new int[]{0, 1, 2}, new int[]{0, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("provide_isSorted_checksAscendingOrder")
    void isSorted_checksAscendingOrder(int[] input, boolean expected) {
        assertEquals(expected, sut.isSorted(input), "should be " + expected + " for input " + Arrays.toString(input));
    }

    private static Stream<Arguments> provide_isSorted_checksAscendingOrder() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, true),
                Arguments.of(new int[]{1, 3, 2, 4, 5}, false),
                Arguments.of(new int[]{2, 2, 2, 2}, true), // gleiche Werte sind erlaubt
                Arguments.of(new int[]{5}, true),
                Arguments.of(new int[]{}, true),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, false) // absteigend ist nicht sortiert
        );
    }

    @ParameterizedTest
    @MethodSource("provide_concatenate_joinsArrays")
    void concatenate_joinsArrays(int[] first, int[] second, int[] expected) {
        assertArrayEquals(expected, sut.concatenate(first, second));
    }

    private static Stream<Arguments> provide_concatenate_joinsArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, new int[]{1, 2, 3, 4}),
                Arguments.of(new int[]{}, new int[]{1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2}, new int[]{}, new int[]{1, 2}),
                Arguments.of(new int[]{}, new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provide_removeDuplicates_keepsFirstOccurrence")
    void removeDuplicates_keepsFirstOccurrence(int[] input, int[] expected) {
        assertArrayEquals(expected, sut.removeDuplicates(input));
    }

    private static Stream<Arguments> provide_removeDuplicates_keepsFirstOccurrence() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 3, 1, 4}, new int[]{1, 2, 3, 4}),
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}),
                Arguments.of(new int[]{5, 5, 5, 5}, new int[]{5}),
                Arguments.of(new int[]{42}, new int[]{42}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{0, 1, 0, 2}, new int[]{0, 1, 2})
        );
    }

    // ----- Hilfsmethode -----
    private int[] parseNumbers(String numbersStr) {
        String[] parts = numbersStr.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }

    @Test
    void main_does_not_throw() {
        assertDoesNotThrow(() -> ArrayAufgaben.main(new String[]{}));
    }
}