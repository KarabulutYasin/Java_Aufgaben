package de.loesungen;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.*;



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

    @Test
    public void has_add_up(){
        int a = 10;
        int b = 5;
        int result = new Main().zusammenRechnen(a,b);

        assertEquals(a+b,result);
    }

    @Test
    public void got_string_with_komma(){
        String w1 = "HI";
        String w2 = "MOIN";

        String result = new Main().kommaZwischen(w1,w2);

        assertEquals(w1+","+w2,result);
    }

    @Test
    public void called_ZusammenRechnen(){
        Main main = spy(new Main());

        main.aufrufBegruessung();

        verify(main).zusammenRechnen(3, 5);
    }


}