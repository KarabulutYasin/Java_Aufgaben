package de.loesungen2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aufgaben2 {
    public String echoNextToken(Scanner sc) {
        //TODO Schreibe eine Funktion die eine Zahl von der Konsole einliest (Scanner) und wieder ausgibt

        return  sc.hasNext() ? sc.next() : "";
    }

    public int absInt(int x) {
        //TODO Implementiere eine Funktion die den Betrag einer Zahl berechnet (Math.abs)

        return Math.abs(x);
    }

    public List<Integer> numbersOneToTen() {
        //TODO Schreibe eine Methode die alle Zahlen von 1 bis 10 in einer Liste zurückgibt

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) list.add(i);
        return list;
    }

    public List<String> readUntilStop(Scanner sc) {
        //TODO Schreibe eine Methode die solange ein input in eine Liste schreibt bis der Benutzer "stop" eingibt und dann die Liste zurückgibt

        List<String> result = new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("stop")) break;
            result.add(line);
        }
        return result;
    }

    public String matrixToString(int[][] m) {
        //TODO Schreibe eine Methode die eine 2D-Matrix (int[][]) ausgibt

        if (m == null) return "";

        //Möglichkeit 1
        return Arrays.stream(m)
                .map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" ")))
                .collect(Collectors.joining("\n"));
        //Möglichkeit 2
        /*
        StringBuilder sb = new StringBuilder();
        for (int [] xAchse:m){
            for (int yAchse: xAchse){
                sb.append(yAchse);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
        */
    }
}
