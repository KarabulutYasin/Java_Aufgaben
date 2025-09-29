package de.month_1.fundamentals.day_1.lineareProgramme;

public class LineareProgramme {

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
            throw new RuntimeException(e.getMessage());
        }
    }

    public String convertToString(int i){
        //TODO
        // Gebe i als String zurück
        return String.valueOf(i);
    }

    public boolean connectBoolean(boolean a, boolean b) {
        //TODO
        // Gebe true zurück wenn a oder b true sind (auch wenn beide true sind)

        return a || b;
    }

    public static void main(String[] args) {
        //Nicht zu bearbeiten
        LineareProgramme lp = new LineareProgramme();
        String divider = "------------------------------";
        System.out.println(divider);

        System.out.println("Ausgabe von Begrüssung:" );
        lp.begruessung();
        System.out.println(divider);

        System.out.println("Ausgabe von zusammenrechnen mit Parameter 10 und 20:" );
        System.out.println(lp.zusammenRechnen(10,20));
        System.out.println(divider);

        System.out.println("Ausgabe von kommaZwischen mit Parameter Hi und Moin:" );
        System.out.println(lp.kommaZwischen("Hi","Moin"));
        System.out.println(divider);

        System.out.println("Aufruf von aufrufZusammenRechnen:" );
        lp.aufrufZusammenRechnen();
        System.out.println(divider);

        System.out.println("Ausgabe von convertToInt mit Parameter \"123\":" );
        System.out.println(lp.convertToInt("123"));
        System.out.println(divider);

        System.out.println("Ausgabe von convertToString mit Parameter 123:" );
        System.out.println(lp.convertToString(123));
        System.out.println(divider);

        System.out.println("Ausgabe von connectBoolean mit Parameter true und false:" );
        System.out.println(lp.connectBoolean(true,false));
        System.out.println(divider);
    }
}