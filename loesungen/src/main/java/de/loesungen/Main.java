package de.loesungen;

import de.loesungen.exception.MeinFehlerException;

import javax.swing.text.html.parser.Parser;

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
}