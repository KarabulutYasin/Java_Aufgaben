package de.month_1.fundamentals.day_4.mathlib;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class MathLib {

    //TODO
    // Get familiar with Java's Math library to solve the following tasks
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html

    //TODO
    // Calculate the square root of a number
    public double squareRoot(double value) {return 0;}

    //TODO
    // Calculate a to the power of b
    public double power(double base, double exponent) {return 0;}

    //TODO
    // Round a decimal number to the nearest whole number
    public long round(double value) {return 0;
    }

    //TODO
    // Calculate the absolute value of a number
    public int absoluteInt(int value) {return 0;}

    //TODO
    // Calculate the sine of a number
    public double sine(double radians) {return 0;}

    //TODO
    // Generate a random number between 0 (inclusive) and 1 (exclusive)
    public double randomZeroToOne(){return -1;}

    //TODO
    // Generate a random integer in the range [min, max]
    public int randomInt(int min, int max) {return 0;}

    public static void main(String[] args) {
        //No need to edit
        Method[] methods = MathLib.class.getDeclaredMethods();
        Class<?> mathLibraryClass = MathLib.class;

        MainProvider.printAscii();
        for(Method method : methods) {
            if("main".equals(method.getName())) continue;
            if("squareRoot".equals(method.getName())) MainProvider.exec(method, mathLibraryClass, 16);
            if("power".equals(method.getName())) MainProvider.exec(method, mathLibraryClass, 2, 3);
            if("round".equals(method.getName())) MainProvider.exec(method, mathLibraryClass, 3.6);
            if("absoluteInt".equals(method.getName())) MainProvider.exec(method, mathLibraryClass, -5);
            if("sine".equals(method.getName())) MainProvider.exec(method, mathLibraryClass, Math.PI / 2);
            if("randomZeroToOne".equals(method.getName())) MainProvider.exec(method, mathLibraryClass);
            if("randomInt".equals(method.getName())) MainProvider.exec(method, mathLibraryClass, 5, 15);
        }
    }
}
