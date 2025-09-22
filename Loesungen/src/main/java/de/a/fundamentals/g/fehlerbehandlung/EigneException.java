package de.a.fundamentals.g.fehlerbehandlung;

import de.a.fundamentals.g.fehlerbehandlung.exception.NullTeilerException;

public class EigneException {

    int div(int x,int y){
        //TODO
        // Erstelle zunächst eine "NullTeilerException"
        // Dann fang die "ArithmeticException" ab und wirf stattdessen eine "NullTeilerException"
        try {
            return x/y;
        }catch (ArithmeticException e){
            throw new NullTeilerException("You shoudnt divide by zero");
        }
    }
}
