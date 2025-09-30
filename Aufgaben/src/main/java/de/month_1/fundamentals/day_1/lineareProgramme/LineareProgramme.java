package de.month_1.fundamentals.day_1.lineareProgramme;

import de.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class LineareProgramme {

    public void begruessung() {
        //TODO
        // Schreibe eine Funktion die "Hello World" auf der Konsole ausgibt

    }

    public int zusammenRechnen(int a, int b){
        //TODO
        // Gebe das Ergebnis der Addition zurück von denn Parametern a und b

        return 0;
    }

    public String kommaZwischen(String wort1, String wort2){
        //TODO
        // Gebe ein String zurück der die Wörter wort1 und wort2
        // konkateniert mit einem Komme dazwischen
        // man kann davon ausgehen das kein String null ist

        // Beispiel HI und Moin => HI,Moin

        return null;
    }

    public void aufrufZusammenRechnen(){
        //TODO
        // Rufe zusammenRechen mit denn Übergabewerten 3 und 5 auf
    }

    public int convertToInt(String s){
        //TODO
        // Konvertiere Denn String in int
        // Falls es aber nicht konvertierbar ist wirf eine
        // MeinFehlerException erstelle dafür eine Klasse

        return 0;
    }

    public String convertToString(int i){
        //TODO
        // Gebe i als String zurück

        return null;
    }

    public boolean connectBoolean(boolean a, boolean b) {
        //TODO
        // Gebe true zurück wenn a oder b true sind (auch wenn beide true sind)

        return false;
    }

    public static void main(String[] args) {
        //Muss nicht bearbeitet werden
        Method[] methods = LineareProgramme.class.getDeclaredMethods();
        Class<?> lp = LineareProgramme.class;

        MainProvider.printAscii();
        // Falls man etwas mit denn Parametern spielen will das nach "lp" sind die jeweiligen Parameter
        for (Method method: methods){
            if (method.getName().equals("main")) continue;
            if (method.getName().equals("begruessung")) MainProvider.exec(method,lp);
            if (method.getName().equals("zusammenRechnen")) MainProvider.exec(method,lp,10,20);
            if (method.getName().equals("kommaZwischen")) MainProvider.exec(method,lp,"Hi","Moin");
            if (method.getName().equals("aufrufZusammenRechnen")) MainProvider.exec(method,lp);
            if (method.getName().equals("convertToInt")) MainProvider.exec(method,lp,"123");
            if (method.getName().equals("convertToString")) MainProvider.exec(method,lp,123);
            if (method.getName().equals("connectBoolean")) MainProvider.exec(method,lp,true,false);
        }
    }
}