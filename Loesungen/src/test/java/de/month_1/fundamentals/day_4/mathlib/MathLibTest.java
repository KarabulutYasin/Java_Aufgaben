package de.month_1.fundamentals.day_4.mathlib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MathLibTest {

    private MathLib objectUnderTest;

    @BeforeEach
    void setup(){
        objectUnderTest = new MathLib();
    }


    @ParameterizedTest
    @CsvSource({"5.25","0","1","-12.3"})
    void sqrt_returnsCorrectResult(double x){
        assertEquals(Math.sqrt(x),objectUnderTest.sqrt(x));
    }

    @ParameterizedTest
    @CsvSource({"5.25,2","0,10","1,20","-12.3,12"})
    void pow_returnsCorrectResult(double x, double y) {
        assertEquals(Math.pow(x,y),objectUnderTest.pow(x,y));
    }


    @ParameterizedTest
    @CsvSource({"5.25","0","1","-12.3"})
    void round_roundsProperly(double x) {
        assertEquals(Math.round(x),objectUnderTest.round(x));
    }

    @ParameterizedTest
    @CsvSource({"5","0","-1","-12"})
    void absInt_returnsNonNegative(int x) {
        assertEquals(Math.abs(x),objectUnderTest.absInt(x));
    }

    @ParameterizedTest
    @CsvSource({"5.25","0","1","-12.3"})
    void sin_returnsExpectedValue(double x) {
        assertEquals(Math.sin(x),objectUnderTest.sin(x));
    }

    @Test
    void random01_inRange() {
        for (int i = 0; i < 1000; i++) {
            double r = objectUnderTest.random01();
            assertTrue(r >= 0.0 && r < 1.0);
        }
    }

    @Test
    void randomInt_inRangeAndInclusive() {
        for (int i = 0; i < 1000; i++) {
            int r = objectUnderTest.randomInt(5, 10);
            assertTrue(r >= 5 && r <= 10);
        }
    }

    @Test
    void randomInt_minGreaterThanMax_throws() {
        assertThrows(IllegalArgumentException.class, () -> objectUnderTest.randomInt(10, 5));
    }

    @Test
    void main_does_not_throw() {
        assertDoesNotThrow(() -> MathLib.main(new String[]{}));
    }
}
