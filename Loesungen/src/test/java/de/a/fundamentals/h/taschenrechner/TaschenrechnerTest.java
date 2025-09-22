package de.a.fundamentals.h.taschenrechner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {

    Taschenrechner objectUnderTest;

    @BeforeEach
    void setup(){
        objectUnderTest = new Taschenrechner();
    }

    @ParameterizedTest
    @CsvSource({"10,+,23", "0,+,0", "0,+,2", "1,+,0",})
    void calc_returns_right_value_with_valid_values_and_plus(int x, String rechenzeichen, int y){
        String line = String.join(" ", String.valueOf(x),rechenzeichen,String.valueOf(y));
        Scanner sc = new Scanner(new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8)));
        assertEquals(x+y,objectUnderTest.calc(sc));
    }

    @ParameterizedTest
    @CsvSource({"10,-,23", "0,-,0", "0,-,2", "1,-,0",})
    void calc_returns_right_value_with_valid_values_and_minus(int x, String rechenzeichen, int y){
        String line = String.join(" ", String.valueOf(x),rechenzeichen,String.valueOf(y));
        Scanner sc = new Scanner(new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8)));
        assertEquals(x-y,objectUnderTest.calc(sc));
    }

    @ParameterizedTest
    @CsvSource({"10,*,23", "0,*,0", "0,*,2", "1,*,0",})
    void calc_returns_right_value_with_valid_values_and_mal(int x, String rechenzeichen, int y){
        String line = String.join(" ", String.valueOf(x),rechenzeichen,String.valueOf(y));
        Scanner sc = new Scanner(new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8)));
        assertEquals(x*y,objectUnderTest.calc(sc));
    }

    @ParameterizedTest
    @CsvSource({"10,/,23", "0,/,2",})
    void calc_returns_right_value_with_valid_values_and_geteilt(int x, String rechenzeichen, int y){
        String line = String.join(" ", String.valueOf(x),rechenzeichen,String.valueOf(y));
        Scanner sc = new Scanner(new ByteArrayInputStream(line.getBytes(StandardCharsets.UTF_8)));
        assertEquals(x/y,objectUnderTest.calc(sc));
    }

    @ParameterizedTest
    @CsvSource(value = {
        "''",
        "12 + 23 23",
        "12+ 23",
        "12 +23",
        "12 +",
        "+ 12 ",
        "12 12 2",
        "ed jsa jd"
    },emptyValue = "''")
    void calc_should_throw_with_invalid_input(String input){
        Scanner sc = new Scanner(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        assertThrows(RuntimeException.class,() -> objectUnderTest.calc(sc));
    }
}