package de.a.fundamentals.loesung6;

public final class Point {

    // TIPP denk an Libs die du vielleicht schon gelernt hast und hier benutzen könntest

    //TODO
    // 1. Schreibe eine Klasse Point mit den Instanzvariablen (Attributen) x und y (beide int).
    // 2. Schreibe einen Konstruktor der beide Variablen initialisiert.
    // 3. Schreibe Getter für beide Variablen.
    // 4. Schreibe eine Methode distanceTo(Point other), die die Distanz berechnet zwischen diesem Punkt und einem anderen Punkt.
    // 5. schreibe eine equals-Methode, die zwei Punkte als gleich betrachtet, wenn ihre x- und y-Koordinaten gleich sind.
    // 6. Schreibe eine toString-Methode, die einen Punkt in der Form "Point(x,y)" darstellt.

    private  int x;
    private  int y;

    public Point(int x, int y) {

    }

    public int getX() {

        return -1;
    }

    public int getY() {

        return -1;
    }

    public double distanceTo(Point other) {
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
