package de.block2.aufgabe1;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

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
        List<String> lines = List.of("Hallo", "Welt");
        sut.writeLinesToFile(lines, temp);
        assertEquals(lines, sut.readLinesFromFile(temp));
    }

    @Test
    void countWords_countsProperly() throws IOException {
        Path temp = Files.createTempFile("words", ".txt");
        Files.write(temp, List.of("Hi du", "Wie gehts"));
        assertEquals(4, sut.countWordsInFile(temp));
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
