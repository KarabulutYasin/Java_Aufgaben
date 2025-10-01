package de.month_1.fundamentals.day_5.ControlStructures;

import de.utiltiy.MainProvider;

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
    public String gradeToText(int grade) {return null;}

    //TODO
    // Day of week number (1=Mon..7=Sun) -> "Weekday"/"Weekend"
    // If a number is outside 1..7 -> "Invalid"
    public String dayType(int day) {return null;}

    //TODO
    // Sum 1...n (inclusive of 1 and n)
    public int sumOneToN(int n) {return -1;}

    //TODO
    // Add up the length of all strings (without modifying the list!)
    public int totalLength(List<String> items) {return -1;}

    //TODO
    // Count how many times x must be doubled to reach >= limit.
    public int doublesUntilAtLeast(int start, int limit) {return 0;}

    //TODO
    // Find the first even value in the list, if there is none return -1
    public int firstEven(List<Integer> nums) {return -2;}

    //TODO
    // Sum only the positive numbers (skip negatives)
    public int sumPositives(List<Integer> nums) {return -1;}

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
