package de.month_1.fundamentals.day_12.CustomException;

public class CustomException {

    public void throwsExceptionButNotRuntimeException() throws Exception {
        //TODO
        // Throw an exception that is not an instance of RuntimeException
    }

    public void throwsRuntimeException(){
        //TODO
        // Throw an instance of RuntimeException
    }

    public void throwsOwnException(){
        //TODO
        // Inside the package errorhandling there is the package exception
        // Create a class named "OwnException" inside the exception package that extends Exception
        // Then throw it here
    }

    public void throwsOwnRuntimeException(){
        //TODO
        // Inside the package errorhandling there is the package exception
        // Create a class named "OwnRuntimeException" inside the exception package that extends RuntimeException
        // Then throw it here
    }

    public int divide(int x, int y){
        //TODO
        // Create an exception named "ZeroDivisionException" in the exception package that extends RuntimeException
        // This code throws an ArithmeticException when dividing by 0, catch it with a try/catch block and throw a "ZeroDivisionException" instead
        return x/y;
    }
}
