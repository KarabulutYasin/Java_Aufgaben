package de.month_1.fundamentals.day_3.TypeConversion;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class TypeConversion {

    public int convertShortToInt(short x){
        //TODO
        // Konvertiere short x zu int und gebe es zurück

        // Automatische Konversion, kein Cast nötig
        return x;
    }

    public int convertDoubleToInt(double x){
        //TODO
        // Konvertiere denn double x in ein int

        //Man beachte kommazahlen werden immer abgerundet
        return (int) x;
    }

    public long convertIntToLong(int x){
        //TODO
        // Konvertiere int x zu long und gebe es zurück

        // Automatische Konversion, kein Cast nötig
        return x;
    }

    public float convertIntToFloat(int x){
        //TODO
        // Konvertiere int x zu float und gebe es zurück

        // Automatische Konversion, kein Cast nötig
        return x;
    }

    public double convertFloatToDouble(float x){
        //TODO
        // Konvertiere float x zu double und gebe es zurück

        // Automatische Konversion, kein Cast nötig
        return x;
    }

    public byte convertIntToByte(int x){
        //TODO
        // Konvertiere int x zu byte und gebe es zurück

        return (byte) x;
    }

    public char convertIntToChar(int x){
        //TODO
        // Konvertiere int x zu char und gebe es zurück

        return (char) x;
    }

    public static void main(String[] args) {
        //Muss nicht bearbeitet werden
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
