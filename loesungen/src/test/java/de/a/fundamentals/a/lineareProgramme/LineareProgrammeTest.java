package de.a.fundamentals.a.lineareProgramme;

import de.a.fundamentals.exception.MeinFehlerException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;



import static org.junit.jupiter.api.Assertions.*;

public class LineareProgrammeTest {

    @Test
    public void begruessung_has_printed_Hello_world(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new LineareProgramme().begruessung();

        assertTrue(outContent.toString().contains("Hello World"),"begruessung doesnt contain Hello World");
    }

    @Test
    public void zusammenRechnen_has_add_up(){
        int [][] testCases = {{5,3}, {0,0}, {-5,5}, {-3,-7}};
        for (int[] testCase : testCases) {
            int a = testCase[0], b = testCase[1];
            int result = new LineareProgramme().zusammenRechnen(a,b);

            assertEquals(a+b,result,"Result of \"zusammenRechnen\" is not correct \nExpected was: "+ (a+b) +"\nBut was: "+result);
        }
    }

    @Test
    public void kommaZwischen_got_string_with_komma(){
        String[][] testCases = {{"HI","MOIN"},{"A","B"},{"123","456"},{"a",""}};
        for (String[] testCase : testCases) {
            String w1 = testCase[0], w2 = testCase[1];
            String result = new LineareProgramme().kommaZwischen(w1,w2);

            assertEquals(w1+","+w2,result);
        }
    }

    @Test
    public void aufrufZusammenRechnen_called_ZusammenRechnen(){
        LineareProgramme lineareProgramme = spy(new LineareProgramme());

        lineareProgramme.aufrufZusammenRechnen();

        verify(lineareProgramme).zusammenRechnen(3, 5);
    }

    @Test
    public void convertToInt_converted_To_Int_or_throws(){
        String[] testCases = {"0","123","-456","2147483647","-2147483648"};
        for (String s : testCases) {
            int expected = Integer.parseInt(s);
            assertEquals(expected,new LineareProgramme().convertToInt(s),"String was not converted correctly");
        }

        testCases =new String[] {"Moin","12.34","abc123","",null};
        for (String s : testCases) {
            assertThrows(MeinFehlerException.class,()->new LineareProgramme().convertToInt(s),"String "+s+" did not throw Exception");
        }
    }

    @Test
    public void convertToString_should_return_string_of_value(){
        int i = 10;
        String result = new LineareProgramme().convertToString(i);
        assertEquals("10",result);
    }

    @ParameterizedTest
    @CsvSource({
            "5,Positiv",
            "-3,Negativ",
            "0,Zero"
    })
    public void returnsPositivNegativOrZero_returnsEachValue(int input,String output){
        assertEquals(output,new LineareProgramme().returnsPositivNegativOrZero(input));
    }

    @ParameterizedTest
    @CsvSource({
            "false,false",
            "true,true",
            "true,false",
            "false,true"
    })
    public void connectBoolean_shouldReturnGivenParameters(boolean a, boolean b) {

        boolean result = new LineareProgramme().connectBoolean(a,b);

        assertEquals(a||b,result);
    }

    @Test
    public void flipArray_shouldReturnReversedArray() {
        String[] array = {"A", "B", "C"};
        String[] expected = {"C", "B", "A"};

        String[] result = new LineareProgramme().flipArray(array);

        assertArrayEquals(expected, result);
    }
}