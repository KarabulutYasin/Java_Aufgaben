package de.a.fundamentals.h.taschenrechner.Rechenzeichen;

import de.a.fundamentals.h.taschenrechner.Exception.NullTeilerException;

public class Geteilt implements Rechenzeichen{
    @Override
    public boolean isRechenzeichen(String zeichen) {
        return "/".equals(zeichen);
    }

    @Override
    public double calcRechenzeichen(int x, int y) throws NullTeilerException{
        if (y == 0) throw new NullTeilerException("Man darf nicht durch null teilen du Idiot");
        else return x/y;
    }
}
