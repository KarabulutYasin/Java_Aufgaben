package de.block2.aufgabe2;

public class Auto implements Fahrzeug {
    private int geschwindigkeit = 0;
    private boolean motorLaeuft = false;

    @Override
    public void starten() {
        motorLaeuft = true;
        System.out.println("Auto gestartet.");
    }

    @Override
    public void stoppen() {
        motorLaeuft = false;
        geschwindigkeit = 0;
        System.out.println("Auto gestoppt.");
    }

    @Override
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    @Override
    public void beschleunigen(int wert) {
        if (!motorLaeuft) throw new IllegalStateException("Motor ist aus!");
        if (wert < 0) throw new IllegalArgumentException("Beschleunigung muss positiv sein.");
        geschwindigkeit += wert;
    }
}
