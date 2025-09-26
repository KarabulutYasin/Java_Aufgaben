package de.month_1.fundamentals.day_13.librarys;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LibraryTasks {

    // Aufgabe: Lies eine ganze Zahl aus einem Scanner und gib sie zurück.
    public int readIntFromScanner(Scanner sc) {
        return sc.nextInt();
    }

    // Aufgabe: Schreibe Strings in eine Datei und lies sie wieder zurück.
    public void writeLinesToFile(List<String> lines, Path path) throws IOException {
        Files.write(path, lines);
    }

    public List<String> readLinesFromFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    // Aufgabe: Zähle Wörter in einer Textdatei.
    // Schaue regex nach und ja regex ist beschissen aber sollte man grob wissen
    public int countWordsInFile(Path path) throws IOException {
        int count = 0;
        for (String line : Files.readAllLines(path)) {
            String[] parts = line.trim().split("\\s+");
            if (parts.length == 1 && parts[0].isEmpty()) continue;
            count += parts.length;
        }
        return count;
    }

    // Aufgabe: Summe einer Liste von Integern (siehe Autoboxing/Unboxing).
    public int sumIntegerList(List<Integer> nums) {
        int s = 0;
        for (int n : nums) s += n; // Autounboxing passiert hier
        return s;
    }

    //Aufgabe: Konkateniere denn String times mal hintereinander
    //Vergleich mal wie lange der Test braucht wenn du StringBuilder benutzt
    //und wie lange wenn du Strings "+" rechnest
    public String repeatConcat(String s, int times) {
        /*
        if (times == 0) return "";
        String result = s;
        for (int i = 1; i < times; i++) {
            result += s;
        }
        return result;
        */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) sb.append(s);
        return sb.toString();
    }
}
