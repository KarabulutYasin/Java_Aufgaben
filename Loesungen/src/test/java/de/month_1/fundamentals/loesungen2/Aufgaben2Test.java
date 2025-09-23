package de.month_1.fundamentals.loesungen2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Aufgaben2Test {

    private final Aufgaben2 sut = new Aufgaben2();

    @ParameterizedTest
    @CsvSource({"42", "-7", "0", "-2147483648", "2147483647","Moin","Hi"})
    void echoNextToken_readsSingleToken(String str) {
        Scanner sc = new Scanner(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        assertEquals(str, sut.echoNextToken(sc));
    }

    @ParameterizedTest
    @CsvSource({"5","-2","0"})
    void absInt_gives_back_abs(int x) {
        assertEquals(Math.abs(x),sut.absInt(x));
    }

    @Test
    void numbersOneToTen_returnsList1to10() {
        assertEquals(List.of(1,2,3,4,5,6,7,8,9,10), sut.numbersOneToTen());
    }

    @Test
    void readUntilStop_collectsLinesUntilStop_caseInsensitive() {
        String input = String.join("\n", "hello", "world", "STOP", "ignored");
        Scanner sc = new Scanner(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        List<String> got = sut.readUntilStop(sc);
        assertEquals(List.of("hello", "world"), got);
        if (got.contains("STOP") || got.contains("ignored")) fail("List contains 'STOP' or lines after it");
    }

    @Test
    void matrixToString_rendersRowsAndSpaces() {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6}
        };
        String expected1 = "1 2 3\n4 5 6";
        assertTrue(sut.matrixToString(m).contains(expected1));
    }
}