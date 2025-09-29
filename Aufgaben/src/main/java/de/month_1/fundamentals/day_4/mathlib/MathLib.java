package de.month_1.fundamentals.day_4.mathlib;

public class MathLib {

    //TODO
    // Mach dich mit der Math library von Java vertraut um die folgenden Aufgaben zu lösen
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html

    //TODO
    // Berechne die Wurzel einer Zahl
    public double sqrt(double x) {
        return 0;
    }

    //TODO
    // Berechne a hoch b
    public double pow(double a, double b) {
        return 0;
    }

    //TODO
    // Runde eine Kommazahl auf die nächste ganze Zahl
    public long round(double x) {
        return 0;
    }

    //TODO
    // Berechne den Betrag einer Zahl
    public int absInt(int x) {
        return 0;
    }

    //TODO
    // Berechne den Sinus einer Zahl (in Radiant)
    public double sin(double rad) {
        return 0;
    }

    //TODO
    // Erzeuge eine Zufallszahl zwischen 0 (inkl.) und 1 (exkl.)
    public double random01() {
        return -1;
    }

    //TODO
    // Erzeuge eine ganze Zufallszahl im Bereich [min, max]
    public int randomInt(int min, int max) {
        return 0;
    }

    public static void main(String[] args) {
        //Nicht zu bearbeiten
        MathLib mathLib = new MathLib();
        String divider = "------------------------------";

        System.out.println(divider);
        System.out.println("sqrt mit parameter 16: ");
        System.out.println(mathLib.sqrt(16));

        System.out.println(divider);
        System.out.println("pow mit parameter 2, 3: ");
        System.out.println(mathLib.pow(2, 3));

        System.out.println(divider);
        System.out.println("round mit parameter 4.6: ");
        System.out.println(mathLib.round(4.6));

        System.out.println(divider);
        System.out.println("absInt mit parameter -5: ");
        System.out.println(mathLib.absInt(-5));

        System.out.println(divider);
        System.out.println("sin mit parameter Math.PI / 2: ");
        System.out.println(mathLib.sin(Math.PI / 2));

        System.out.println(divider);
        System.out.println("random01: ");
        System.out.println(mathLib.random01());

        System.out.println(divider);
        System.out.println("randomInt mit parameter 1, 10: ");
        System.out.println(mathLib.randomInt(1, 10));
        System.out.println(divider);
    }
}
