package de.loesungen;

public class MathTasks {

    //TODO Mach dich mit Der Math library von Java vertraut und löse damit die Aufgaben

    //TODO Berechne die Wurzel einer Zahl
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    //TODO Berechne a hoch b
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    //TODO Runde eine Kommazahl auf die nächste ganze Zahl
    public long round(double x) {
        return Math.round(x);
    }

    //TODO Berechne den Betrag einer Zahl
    public int absInt(int x) {
        return Math.abs(x);
    }

    //TODO Berechne den Sinus einer Zahl (in Radiant)
    public double sin(double rad) {
        return Math.sin(rad);
    }

    //TODO Erzeuge eine Zufallszahl zwischen 0 (inkl.) und 1 (exkl.)
    public double random01() {
        return Math.random();
    }

    //TODO Erzeuge eine ganze Zufallszahl im Bereich [min, max]
    public int randomInt(int min, int max) {
        if (min > max) throw new IllegalArgumentException("min > max");
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
