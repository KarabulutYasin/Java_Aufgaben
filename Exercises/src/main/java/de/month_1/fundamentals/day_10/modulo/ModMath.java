package de.month_1.fundamentals.day_10.modulo;

public class ModMath {

    //TODO
    // Find out what modulo calculation is
    // Find out which type of modulo Java uses
    // The method should return a mod m in the positive range
    // If m <= 0 an IllegalArgumentException should be thrown

    public int normalizeModulo(int a, int m) {

        return 0;
    }

    //TODO
    // Write a method that adds hours in 12h format

    // Example:
    // addHours12(12, 1) -> 1
    // addHours12(3, -4) -> 11

    public int addHours12(int hour, int delta) {
        return 0;
    }

    public static void main(String[] args) {
        // Nothing to edit here
        ModMath modMath = new ModMath();
        String divider = "----------------------";

        System.out.println(divider);
        System.out.println("normalizeModulo with parameters 10,4:");
        System.out.println(modMath.normalizeModulo(10,4));

        System.out.println(divider);
        System.out.println("addHours12 with parameters 11, 9");
        System.out.println(modMath.addHours12(11,9));

        System.out.println(divider);
    }
}
