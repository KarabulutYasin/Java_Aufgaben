package de.month_1.fundamentals.day_1.lineareProgramme;

public class LineareProgramme {
    public static void main(String[] args) {}

    public void begruessung() {
        //TODO
        // Schreibe eine Funktion die Hello World auf der Konsole ausgibt

        System.out.println("Hello World");
    }

    public int zusammenRechnen(int a, int b){
        //TODO
        // Gebe das Ergebnis der Addition zurück von denn Parametern a und b

        return a+b;
    }

    public String kommaZwischen(String wort1, String wort2){
        //TODO
        // Gebe ein String zurück der die Wörter wort1 und wort2
        // konkateniert mit einem Komme dazwischen
        // man kann davon ausgehen das kein String null ist

        // Beispiel HI und Moin => HI,Moin

        //Methode 1 (Ist bei oftem Konkatenieren schneller)
        StringBuilder sb = new StringBuilder(wort1);
        sb.append(",");
        sb.append(wort2);
        return sb.toString();

        //Methode 2

        //return wort1+","+wort2;
    }

    public void aufrufZusammenRechnen(){
        //TODO
        // Rufe zusammenRechen mit denn Übergabewerten 3 und 5 auf

        zusammenRechnen(3,5);
    }

    public int convertToInt(String s){
        //TODO
        // Konvertiere Denn String in int
        // Falls es aber nicht konvertierbar ist wirf eine
        // MeinFehlerException erstelle dafür eine Klasse
        try {
            return Integer.parseInt(s);
        }catch (Exception e){
            throw new MeinFehlerException(e.getMessage());
        }
    }

    public String convertToString(int i){
        //TODO
        // Gebe i als String zurück
        return String.valueOf(i);
    }

    public String returnsPositivNegativOrZero(int i){
        //TODO
        // Gebe falls i 0 ist denn String "Zero" zurück
        // Gebe falls i größer 0 ist denn String "Positiv" zurück
        // Gebe falls i kleiner 0 ist denn String "Negativ" zurück

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
        //TODO
        // Gebe true zurück wenn a oder b true sind (auch wenn beide true sind)

        return a || b;
    }

    public String[] flipArray(String[] array) {
        //TODO
        // Ordne das Array um indem die Werte umgedreht werden

        //Bsp
        // Vorher ["A", "B", "C"]
        // Nachher ["C", "B", "A"]

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}