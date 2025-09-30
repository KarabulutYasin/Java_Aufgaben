package de.month_1.fundamentals.day_5.kontrollstrukturen;

import de.utiltiy.MainProvider;

import java.lang.reflect.Method;
import java.util.List;

public class KontrollStrukturen {

    //TODO
    // Wenn eine Aufgabe mit mehreren Möglichkeiten Lösbar ist
    // mach es mit mehreren möglichkeiten zur übungszwecke
    // (for while for each do while)
    // (switch if else)

    //TODO
    // Note als Text zurückgeben (1..5 -> "Sehr gut".. "Mangelhaft", sonst "Ungültig")
    public String gradeToText(int grade) {
        return null;
    }

    //TODO
    // Wochentagsnummer (1=Mo..7=So) -> "Werktag"/"Wochenende"
    // Wenn eine Zahl außerhalb von 1..7 ist -> "Ungültig"
    public String dayType(int day) {
        return null;
    }

    //TODO
    // Summiere 1...n (inklusive von 1 und n)
    public int sumOneToN(int n) {
        return -1;
    }

    //TODO
    // Länge aller Strings addieren (ohne die Liste zu modifizieren!)
    public int totalLength(List<String> items) {
        return -1;
    }

    //TODO
    // Zähle, wie oft x verdoppelt werden muss, um >= limit zu erreichen.
    public int doublesUntilAtLeast(int start, int limit) {
        return 0;
    }

    //TODO
    // Ersten geraden Wert in der Liste finden, wenn es keinen gibt -1 zurückgeben
    public int firstEven(List<Integer> nums) {
        return -2;
    }

    //TODO
    // Summe nur der positiven Zahlen bilden (Negative überspringen)
    public int sumPositives(List<Integer> nums) {
        return -1;
    }

    public static void main(String[] args) {
        //Muss nicht bearbeitet werden
        Method[] methods = KontrollStrukturen.class.getDeclaredMethods();
        Class<?> clazz = KontrollStrukturen.class;

        MainProvider.printAscii();
        for (Method method : methods) {
            if (method.getName().equals("main")) continue;
            if("gradeToText".equals(method.getName())) MainProvider.exec(method, clazz, 1);
            if("dayType".equals(method.getName())) MainProvider.exec(method, clazz, 1);
            if("sumOneToN".equals(method.getName())) MainProvider.exec(method, clazz, 5);
            if("totalLength".equals(method.getName())) MainProvider.exec(method, clazz, List.of("Hallo", "Welt"));
            if("doublesUntilAtLeast".equals(method.getName())) MainProvider.exec(method, clazz, 3, 20);
        }
    }
}
