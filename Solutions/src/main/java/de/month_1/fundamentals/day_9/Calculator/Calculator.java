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

    private double number1;
    private double number2;
    private String operator;

    // It is possible like this but should not be done this way, later we will see how to do it better with design patterns

    public double calculate(String pattern) {
        //TODO
        String[] patternParts = splitPattern(pattern);
        setAttributes(patternParts);
        return compute();
    }

    public String[] splitPattern(String pattern) {
        String[] result = pattern.split(" ");
        if (result.length ==3)return result;
        else throw new RuntimeException("Invalid pattern");
    }

    public void setAttributes(String[] patternParts) {
        try {
            number1 = Double.parseDouble(patternParts[0]);
            operator = patternParts[1];
            number2 = Double.parseDouble(patternParts[2]);
        }catch (NumberFormatException e) {
            throw new RuntimeException("Invalid number");
        }
    }

    public double compute() {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) throw new RuntimeException("Division by zero not possible");
                return number1 / number2;
            default:
                throw new RuntimeException("Invalid operator");
        }
    }

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
