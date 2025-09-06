package de.loesungen1;

import de.exception.MeinFehlerException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;



import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void begruessung_has_printed_Hello_world(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream orginalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Main main = new Main();
        main.begruessung();

        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("Hello World"));
    }

    @Test
    public void zusammenRechnen_has_add_up(){
        int a = 10;
        int b = 5;
        int result = new Main().zusammenRechnen(a,b);

        assertEquals(a+b,result);
    }

    @Test
    public void kommaZwischen_got_string_with_komma(){
        String w1 = "HI";
        String w2 = "MOIN";

        String result = new Main().kommaZwischen(w1,w2);

        assertEquals(w1+","+w2,result);
    }

    @Test
    public void aufrufBegruessung_called_ZusammenRechnen(){
        Main main = spy(new Main());

        main.aufrufBegruessung();

        verify(main).zusammenRechnen(3, 5);
    }

    @Test
    public void convertToInt_converted_To_Int(){
        String s = "10";
        int result = new Main().convertToInt(s);

        assertEquals(10,result);
    }

    @Test
    public void convertToInt_should_Throws_IllegalArgumentException(){
        assertThrows(MeinFehlerException.class,()->new Main().convertToInt("MOIN"));
    }

    @Test
    public void convertToString_should_return_string_of_value(){
        int i = 10;
        String result = new Main().convertToString(i);
        assertEquals("10",result);
    }

    @ParameterizedTest
    @CsvSource({
            "5,Positiv",
            "-3,Negativ",
            "0,Zero"
    })
    public void returnsPositivNegativOrZero_returnsEachValue(int input,String output){
        assertEquals(output,new Main().returnsPositivNegativOrZero(input));
    }

    @ParameterizedTest
    @CsvSource({
            "false,false",
            "true,true",
            "true,false",
            "false,true"
    })
    public void connectBoolean_shouldReturnGivenParameters(boolean a, boolean b) {

        boolean result = new Main().connectBoolean(a,b);

        assertEquals(a||b,result);
    }

    @Test
    public void flipArray_shouldReturnReversedArray() {
        String[] array = {"A", "B", "C"};
        String[] expected = {"C", "B", "A"};

        String[] result = new Main().flipArray(array);

        assertArrayEquals(expected, result);
    }
}