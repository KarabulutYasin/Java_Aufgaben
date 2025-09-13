package de.block2.aufgabe5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WrapperTasksTest {

    private final WrapperTasks sut = new WrapperTasks();


    @Test
    void minMax_returnsCorrectValues() {
        double[] mm = sut.minMax(List.of(2.5, -1.0, 7.0));
        assertArrayEquals(new double[]{-1.0, 7.0}, mm, 1e-9);
    }

    @Test
    void minMax_emptyListThrows() {
        assertThrows(IllegalArgumentException.class, () -> sut.minMax(List.of()));
    }

    @Test
    void parseToIntegers_parsesCorrectly() {
        List<Integer> out = sut.parseToIntegers(List.of("10", "20", "30"));
        assertEquals(List.of(10,20,30), out);
    }

    @Test
    void parseToIntegers_invalidNumberThrows() {
        assertThrows(NumberFormatException.class, () -> sut.parseToIntegers(List.of("abc")));
    }
}
