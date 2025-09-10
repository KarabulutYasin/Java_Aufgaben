package de.a.fundamentals.aufgabe4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IOExamplesInputTest {

    @Test
    void readNameAndAge_readsCorrectly() {
        String fakeInput = "Ali\n23\n";
        Scanner sc = new Scanner(new ByteArrayInputStream(fakeInput.getBytes(StandardCharsets.UTF_8)));

        IOExamples sut = new IOExamples();
        String result = sut.readNameAndAge(sc);

        assertEquals("Name: Ali, Alter: 23", result);
    }
}
