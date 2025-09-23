package de.block2.aufgabe6;

public class Auto  implements Fahrzeug {
    private  String kennzeichen;
    private  int anzahlRaeder;

    public Auto(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.anzahlRaeder = 4;
    }

    @Override
    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    @Override
    public String fahren() {
        return "Wrom Wrom";
    }
}
