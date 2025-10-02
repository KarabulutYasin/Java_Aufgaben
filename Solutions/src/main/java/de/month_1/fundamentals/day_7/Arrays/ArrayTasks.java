package de.month_1.fundamentals.day_7.Arrays;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class ArrayTasks {

    //TODO
    // Work with arrays to solve the following tasks
    // Use both for-loops and for-each loops for practice

    //TODO
    // Create an int array of size n and fill it with the numbers 1 to n
    public int[] createSequence(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    //TODO
    // Find the maximum in an array
    public int findMax(int[] numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("Array must not be empty");

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //TODO
    // Calculate the sum of all elements in the array
    public int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    //TODO
    // Count how often a certain value occurs in the array
    public int countOccurrences(int[] numbers, int value) {
        int count = 0;
        for (int num : numbers) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

    //TODO
    // Reverse the order of the elements (array is modified!)
    public void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }

    //TODO
    // Create a copy of the array with only the even numbers
    public int[] filterEven(int[] numbers) {
        // First count how many even numbers there are
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        // Create and fill new array
        int[] evenNumbers = new int[evenCount];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }

        return evenNumbers;
    }

    //TODO
    // Check if the array is sorted (ascending)
    public boolean isSorted(int[] numbers) {
        if (numbers.length <= 1) return true;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //TODO
    // Find the index of the first occurrence of value, -1 if not found
    public int indexOf(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //TODO
    // Multiply each element by the factor (array is modified!)
    public void multiplyBy(int[] numbers, int factor) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= factor;
        }
    }

    //TODO
    // Create a new array by concatenating two arrays
    public int[] concatenate(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        // Copy first array
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }

        // Append second array
        for (int i = 0; i < second.length; i++) {
            result[first.length + i] = second[i];
        }

        return result;
    }

    //TODO
    // Calculate the average of all values (as double)
    public double average(int[] numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("Array must not be empty");

        return (double) sum(numbers) / numbers.length;
    }

    //TODO
    // Remove all duplicates and return a new array
    // TIP: Use a temporary array and count unique elements
    public int[] removeDuplicates(int[] numbers) {
        if (numbers.length == 0) return new int[0];

        // Temporary array for unique values
        int[] temp = new int[numbers.length];
        int uniqueCount = 0;

        for (int num : numbers) {
            boolean exists = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (temp[i] == num) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                temp[uniqueCount++] = num;
            }
        }

        // Final array with correct size
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
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