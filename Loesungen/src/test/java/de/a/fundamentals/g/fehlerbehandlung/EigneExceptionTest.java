package de.a.fundamentals.g.fehlerbehandlung;

import de.a.fundamentals.g.fehlerbehandlung.exception.NullTeilerException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class EigneExceptionTest {

    EigneException objectUnderTest;

    @BeforeEach
    void setup(){
        objectUnderTest = new EigneException();
    }

    @ParameterizedTest
    @CsvSource({
            "2,1",
            "32,-21",
            "-2323,213",
            "-1232,-213"
    })
    void div_returns_division_if_no_zerodivision(int x, int y){
        assertEquals(x/y,objectUnderTest.div(x,y));
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "12,0",
            "-1,0"
    })
    void div_throws_ZeroDivisionException_if_value_isnt_valid(int x,int y){
        assertThrows(NullTeilerException.class,()->objectUnderTest.div(x,y));
    }
}