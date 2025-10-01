package de.month_1.fundamentals.day_11.point;

import static java.lang.Math.*;

public final class Point {
    private final int x;
    private final int y;

    // TIP: Think of libraries you may have already learned and could use here

    //TODO
    // 1. Write a class Point with the instance variables (attributes) x and y (both int).
    // 2. Write a constructor that initializes both variables.
    // 3. Write getters for both variables.
    // 4. Write a method distanceTo(Point other) that calculates the distance between this point and another point.
    // 5. Write an equals method that considers two points equal if their x and y coordinates are equal.
    // 6. Write a toString method that represents a point in the form "Point(x,y)".

    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

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
