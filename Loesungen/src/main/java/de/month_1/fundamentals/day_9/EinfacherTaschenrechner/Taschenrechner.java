package de.month_1.fundamentals.day_9.EinfacherTaschenrechner;

public class Taschenrechner {
    //TODO
    // Es soll ein Taschenrechner erstellt werden, der die Grundrechenarten beherrscht.
    // Der Taschenrechner bekommt ein bestimmtes Pattern soll dieses verarbeiten und das Ergebnis zurückgeben
    // Dabei sollen die 4 Rechenarten Plus Minus Mal Geteilt berücksichtigt werden
    // Wenn es zu fehlern kommt, soll eine entsprechende Fehlermeldung ausgegeben werden.
    // Man kann sich x beliebige Attribute Hilfsmethoden und Hilfsklassen erstellen um bessere übersicht zu behalten.

    // Das Pattern ist wie folgt:
    // <Zahl1> <Leerzeichen> <Rechenart> <Leerzeichen> <Zahl2>
    // Beispiel: 5 + 3 -> 8
    // Beispiel: 10 / 2 -> 5
    // Beispiel: 7* 4 -> Fehler "Ungültiges Pattern"
    // Beispiel: 9 -3 -> Fehler "Ungültiges Pattern"
    // Beispiel: 8 / 0 -> Fehler "Division durch Null nicht möglich"
    // Beispiel: 6 ^ 2 -> Fehler "Ungültige Rechenart"
    // Beispiel: 4 + a -> Fehler "Ungültige Zahl"
    // etc.

    private double zahl1;
    private double zahl2;
    private String rechenzeichen;

    // Es ist so möglich sollte aber nicht so gemacht werden im verlauf sehen wir noch wie es besser geht mit design pattern

    public double berechne(String pattern) {
        //TODO
        String[] patternParts = dividePattern(pattern);
        setupAttributes(patternParts);
        return calculate();
    }

    public String[] dividePattern(String pattern) {
        String[] result = pattern.split(" ");
        if (result.length ==3)return result;
        else throw new RuntimeException("Ungültiges Pattern");
    }

    public void setupAttributes(String[] patternParts) {
        try {
            zahl1 = Double.parseDouble(patternParts[0]);
            rechenzeichen = patternParts[1];
            zahl2 = Double.parseDouble(patternParts[2]);
        }catch (NumberFormatException e) {
            throw new RuntimeException("Ungültige Zahl");
        }
    }

    public double calculate() {
        switch (rechenzeichen) {
            case "+":
                return zahl1 + zahl2;
            case "-":
                return zahl1 - zahl2;
            case "*":
                return zahl1 * zahl2;
            case "/":
                if (zahl2 == 0) throw new RuntimeException("Division durch Null nicht möglich");
                return zahl1 / zahl2;
            default:
                throw new RuntimeException("Ungültige Rechenart");
        }
    }
}
