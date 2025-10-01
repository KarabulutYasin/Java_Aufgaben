package de.month_1.fundamentals.day_12.CustomException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class OwnExceptionTest {

    OwnException objectUnderTest;

    @BeforeEach
    void setup(){
        objectUnderTest = new OwnException();
    }

    @Test
    void throwsRuntimeException_throws_RuntimeException(){
        assertThrows(RuntimeException.class,() -> objectUnderTest.throwsRuntimeException(),"Should throw instance of RuntimeException but didn't");
    }

    @Test
    void throwsExceptionButNotRuntimeException_should_throw_Exception_but_not_RuntimeException(){
        assertThrows(Exception.class,()-> objectUnderTest.throwsExceptionButNotRuntimeException(),"Should throw RuntimeException but didn't");
        try {
            objectUnderTest.throwsExceptionButNotRuntimeException();
        }catch (Exception e){
            assertFalse(e instanceof RuntimeException,"Should throw Exception which isn't instance of RuntimeException \nbut threw instance of RuntimeException");
        }
    }

    @Test
    void throwsOwnException(){
        try {
            Class clazz = Class.forName("de.month_1.fundamentals.day_12.CustomException.exception.OwnException");
            assertThrows(clazz, () -> objectUnderTest.throwsOwnException(),"OwnException was not thrown");
        }catch (ClassNotFoundException e){
            fail("OwnRuntimeException class was not found");
        }
    }

    @Test
    void throwsOwnRuntimeException(){
        try {
            Class clazz = Class.forName("de.month_1.fundamentals.day_12.CustomException.exception.OwnRuntimeException");
            assertThrows(clazz,() -> objectUnderTest.throwsOwnRuntimeException(),"OwnRuntimeException was not thrown");
        }catch (ClassNotFoundException e){
            fail("OwnRuntimeException class was not found");
        }
    }

    @ParameterizedTest
    @CsvSource({"10,2", "10,10"})
    void div_with_valid_input_returns_result(int x,int y){
        assertEquals(x/y,objectUnderTest.div(x,y),"The division was not returned");
    }

    @ParameterizedTest
    @CsvSource({
            "12,0",
            "-2,0",
            "0,0"
    })
    void div_with_invalid_input_throws_ZeroDivisionException(int x, int y){
        try {
            Class clazz = Class.forName("de.month_1.fundamentals.day_12.CustomException.exception.ZeroDivisionException");
            assertThrows(clazz,() -> objectUnderTest.div(x,y));
        }catch (ClassNotFoundException e){
            fail("ZeroDivisionException class was not found");
        }
    }
}