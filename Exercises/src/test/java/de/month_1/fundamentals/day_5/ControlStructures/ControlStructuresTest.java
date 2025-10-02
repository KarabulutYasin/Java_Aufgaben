package de.month_1.fundamentals.day_5.ControlStructures;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControlStructuresTest {

    private final ControlStructures sut = new ControlStructures();

    @ParameterizedTest
    @CsvSource({"1, Very good", "2, Good", "3, Satisfactory", "4, Sufficient", "5, Poor", "0, Invalid", "6, Invalid", "-1, Invalid"})
    void gradeToText_mapsAllKnown(int grade, String expectedText) {
        assertEquals(expectedText, sut.gradeToText(grade));
    }

    @ParameterizedTest
    @CsvSource({"1, Weekday", "2, Weekday", "3, Weekday", "4, Weekday", "5, Weekday", "6, Weekend", "7, Weekend", "0, Invalid", "8, Invalid"})
    void dayType_handlesWeekdayWeekendAndDefault(int day, String expectedType) {
        assertEquals(expectedType, sut.dayType(day));
    }

    @ParameterizedTest
    @CsvSource({"10, 55", "1, 1", "0, 0", "-5, 0"})
    void sumOneToN_inclusive(int n, int expectedSum) {
        assertEquals(expectedSum, sut.sumOneToN(n));
    }

    @ParameterizedTest
    @MethodSource("provider_totalLength_sumsLengthsWithoutModifyingList")
    void totalLength_sumsLengthsWithoutModifyingList(List list, int expectedLength) {
        assertEquals(expectedLength, sut.totalLength(list));      // 2+3

    }

    private static Stream<Arguments> provider_totalLength_sumsLengthsWithoutModifyingList() {
        return Stream.of(
                Arguments.of(List.of("Hi", "you"), 5),      // 2+3
                Arguments.of(Arrays.asList(null, "hey"), 3), // 0+3
                Arguments.of(List.of(), 0),                   // empty list
                Arguments.of(List.of(""), 0),                 // one empty string
                Arguments.of(Arrays.asList(null, null), 0)    // two nulls
        );
    }


    @ParameterizedTest
    @CsvSource({"8,4,0", "3,5,1", "2,15,3"})
    void doublesUntilAtLeast_countsSteps(int start, int limit, int expectedSteps) {
        assertEquals(expectedSteps, sut.doublesUntilAtLeast(start, limit));
    }

    @ParameterizedTest
    @MethodSource("provider_firstEven_findsFirstOrMinusOne")
    void firstEven_findsFirstOrMinusOne(List input, int expected) {
        assertEquals(expected, sut.firstEven(input));
    }

    private static Stream<Arguments> provider_firstEven_findsFirstOrMinusOne() {
        return Stream.of(
                Arguments.of(List.of(1, 3, 4, 6), 4),
                Arguments.of(List.of(1, 3, 5), -1),
                Arguments.of(List.of(), -1),
                Arguments.of(List.of(2, 4, 6), 2),
                Arguments.of(List.of(1, 3, 5, 8), 8)
        );
    }

    @ParameterizedTest
    @MethodSource("provider_sumPositives_skipsNonPositives")
    void sumPositives_skipsNonPositives(List list, int expectedSum) {
        assertEquals(expectedSum, sut.sumPositives(list));
    }

    private static Stream<Arguments> provider_sumPositives_skipsNonPositives() {
        return Stream.of(
                Arguments.of(List.of(-1, -2, -3), 0),
                Arguments.of(List.of(1, 2, 3), 6),
                Arguments.of(List.of(0, 0, 0), 0),
                Arguments.of(List.of(-1, 2, -3, 4), 6),
                Arguments.of(List.of(), 0)
        );
    }

    @Test
    void main_does_not_throw() {
        ControlStructures.main(new String[]{});
    }
}
