package de.month_1.fundamentals.day_7.Arrays;

import de.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class ArrayTasks {

    //TODO
    // Work with arrays to solve the following tasks
    // Use both for-loops and for-each loops for practice

    //TODO
    // Create an int array of size n and fill it with the numbers 1 to n
    public int[] createSequence(int n) {return null;}

    //TODO
    // Find the maximum in an array
    public int findMax(int[] numbers) {return -1;}

    //TODO
    // Calculate the sum of all elements in the array
    public int sum(int[] numbers) {return -1;}

    //TODO
    // Count how often a certain value occurs in the array
    public int countOccurrences(int[] numbers, int value) {return -1;}

    //TODO
    // Reverse the order of the elements (array is modified!)
    public void reverse(int[] numbers) {
    }

    //TODO
    // Create a copy of the array with only the even numbers
    public int[] filterEven(int[] numbers) {
        return null;
    }

    //TODO
    // Check if the array is sorted (ascending)
    public boolean isSorted(int[] numbers) {
        return false;
    }

    //TODO
    // Find the index of the first occurrence of value, -1 if not found
    public int indexOf(int[] numbers, int value) {
        return -2;
    }

    //TODO
    // Multiply each element by the factor (array is modified!)
    public void multiplyBy(int[] numbers, int factor) {
    }

    //TODO
    // Create a new array by concatenating two arrays
    public int[] concatenate(int[] first, int[] second) {
        return null;
    }

    //TODO
    // Calculate the average of all values (as double)
    public double average(int[] numbers) {
        return -1;
    }

    //TODO
    // Remove all duplicates and return a new array
    // TIP: Use a temporary array and count unique elements
    public int[] removeDuplicates(int[] numbers) {

        return null;
    }

    public static void main(String[] args) {
        //No need to edit
        Method[] methods = ArrayTasks.class.getDeclaredMethods();
        Class<?> clazz = ArrayTasks.class;

        MainProvider.printAscii();
        for(Method method: methods){
            if(method.getName().equals("main")) continue;
            if ("createSequence".equals(method.getName())) MainProvider.exec(method, clazz, 10);
            if ("findMax".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("sum".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("countOccurrences".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{3, 5, 1, 8, 2, 3, 3}, 3);
            if ("reverse".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("filterEven".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("isSorted".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{1, 2, 3, 4, 5});
            if ("indexOf".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{3, 5, 1, 8, 2}, 8);
            if ("multiplyBy".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{3, 5, 1, 8, 2}, 2);
            if ("concatenate".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{1,2,3}, new int[]{4,5,6});
            if ("average".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("removeDuplicates".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2, 3, 5, 1});
        }
    }
}