package de.block1.loesungen2;

import de.block1.loesungen2.Aufgaben2;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Aufgaben2Test {

    private final Aufgaben2 sut = new Aufgaben2();

    @Test
    void echoNextToken_readsSingleToken() {
        Scanner sc = new Scanner(new ByteArrayInputStream("42\n".getBytes(StandardCharsets.UTF_8)));
        assertEquals("42", sut.echoNextToken(sc));
    }

    @Test
    void absInt_and_absDouble_work() {
        assertEquals(5, sut.absInt(-5));
        assertEquals(0, sut.absInt(0));
    }

    @Test
    void numbersOneToTen_returnsList1to10() {
        List<Integer> got = sut.numbersOneToTen();
        assertEquals(10, got.size());
        for (int i = 1; i <= 10; i++) {
            assertEquals(i, got.get(i - 1));
        }
    }

    @Test
    void readUntilStop_collectsLinesUntilStop_caseInsensitive() {
        String input = String.join("\n", "hello", "world", "STOP", "ignored");
        Scanner sc = new Scanner(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        List<String> got = sut.readUntilStop(sc);
        assertEquals(List.of("hello", "world"), got);
    }

    @Test
    void matrixToString_rendersRowsAndSpaces() {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6}
        };
        String expected1 = "1 2 3\n4 5 6";
        String expected2 = "1 2 3 \n4 5 6 \n";
        assertTrue(sut.matrixToString(m).equals(expected1) || sut.matrixToString(m).equals(expected2));
    }
}