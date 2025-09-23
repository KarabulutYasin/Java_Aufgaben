package de.month_1.fundamentals.day_3.typkonversionen;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TypkonversionTest {

    @ParameterizedTest
    @CsvSource({"2","1","-2","0"})
    void convertIntToShort_returns_given_value_as_int(short x){
        assertEquals((int) x, new Typkonversion().convertIntToShort(x));
    }

    @ParameterizedTest
    @CsvSource({"2.5","1","2.9","0"})
    void convertDoubleToInt_returns_given_value_as_int(double x){
        assertEquals((int) x, new Typkonversion().convertDoubleToInt(x));
    }

// src/test/java/de/a/fundamentals/c/typkonversionen/TypkonversionTest.java

    @ParameterizedTest
    @CsvSource({"2","1","-2","0"})
    void convertIntToLong_returns_given_value_as_long(int x){
        assertEquals((long) x, new Typkonversion().convertIntToLong(x));
    }

    @ParameterizedTest
    @CsvSource({"2","1","-2","0"})
    void convertIntToFloat_returns_given_value_as_float(int x){
        assertEquals((float) x, new Typkonversion().convertIntToFloat(x));
    }

    @ParameterizedTest
    @CsvSource({"2.5","1.0","-2.9","0.0"})
    void convertFloatToDouble_returns_given_value_as_double(float x){
        assertEquals((double) x, new Typkonversion().convertFloatToDouble(x));
    }

    @ParameterizedTest
    @CsvSource({"2","127","-128","0"})
    void convertIntToByte_returns_given_value_as_byte(int x){
        assertEquals((byte) x, new Typkonversion().convertIntToByte(x));
    }

    @ParameterizedTest
    @CsvSource({"65","97","48","0"})
    void convertIntToChar_returns_given_value_as_char(int x){
        assertEquals((char) x, new Typkonversion().convertIntToChar(x));
    }


}