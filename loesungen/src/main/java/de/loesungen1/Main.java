package de.loesungen1;

import de.exception.MeinFehlerException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {}

    public void begruessung() {
        //TODO Schreibe eine Funktion die Hello World Printet
        System.out.println("Hello World");
    }

    public int zusammenRechnen(int a, int b){
        //TODO Gebe Das ergebnis der Addition zurück

        return a+b;
    }

    public String kommaZwischen(String wort1, String wort2){
        //TODO gebe einen String zurück der erstmal
        //TODO das erste wort dann ein komme und dann das
        //TODO zweite  wort enthält

        // Beispiel HI und Moin => HI,Moin

        //Methode 1 (Ist bei oftem Konkatenieren schneller)
        StringBuilder sb = new StringBuilder(wort1);
        sb.append(",");
        sb.append(wort2);
        return sb.toString();

        //Methode 2

        //return wort1+","+wort2;
    }

    public void aufrufBegruessung(){
        //TODO Rufe zusammenRechen mit denn werten 3 und 5 auf

        zusammenRechnen(3,5);
    }

    public int convertToInt(String s){
        //TODO Konvertiere Denn String in int
        //TODO Falls es nicht konvertierbar ist wirf eine
        //TODO MeinFehlerException erstelle dafür eine Klasse
        try {
            return Integer.parseInt(s);
        }catch (Exception e){
            //e.getmessage übergibt die fehlermessage
            //vom vorherigen
         throw new MeinFehlerException(e.getMessage());
        }
    }

    public String convertToString(int i){
        //TODO Gebe denn int als String zurück
        return String.valueOf(i);
    }

    public String returnsPositivNegativOrZero(int i){
        //TODO Gebe Zero zurück wenn i 0 ist
        //TODO Gebe Positiv zurück wenn i größer 0 ist
        //TODO Gebe Negativ zurück wenn i kleiner 0 ist

        //Methode 1.1

        if (i == 0) {
            return "Zero";
        } else if (i > 0) {
            return "Positiv";
        } else{
            return "Negativ";
        }

        //Methode 1.2 (Kurzschreibweise wenn nur eine anweisung innerhalb des ifs)

        /*
        if (i == 0) return "Zero";
        else if (i < 0) return "Negativ";
        else return "Positiv";
        */

        //Methode 2.1
        /*
        switch (Integer.signum(i)) {
            case 1 -> {
                return "Positiv";
            }
            case -1 -> {
                return "Negativ";
            }
            default -> {
                return "Zero";
            }
        }
        */

        //Methode 2.2

        /*return switch (Integer.signum(i)) {
            case 1 -> "Positiv";
            case -1 -> "Negativ";
            default -> "Zero";
        };*/
    }

    public boolean connectBoolean(boolean a, boolean b) {
        //TODO Gebe true zurück wenn a oder b true sind (auch wenn beide true sind)

        //Methode 1
        return a || b;
    }

    public String[] flipArray(String[] array) {
        //TODO Drehe das Array um
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}