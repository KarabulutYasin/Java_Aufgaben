package de.month_1.fundamentals.day_1.lineareProgramme;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class LineareProgrammeTest {

    @Test
    public void begruessung_has_printed_Hello_world(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new LineareProgramme().begruessung();

        assertTrue(outContent.toString().contains("Hello World"),"begruessung doesnt contain Hello World");
    }

    @ParameterizedTest
    @CsvSource({"5,3", "0,0", "-5,5", "-3,-7"})
    public void zusammenRechnen_has_add_up(int x, int y){
        int result = new LineareProgramme().zusammenRechnen(x,y);

        assertEquals(x+y,result,"Result of \"zusammenRechnen\" is not correct \nExpected was: "+ (x + y) +"\nBut was: "+result);
    }

    @ParameterizedTest
    @CsvSource({"HI,MOIN", "A,B", "123,456", "a,''"})
    public void kommaZwischen_got_string_with_komma(String w1, String w2){
       String result =  new LineareProgramme().kommaZwischen(w1,w2);

       assertEquals(w1 + "," + w2 ,result, "Result of \"kommaZwischen\" is not correct \nExpected was: "+ (w1 + "," + w2) +"\nBut was: "+result);
    }

    @Test
    public void aufrufZusammenRechnen_called_ZusammenRechnen(){
        LineareProgramme lineareProgramme = spy(new LineareProgramme());

        lineareProgramme.aufrufZusammenRechnen();

        verify(lineareProgramme).zusammenRechnen(3, 5);
    }

    @ParameterizedTest
    @CsvSource(value = {"10", "-5", "0", "2147483647", "-2147483648", "Moin", "12.34", "abc123","null","''"},emptyValue = "",nullValues = "null")
    public void convertToInt_converted_To_Int_or_throws(String str){
        if (NumberUtils.isParsable(str) && str.matches("-?\\d+")) assertEquals(
                Integer.parseInt(str),
                new LineareProgramme().convertToInt(str),
                "String was not converted correctly");
        else assertThrows(
                RuntimeException.class,
                () -> new LineareProgramme().convertToInt(str),
                "String " + str + " did not throw Exception");
    }

    @ParameterizedTest
    @CsvSource(value = {"10", "-5", "0", "2147483647", "-2147483648"})
    public void convertToString_should_return_string_of_value(int i){
        String result = new LineareProgramme().convertToString(i);

        assertEquals(Integer.toString(i),result,"should return " + i + " as String but was " + result);
    }

    @ParameterizedTest
    @CsvSource({"false,false", "true,true", "true,false", "false,true"})
    public void connectBoolean_shouldReturnGivenParameters(boolean a, boolean b) {
        assertEquals(a||b,new LineareProgramme().connectBoolean(a,b));
    }

    @Test
    public void main_does_not_throw() {
        assertDoesNotThrow(() -> LineareProgramme.main(new String[]{}));
    }
}