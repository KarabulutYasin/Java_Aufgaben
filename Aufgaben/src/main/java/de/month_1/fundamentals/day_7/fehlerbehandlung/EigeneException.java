package de.month_1.fundamentals.day_7.fehlerbehandlung;

public class EigeneException {

    public void throwsExceptionButNotRuntimeException(){
        //TODO
        // Werfe eine Exception die aber keine Instanz von RuntimeException ist (So das es kompilierbar(ausführbar) ist)
    }

    public void throwsRuntimeException(){
        //TODO
        // Werfe eine Instanz RuntimeException
    }

    public void throwsOwnException(){
        //TODO
        // Innerhalb vom Package fehlerbehandlung ist das Package exception
        // erstelle innerhalb von dem package exception eine klasse die von Exception erbt und "OwnException" heißt
        // Werfe sie dann hier (So das es kompilierbar(ausführbar) ist)
    }

    public void throwsOwnRuntimeException(){
        //TODO
        // Innerhalb vom Package fehlerbehandlung ist das Package exception
        // erstelle innerhalb von dem package exception eine klasse die von RuntimeException erbt und "OwnRuntimeException" heißt
        // Werfe sie dann hier
    }

    public int div(int x, int y){
        //TODO
        // Erstelle im Package exception eine Exception die von RuntimeException erbt und "ZeroDivisionException" heißt
        // Dieser code wirft eine ArithmeticException wenn durch 0 geteilt wird fange diese mit einem try/catch block ab und wirf stattdessen eine "ZeroDivisionException"
        return x/y;
    }
}
