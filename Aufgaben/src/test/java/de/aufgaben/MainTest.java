package de.aufgaben;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void has_printed_Hello_world(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream orginalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Main main = new Main();
        main.begruessung();

        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("Hello World"));
    }
}