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
        if (grade == 1) return "Sehr gut";
        else if (grade == 2) return "Gut";
        else if (grade == 3) return "Befriedigend";
        else if (grade == 4) return "Ausreichend";
        else if (grade == 5) return "Mangelhaft";
        else return "Ungueltig";
    }

    //TODO
    // Wochentagsnummer (1=Mo..7=So) -> "Werktag"/"Wochenende"
    public String dayType(int day) {
        switch (day) {
            case 1, 2, 3, 4, 5:
                return "Werktag";
            case 6, 7:
                return "Wochenende";
            default:
                return "Ungueltig";
        }
    }

    //TODO
    // Summiere 1...n (inklusive von 1 und n)
    public int sumOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //TODO
    // Länge aller Strings addieren (ohne die Liste zu modifizieren!)
    public int totalLength(List<String> items) {
        int total = 0;
        for (String s : items) {
            total += (s == null ? 0 : s.length());
        }
        return total;
    }

    //TODO
    // Zähle, wie oft x verdoppelt werden muss, um >= limit zu erreichen.
    public int doublesUntilAtLeast(int start, int limit) {
        int x = start;
        int steps = 0;
        while (x < limit) {
            x *= 2;
            steps++;
        }
        return steps;
    }

    //TODO
    // Ersten geraden Wert in der Liste finden, wenn es keinen gibt -1 zurückgeben
    public int firstEven(List<Integer> nums) {
        for (int n : nums) {
            if (n % 2 == 0) return n;
        }
        return -1;
    }

    //TODO
    // Summe nur der positiven Zahlen bilden (Negative überspringen)
    public int sumPositives(List<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            if (n <= 0) continue;
            sum += n;
        }
        return sum;
    }
}
