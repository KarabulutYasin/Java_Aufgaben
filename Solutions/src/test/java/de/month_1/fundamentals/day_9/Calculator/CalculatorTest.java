package de.month_1.fundamentals.day_9.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
        "5 + 3, 8",
        "10 / 2, 5",
        "7 * 4, 28",
        "9 - 3, 6",
        "0 + 0, 0",
        "100 - 50, 50",
        "8 * 1, 8",
        "20 / 4, 5",
        "15 + 5, 20",
        "30 - 10, 20"
    })
    void calculate_with_valid_input(String input, double expected) {
        assertEquals(expected, calculator.calculate(input));
    }

    @ParameterizedTest
    @CsvSource({
        "7* 4, Invalid pattern",
        "9 -3, Invalid pattern",
        "8 / 0, Division by zero not possible",
        "6 ^ 2, Invalid operator",
        "4 + a, Invalid number",
        "5 & 2, Invalid operator",
        "10 / 0, Division by zero not possible",
        "abc + 5, Invalid number",
        "5 + , Invalid pattern",
        " + 5, Invalid pattern"
    })
    void calculate_with_invalid_input(String input, String expectedMessage) {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.calculate(input));
        assertEquals(expectedMessage, exception.getMessage());
    }
}