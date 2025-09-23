package de.month_1.fundamentals.day_1.lineareProgramme;

import de.month_1.fundamentals.z.exception.MeinFehlerException;
import org.apache.commons.lang3.math.NumberUtils;
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
                MeinFehlerException.class,
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
    @CsvSource({"5,Positiv", "-3,Negativ", "0,Zero"})
    public void returnsPositivNegativOrZero_returnsEachValue(int input,String output){
        assertEquals(output,new LineareProgramme().returnsPositivNegativOrZero(input));
    }

    @ParameterizedTest
    @CsvSource({"false,false", "true,true", "true,false", "false,true"})
    public void connectBoolean_shouldReturnGivenParameters(boolean a, boolean b) {
        assertEquals(a||b,new LineareProgramme().connectBoolean(a,b));
    }

    @ParameterizedTest
    @CsvSource(value = {"'A,B,C','C,B,A'", "'1,2,3','3,2,1'", "'X','X'","'',''"},nullValues = "null",emptyValue = "")
    public void flipArray_shouldReturnReversedArray(String arrayAsString, String expectedAsString) {
        assertArrayEquals(expectedAsString.split(","), new LineareProgramme().flipArray(arrayAsString.split(",")));
    }
}