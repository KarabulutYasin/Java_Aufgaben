package de.month_1.fundamentals.day_16.staticDemo;

import java.util.List;

public class StaticDemo {
    //TODO
    // Schreibe eine Attribute namens "MY_PI", die den Wert von PI enthält mit 5 nachkommastellen.
    // Erstelle dann eine statische Methode, die diesen Wert zurückgibt namens"getMyPi".
    public static final double MY_PI = 3.14159;

    public static double getMyPi() {
        return MY_PI;
    }

    //TODO
    // Erstelle eine statische Methode, die zwei Zahlen multipliziert.
    public static int multiply(int a, int b) {
        return a * b;
    }

    //TODO
    // Zähle wie viele Instanzen von StaticTasks erzeugt wurden.
    // Die Attribute soll "instanceCounter" heißen.

    private static int instanceCounter = 0;

    public StaticDemo() {
        instanceCounter++;
    }

    public static int getInstanceCount() {
        return instanceCounter;
    }

    //TODO
    // Erstelle eine Utility-Methode, die aus einer Liste das Maximum zurückgibt.
    // (Soll statisch sein, weil man keinen "Zustand" braucht.)
    public static int maxFromList(List<Integer> nums) {
        if (nums.isEmpty()) throw new IllegalArgumentException("Liste darf nicht leer sein");
        int max = nums.get(0);
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    //TODO
    // Rufe die erstellte Utility methode auf und gebe das Maximum zurück.
    public int getMaxFromList(List<Integer> nums) {
        return maxFromList(nums);
    }
}
