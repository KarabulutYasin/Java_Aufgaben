package de.month_1.fundamentals.day_12.CustomException;

import de.month_1.fundamentals.day_12.CustomException.exception.OwnRuntimeException;
import de.month_1.fundamentals.day_12.CustomException.exception.ZeroDivisionException;

public class CustomException {

    public void throwsExceptionButNotRuntimeException() throws Exception {
        //TODO
        // Throw an exception that is not an instance of RuntimeException

        throw new Exception();
    }

    public void throwsRuntimeException(){
        //TODO
        // Throw an instance of RuntimeException

        throw new RuntimeException();
    }

    public void throwsOwnException() throws de.month_1.fundamentals.day_12.CustomException.exception.OwnException {
        //TODO
        // Inside the package errorhandling there is the package exception
        // Create a class named "OwnException" inside the exception package that extends Exception
        // Then throw it here

        throw new de.month_1.fundamentals.day_12.CustomException.exception.OwnException();
    }

    public void throwsOwnRuntimeException(){
        //TODO
        // Inside the package errorhandling there is the package exception
        // Create a class named "OwnRuntimeException" inside the exception package that extends RuntimeException
        // Then throw it here

        throw new OwnRuntimeException();
    }

    public int divide(int x, int y){
        //TODO
        // Create an exception named "ZeroDivisionException" in the exception package that extends RuntimeException
        // This code throws an ArithmeticException when dividing by 0, catch it with a try/catch block and throw a "ZeroDivisionException" instead
        try {
            return x/y;
        }catch (ArithmeticException e){
            throw new ZeroDivisionException();
        }
    }
}
