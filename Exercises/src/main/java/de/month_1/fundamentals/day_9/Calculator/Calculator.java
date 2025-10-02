package de.month_1.fundamentals.day_9.Calculator;

public class Calculator {
    //TODO
    // A calculator should be created that can handle the basic arithmetic operations.
    // The calculator receives a specific pattern, should process it and return the result.
    // The 4 operations plus, minus, multiply, divide should be considered.
    // If errors occur, an appropriate error message should be output.
    // You can create any number of attributes, helper methods, and helper classes to keep things clear.

    // The pattern is as follows:
    // <number1> <space> <operator> <space> <number2>
    // Example: 5 + 3 -> 8
    // Example: 10 / 2 -> 5
    // Example: 7* 4 -> Error "Invalid pattern"
    // Example: 9 -3 -> Error "Invalid pattern"
    // Example: 8 / 0 -> Error "Division by zero not possible"
    // Example: 6 ^ 2 -> Error "Invalid operator"
    // Example: 4 + a -> Error "Invalid number"
    // etc.

    public double calculate(String pattern) {return -1;}

    public static void main(String[] args){
        // Does not need to be edited
        Calculator calc = new Calculator();
        String divider = "---------------------";
        String[] equations = {"5 + 3", "10 / 2", "7* 4", "9 -3", "8 / 0", "6 ^ 2", "4 + a"};

        for (String equation : equations) {
            System.out.println(divider);
            try {
                System.out.println("calculate with string: " + equation + ":");
                System.out.println(calc.calculate(equation));
            } catch (RuntimeException e) {
                System.out.println(equation + " -> Error: " + e.getMessage());
            }
        }
        System.out.println(divider);
    }
}
