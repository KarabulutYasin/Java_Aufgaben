package de.month_1.fundamentals.h.taschenrechner.Rechenzeichen;

public class Minus implements Rechenzeichen{
    @Override
    public boolean isRechenzeichen(String zeichen) {
        return "-".equals(zeichen);
    }

    @Override
    public double calcRechenzeichen(int x, int y) {
        return x-y;
    }
}
