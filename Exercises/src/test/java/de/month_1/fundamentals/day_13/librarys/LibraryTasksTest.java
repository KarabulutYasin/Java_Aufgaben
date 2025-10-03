package de.month_1.fundamentals.day_13.librarys;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTasksTest {

    private final LibraryTasks sut = new LibraryTasks();

    @Test
    void readIntFromScanner_readsCorrectly() {
        Scanner sc = new Scanner("42");
        assertEquals(42, sut.readIntFromScanner(sc));
    }

    @Test
    void writeAndReadLines_roundTrip() throws IOException {
        Path temp = Files.createTempFile("test", ".txt");
        List<String> lines = List.of("Hello", "World");
        sut.writeLinesToFile(lines, temp);
        assertEquals(lines, sut.readLinesFromFile(temp));
    }

    @ParameterizedTest
    @MethodSource("provide_countWords_countsProperly")
    void countWords_countsProperly(List list,int expected) throws IOException {
        Path temp = Files.createTempFile("words", ".txt");
        Files.write(temp, list);
        assertEquals(expected, sut.countWordsInFile(temp));
    }

    private static Stream<Arguments> provide_countWords_countsProperly() {
        return Stream.of(
                Arguments.of(List.of("One two three", "Four five"), 5),
                Arguments.of(List.of("SingleWord"), 1),
                Arguments.of(List.of("   Leading and trailing spaces   "), 4),
                Arguments.of(List.of("", "   ", "\t"), 0),
                Arguments.of(List.of("Multiple    spaces between words"), 4)
        );
    }

    @Test
    void sumIntegerList_sumsCorrectly() {
        assertEquals(6, sut.sumIntegerList(List.of(1, 2, 3)));
    }

    @Test
    void repeatConcat_repeatsString() {
        String expected = "a".repeat(1000000);
        assertEquals("aaaaa", sut.repeatConcat("a", 5));
        assertEquals(expected, sut.repeatConcat("a", 1000000));
        assertEquals("", sut.repeatConcat("x", 0));
    }
}
