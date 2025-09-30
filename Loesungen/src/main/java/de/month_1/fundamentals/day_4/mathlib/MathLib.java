package de.month_1.fundamentals.day_4.mathlib;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class MathLib {

    //TODO
    // Mach dich mit der Math library von Java vertraut um die folgenden Aufgaben zu lösen
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html

    //TODO
    // Berechne die Wurzel einer Zahl
    public double sqrt(double x) {
        return Math.sqrt(x);
    }

    //TODO
    // Berechne die Potenz a hoch b
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    //TODO
    // Runde eine Kommazahl auf die nächste ganze Zahl
    public long round(double x) {
        return Math.round(x);
    }

    //TODO
    // Berechne den Betrag einer Zahl
    public int absInt(int x) {
        return Math.abs(x);
    }

    //TODO
    // Berechne den Sinus einer Zahl
    public double sin(double rad) {
        return Math.sin(rad);
    }

    //TODO
    // Erzeuge eine Zufallszahl zwischen 0 (inkl.) und 1 (exkl.)
    public double random01() {
        return Math.random();
    }

    //TODO
    // Erzeuge eine ganze Zufallszahl im Bereich [min, max]
    public int randomInt(int min, int max) {
        if (min > max) throw new IllegalArgumentException("min > max");
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {
        //Muss nicht bearbeitet werden
        Method[] methods = MathLib.class.getDeclaredMethods();
        Class<?> mathLibClass = MathLib.class;

        MainProvider.printAscii();
        for(Method method : methods) {
            if("main".equals(method.getName())) continue;
            if("sqrt".equals(method.getName())) MainProvider.exec(method, mathLibClass, 16);
            if("pow".equals(method.getName())) MainProvider.exec(method, mathLibClass, 2, 3);
            if("round".equals(method.getName())) MainProvider.exec(method, mathLibClass, 3.6);
            if("absInt".equals(method.getName())) MainProvider.exec(method, mathLibClass, -5);
            if("sin".equals(method.getName())) MainProvider.exec(method, mathLibClass, Math.PI / 2);
            if("random01".equals(method.getName())) MainProvider.exec(method, mathLibClass);
            if("randomInt".equals(method.getName())) MainProvider.exec(method, mathLibClass, 5, 15);
        }
    }
}
