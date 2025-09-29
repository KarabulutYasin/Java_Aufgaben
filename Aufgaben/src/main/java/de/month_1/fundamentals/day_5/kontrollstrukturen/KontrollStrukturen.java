package de.month_1.fundamentals.day_5.kontrollstrukturen;

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
        KontrollStrukturen ks = new KontrollStrukturen();
        String divider = "------------------------------";

        System.out.println(divider);
        System.out.println("gradeToText mit parameter 1:");
        System.out.println(ks.gradeToText(1));

        System.out.println(divider);
        System.out.println("dayType mit parameter 1:");
        System.out.println(ks.dayType(1));

        System.out.println(divider);
        System.out.println("sumOneToN mit parameter 5:");
        System.out.println(ks.sumOneToN(5));

        System.out.println(divider);
        System.out.println("totalLength mit parameter [\"Hallo\", \"Welt\"]:");
        System.out.println(ks.totalLength(List.of("Hallo", "Welt")));

        System.out.println(divider);
        System.out.println("doublesUntilAtLeast mit parameter (3, 20):");
        System.out.println(ks.doublesUntilAtLeast(3, 20));

        System.out.println(divider);
        System.out.println("firstEven mit parameter [1, 3, 5, 6, 7];");
        System.out.println(ks.firstEven(List.of(1, 3, 5, 6, 7)));

        System.out.println(divider);
        System.out.println("sumPositives mit parameter [-1, 2, -3, 4]:");
        System.out.println(ks.sumPositives(List.of(-1, 2, -3, 4)));
        System.out.println(divider);
    }
}
