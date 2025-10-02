package de.month_1.fundamentals.day_17.thissuper;

public class ThisSuperTasks {

    //TODO:
    // Two fields x and y (int)

    private int x;
    private int y;

    //TODO
    // Default constructor – call the 2-arg constructor with this(1, 2)

    public ThisSuperTasks() {
         this(1, 2);
    }

    //TODO
    // 2-arg constructor – set fields via this

    public ThisSuperTasks(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //TODO
    // Return the sum of x and y

    public int sum() {
        return x + y;
    }

    //TODO
    // Add dx to x and dy to y
    // Then return the object

    public ThisSuperTasks add(int dx, int dy) {
        this.x += dx; this.y += dy;
         return this;
    }
}
