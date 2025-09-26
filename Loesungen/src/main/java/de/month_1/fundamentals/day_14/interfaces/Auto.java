package de.month_1.fundamentals.day_14.interfaces;

public class Auto implements Fahrzeug {

    private int geschwindigkeit;

    @Override
    public void starten() {
        System.out.println("Auto wird gestartet wrom wrom");
    }

    @Override
    public void stoppen() {
        System.out.println("Auto wurde gestoppt");
        geschwindigkeit = 0;
    }

    @Override
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    @Override
    public void setGeschwindigkeit(int wert) {
        if (wert < 0) {
            throw new IllegalArgumentException("Geschwindigkeit darf nicht negativ sein");
        }
        geschwindigkeit = wert;
    }

}
