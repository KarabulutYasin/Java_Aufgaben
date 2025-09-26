package de.month_1.fundamentals.day_17.thissuper;

public class ThisSuperTasks {

    //TODO:
    // Zwei Felder a und b (int)

    private int a;
    private int b;

    //TODO
    // Default-Konstruktor – rufe den 2-Arg-Konstruktor mit this(1, 2)

    public ThisSuperTasks() {
         this(1, 2);
    }

    //TODO
    // 2-Arg-Konstruktor – setze Felder via this

    public ThisSuperTasks(int a, int b) {
         this.a = a;
         this.b = b;
    }

    //TODO
    // Gebe die Summe von a und b zurück

    public int sum() {
         return a + b;
    }

    //TODO
    // Addiere auf x auf a und y auf b
    // Gebe danach das Objekt zurück

    public ThisSuperTasks add(int x, int y) {
         this.a += x; this.b += y;
         return this;
    }
}
