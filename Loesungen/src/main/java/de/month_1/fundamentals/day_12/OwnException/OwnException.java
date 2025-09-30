package de.month_1.fundamentals.day_12.OwnException;

import de.month_1.fundamentals.day_12.OwnException.exception.OwnRuntimeException;
import de.month_1.fundamentals.day_12.OwnException.exception.ZeroDivisionException;

public class OwnException {

    public void throwsExceptionButNotRuntimeException() throws Exception {
        //TODO
        // Werfe eine Exception die aber keine Instanz von RuntimeException ist

        throw new Exception();
    }

    public void throwsRuntimeException(){
        //TODO
        // Werfe eine Instanz RuntimeException

        throw new RuntimeException();
    }

    public void throwsOwnException() throws de.month_1.fundamentals.day_12.OwnException.exception.OwnException {
        //TODO
        // Innerhalb vom Package fehlerbehandlung ist das Package exception
        // erstelle innerhalb von dem package exception eine klasse die von Exception erbt und "OwnException" heißt
        // Werfe sie dann hier

        throw new de.month_1.fundamentals.day_12.OwnException.exception.OwnException();
    }

    public void throwsOwnRuntimeException(){
        //TODO
        // Innerhalb vom Package fehlerbehandlung ist das Package exception
        // erstelle innerhalb von dem package exception eine klasse die von RuntimeException erbt und "OwnRuntimeException" heißt
        // Werfe sie dann hier

        throw new OwnRuntimeException();
    }

    public int div(int x, int y){
        //TODO
        // Erstelle im Package exception eine Exception die von RuntimeException erbt und "ZeroDivisionException" heißt
        // Dieser code wirft eine ArithmeticException wenn durch 0 geteilt wird fange diese mit einem try/catch block ab und wirf stattdessen eine "ZeroDivisionException"
        try {
            return x/y;
        }catch (ArithmeticException e){
            throw new ZeroDivisionException();
        }
    }
}
