package de.block2.aufgabe4;

/**
 * Demonstriert den Einsatz eines statischen Feldes:
 * - Jedes erzeugte Objekt erhöht den gemeinsamen Zähler.
 * - Der Zähler gehört zur KLASSE, nicht zur INSTANZ.
 */
public class CounterDemo {

    private static int counter = 0; // Klassenvariable, teilt sich alle Instanzen
    private final String name;

    public CounterDemo(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name darf nicht leer sein");
        this.name = name;
        counter++; // bei jedem neuen Objekt wird hochgezählt
    }

    public String getName() {
        return name;
    }

    // Statische Methode, weil sie auf Klassenebene arbeitet
    public static int getAnzahlErzeugteObjekte() {
        return counter;
    }

    // Hilfsmethode für Tests
    public static void resetCounter() {
        counter = 0;
    }
}
