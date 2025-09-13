package de.block2.aufgabe4;


public class CounterDemo {

    // Test sind auskommmentiert weil sie nicht kompilieren
    // deswegen wenn du an der aufgabe bist die kommentare entfernen

    // Oh Oh wir wollen mit counter zählen wie viele Objekte erzeugt wurden
    // Aber irgendwas stimmt hier nicht

    private static int counter = 0;
    private String name;

    public CounterDemo(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name darf nicht leer sein");
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getAnzahlErzeugteObjekte() {
        return counter;
    }

    public void resetCounter() {
        counter = 0;
    }
}
