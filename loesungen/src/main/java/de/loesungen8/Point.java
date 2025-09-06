package de.loesungen8;

import static java.lang.Math.*;

public final class Point {
    private final int x;
    private final int y;

    // TIPP denk an Libs die du vielleicht schon gelernt hast und hier benutzen könntest

    //TODO
    /*
    * 1.Schreibe eine Klasse Point mit den Instanzvariablen x und y (beide int).
    *
    * 2.Schreibe einen Konstruktor der beide Variablen initialisiert.
    *
    * 3.Schreibe Getter für beide Variablen.
    *
    * 4.Schreibe eine Methode distanceTo(Point other), die die Distanz berechnet
    *    zwischen diesem Punkt und einem anderen Punkt.
    *
    * 5.schreibe eine equals-Methode, die zwei Punkte als gleich betrachtet,
    *    wenn ihre x- und y-Koordinaten gleich sind.
    *
    * 6.Schreibe eine toString-Methode, die einen Punkt in der Form "Point(x,y)" darstellt.
    * */

    public Point(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return x; }
    public int getY() { return y; }

    public double distanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return sqrt(dx*dx + dy*dy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point p)) return false;
        return x == p.x && y == p.y;
    }

    @Override
    public String toString() {
        return "Point(" + x + "," + y + ")";
    }
}
