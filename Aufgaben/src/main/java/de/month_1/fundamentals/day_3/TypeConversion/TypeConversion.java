package de.month_1.fundamentals.day_3.TypeConversion;

import de.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class TypeConversion {

    public int convertShortToInt(short x){
        //TODO
        // Convert short x to int and return it

        return -1;
    }

    public int convertDoubleToInt(double x){
        //TODO
        // Convert double x to int

        return -1;
    }

    public long convertIntToLong(int x){
        //TODO
        // Convert int x to long and return it

        return -1;
    }

    public float convertIntToFloat(int x){
        //TODO
        // Convert int x to float and return it

        return -1;
    }

    public double convertFloatToDouble(float x){
        //TODO
        // Convert float x to double and return it

        return -1;
    }

    public byte convertIntToByte(int x){
        //TODO
        // Convert int x to byte and return it

        return -1;
    }

    public char convertIntToChar(int x){
        //TODO
        // Convert int x to char and return it

        return 0;
    }

    public static void main(String[] args) {
        //No need to edit
        Method[] methods = TypeConversion.class.getDeclaredMethods();
        Class<?> tkc = TypeConversion.class;

        MainProvider.printAscii();
        for(Method method: methods){
            if ("main".equals(method.getName())) continue;
            if ("convertShortToInt".equals(method.getName())) MainProvider.exec(method,tkc, (short) 12345);
            if ("convertDoubleToInt".equals(method.getName())) MainProvider.exec(method,tkc, 12345.67);
            if ("convertIntToLong".equals(method.getName())) MainProvider.exec(method,tkc, 123456789);
            if ("convertIntToFloat".equals(method.getName())) MainProvider.exec(method,tkc, 123456789);
            if ("convertFloatToDouble".equals(method.getName())) MainProvider.exec(method,tkc, 12345.67f);
            if ("convertIntToByte".equals(method.getName())) MainProvider.exec(method,tkc, 123456);
            if ("convertIntToChar".equals(method.getName())) MainProvider.exec(method,tkc, 65);
        }
    }
}
