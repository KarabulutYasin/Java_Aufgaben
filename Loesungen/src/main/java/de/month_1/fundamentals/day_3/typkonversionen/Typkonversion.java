package de.month_1.fundamentals.day_3.typkonversionen;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Typkonversion {

    public static void main(String[] args) {
        Typkonversion tk = new Typkonversion();
        String divider = "------------------------------";

        System.out.println(divider);
        System.out.println("ConvertShortToInt mit dem short 12345");
        System.out.println(tk.convertShortToInt((short) 12345));

        System.out.println(divider);
        System.out.println("ConvertDoubleToInt mit dem double 123.456");
        System.out.println(tk.convertDoubleToInt(123.456));

        System.out.println(divider);
        System.out.println("ConvertIntToLong mit dem int 123456789");
        System.out.println(tk.convertIntToLong(123456789));

        System.out.println(divider);
        System.out.println("ConvertIntToFloat mit dem int 123456789");
        System.out.println(tk.convertIntToFloat(123456789));

        System.out.println(divider);
        System.out.println("ConvertFloatToDouble mit dem float 123.456f");
        System.out.println(tk.convertFloatToDouble(123.456f));

        System.out.println(divider);
        System.out.println("ConvertIntToByte mit dem int 130");
        System.out.println(tk.convertIntToByte(130));

        System.out.println(divider);
        System.out.println("ConvertIntToChar mit dem int 65");
        System.out.println(tk.convertIntToChar(65));
        System.out.println(divider);
    }

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
}
