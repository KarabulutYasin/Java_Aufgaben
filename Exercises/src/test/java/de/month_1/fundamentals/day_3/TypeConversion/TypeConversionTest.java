package de.month_1.fundamentals.day_3.TypeConversion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TypeConversionTest {

    @ParameterizedTest
    @CsvSource({"2","1","-2","0"})
    void convertIntToShort_returns_given_value_as_intToInt(short x){
        assertEquals((int) x, new TypeConversion().convertShortToInt(x));
    }

    @ParameterizedTest
    @CsvSource({"2.5","1","2.9","0"})
    void convertDoubleToInt_returns_given_value_as_int(double x){
        assertEquals((int) x, new TypeConversion().convertDoubleToInt(x));
    }

// src/test/java/de/a/fundamentals/c/typkonversionen/TypkonversionTest.java

    @ParameterizedTest
    @CsvSource({"2","1","-2","0"})
    void convertIntToLong_returns_given_value_as_long(int x){
        assertEquals((long) x, new TypeConversion().convertIntToLong(x));
    }

    @ParameterizedTest
    @CsvSource({"2","1","-2","0"})
    void convertIntToFloat_returns_given_value_as_float(int x){
        assertEquals((float) x, new TypeConversion().convertIntToFloat(x));
    }

    @ParameterizedTest
    @CsvSource({"2.5","1.0","-2.9","0.0"})
    void convertFloatToDouble_returns_given_value_as_double(float x){
        assertEquals((double) x, new TypeConversion().convertFloatToDouble(x));
    }

    @ParameterizedTest
    @CsvSource({"2","127","-128","0"})
    void convertIntToByte_returns_given_value_as_byte(int x){
        assertEquals((byte) x, new TypeConversion().convertIntToByte(x));
    }

    @ParameterizedTest
    @CsvSource({"65","97","48","0"})
    void convertIntToChar_returns_given_value_as_char(int x){
        assertEquals((char) x, new TypeConversion().convertIntToChar(x));
    }

    @Test
    void main_does_not_throw_exception() {
        assertDoesNotThrow(() -> TypeConversion.main(new String[]{}));
    }
}