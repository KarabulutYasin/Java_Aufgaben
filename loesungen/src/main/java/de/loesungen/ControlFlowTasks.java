package de.loesungen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControlFlowTasks {

    // ---------- If-Else-Kaskaden ----------
    // Aufgabe: Note als Text zurückgeben (1..5 -> "Sehr gut".. "Mangelhaft", sonst "Ungültig")
    // Stolperfalle: Reihenfolge & "else" bindet sich an das NÄCHSTE "if".
    public String gradeToText(int grade) {
        if (grade == 1) return "Sehr gut";
        else if (grade == 2) return "Gut";
        else if (grade == 3) return "Befriedigend";
        else if (grade == 4) return "Ausreichend";
        else if (grade == 5) return "Mangelhaft";
        else return "Ungueltig"; // Default-Zweig nicht vergessen!
    }

    // ---------- switch ----------
    // Aufgabe: Wochentagsnummer (1=Mo..7=So) -> "Werktag"/"Wochenende"
    // Stolperfalle: break nicht vergessen; default behandeln.
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

    // ---------- Zählschleife (for) ----------
    // Aufgabe: Summe 1..n (inklusive)
    // Stolperfalle: Off-by-one (i < n vs i <= n)
    public int sumOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // <= statt <, sonst fehlt n
            sum += i;
        }
        return sum;
    }

    // ---------- foreach-Schleife ----------
    // Aufgabe: Länge aller Strings addieren (ohne die Liste zu modifizieren!)
    // Stolperfalle: In foreach nicht die Liste verändern -> ConcurrentModificationException.
    public int totalLength(List<String> items) {
        int total = 0;
        for (String s : items) {
            total += (s == null ? 0 : s.length());
        }
        return total;
    }

    // Sichere Variante zum Entfernen: Iterator benutzen (keine Stolperfalle mehr)
    public List<Integer> removeNegatives(List<Integer> nums) {
        List<Integer> copy = new ArrayList<>(nums);
        for (Iterator<Integer> it = copy.iterator(); it.hasNext(); ) {
            if (it.next() < 0) it.remove(); // Iterator.remove ist hier korrekt
        }
        return copy;
    }

    // ---------- while-Schleife ----------
    // Aufgabe: Zähle, wie oft x verdoppelt werden muss, um >= limit zu erreichen.
    // Stolperfalle: Schleifenvariable nicht ändern -> Endlosschleife.
    public int doublesUntilAtLeast(int start, int limit) {
        int x = start;
        int steps = 0;
        while (x < limit) {
            x *= 2;       // Variable AKTUALISIEREN, sonst Infinite Loop
            steps++;
        }
        return steps;
    }

    // ---------- break / continue ----------
    // Aufgabe: Ersten geraden Wert in der Liste finden, sonst -1
    // Stolperfalle: break beendet nur die INNERSTE Schleife.
    public int firstEven(List<Integer> nums) {
        for (int n : nums) {
            if (n % 2 == 0) return n;
        }
        return -1;
    }

    // Aufgabe: Summe nur der positiven Zahlen bilden (Negative überspringen)
    // Stolperfalle: continue kann Code hinter sich überspringen.
    public int sumPositives(List<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            if (n <= 0) continue; // überspringe negatives/0
            sum += n;              // ACHTUNG: liegt hinter continue!
        }
        return sum;
    }

    // ---------- do-while-Schleife ----------
    // Aufgabe: Simuliere, dass mindestens EIN Versuch gezählt wird, auch wenn Bedingung sofort false.
    // Stolperfalle: do-while läuft immer mindestens einmal.
    public int doAtLeastOnce(int start, int limit) {
        int x = start;
        int count = 0;
        do {
            count++;
            x++;
        } while (x < limit);
        return count;
    }

    // ---------- Geltungsbereich von Variablen ----------
    // Aufgabe: Erzeuge eine Zahl nur im Block und gib sie zurück.
    // Stolperfalle: Variable außerhalb des Blocks NICHT sichtbar.
    public int blockScopeExample(int base) {
        int result;
        {
            int temp = base * 2; // temp existiert NUR in diesem Block
            result = temp + 1;
        }
        // int y = temp; // Wäre ein Compilerfehler!
        return result;
    }

    // Aufgabe: Variablen-Schatten (shadowing) vermeiden.
    // Stolperfalle: Innere Variable verdeckt äußere mit gleichem Namen.
    public int shadowingSum(int x) {
        int sum = x;
        {
            int inner = x + 1;   // anderer Name statt "sum"
            sum += inner;        // kein Shadowing-Bug
        }
        return sum;
    }
}
