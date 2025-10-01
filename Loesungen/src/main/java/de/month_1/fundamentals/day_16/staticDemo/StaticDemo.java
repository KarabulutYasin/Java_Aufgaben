package de.month_1.fundamentals.day_16.staticDemo;

import java.util.List;

public class StaticDemo {
    //TODO
    // Write an attribute named "MY_PI" that contains the value of PI with 5 decimal places.
    // Then create a static method that returns this value called "getMyPi".
    public static final double MY_PI = 3.14159;

    public static double getMyPi() {
        return MY_PI;
    }

    //TODO
    // Create a static method that multiplies two numbers.
    public static int multiply(int a, int b) {
        return a * b;
    }

    //TODO
    // Count how many instances of StaticDemo have been created.
    // The attribute should be called "instanceCounter".
    private static int instanceCounter = 0;

    public StaticDemo() {
        instanceCounter++;
    }

    public static int getInstanceCount() {
        return instanceCounter;
    }

    //TODO
    // Create a utility method that returns the maximum from a list.
    // (Should be static because you don't need any "state".)
    public static int maxFromList(List<Integer> nums) {
        if (nums.isEmpty()) throw new IllegalArgumentException("List must not be empty");
        int max = nums.get(0);
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    //TODO
    // Call the created utility method and return the maximum.
    public int getMaxFromList(List<Integer> nums) {
        return maxFromList(nums);
    }
}
