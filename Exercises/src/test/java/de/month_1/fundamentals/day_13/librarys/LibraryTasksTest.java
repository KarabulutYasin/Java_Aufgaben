package de.month_1.fundamentals.day_13.librarys;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

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

    @Test
    void countWords_countsProperly() throws IOException {
        Path temp = Files.createTempFile("words", ".txt");
        Files.write(temp, List.of("Hi you", "How are you"));
        assertEquals(5, sut.countWordsInFile(temp));
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
