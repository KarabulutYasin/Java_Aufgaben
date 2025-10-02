package de.month_1.fundamentals.day_5.ControlStructures;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;
import java.util.List;

public class ControlStructures {

    //TODO
    // If a task can be solved in several ways,
    // do it in several ways for practice purposes
    // (for while for each do while)
    // (switch if else)

    //TODO
    // Return grade as text (1..5 -> "Very good".. "Poor", else "Invalid")
    public String gradeToText(int grade) {
        if (grade == 1) return "Very good";
        else if (grade == 2) return "Good";
        else if (grade == 3) return "Satisfactory";
        else if (grade == 4) return "Sufficient";
        else if (grade == 5) return "Poor";
        else return "Invalid";
    }

    //TODO
    // Day of week number (1=Mon..7=Sun) -> "Weekday"/"Weekend"
    // If a number is outside 1..7 -> "Invalid"
    public String dayType(int day) {
        switch (day) {
            case 1, 2, 3, 4, 5:
                return "Weekday";
            case 6, 7:
                return "Weekend";
            default:
                return "Invalid";
        }
    }

    //TODO
    // Sum 1...n (inclusive of 1 and n)
    public int sumOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //TODO
    // Add up the length of all strings (without modifying the list!)
    public int totalLength(List<String> items) {
        int total = 0;
        for (String s : items) {
            total += (s == null ? 0 : s.length());
        }
        return total;
    }

    //TODO
    // Count how many times x must be doubled to reach >= limit.
    public int doublesUntilAtLeast(int start, int limit) {
        int x = start;
        int steps = 0;
        while (x < limit) {
            x *= 2;
            steps++;
        }
        return steps;
    }

    //TODO
    // Find the first even value in the list, if there is none return -1
    public int firstEven(List<Integer> nums) {
        for (int n : nums) {
            if (n % 2 == 0) return n;
        }
        return -1;
    }

    //TODO
    // Sum only the positive numbers (skip negatives)
    public int sumPositives(List<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            if (n <= 0) continue;
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        //No need to edit
        Method[] methods = ControlStructures.class.getDeclaredMethods();
        Class<?> clazz = ControlStructures.class;

        MainProvider.printAscii();
        for (Method method : methods) {
            if (method.getName().equals("main")) continue;
            if("gradeToText".equals(method.getName())) MainProvider.exec(method, clazz, 1);
            if("dayType".equals(method.getName())) MainProvider.exec(method, clazz, 1);
            if("sumOneToN".equals(method.getName())) MainProvider.exec(method, clazz, 5);
            if("totalLength".equals(method.getName())) MainProvider.exec(method, clazz, List.of("Hello", "World"));
            if("doublesUntilAtLeast".equals(method.getName())) MainProvider.exec(method, clazz, 3, 20);
        }
    }
}
