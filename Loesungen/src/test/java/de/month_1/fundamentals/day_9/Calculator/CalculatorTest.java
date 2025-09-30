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
    void berechne_with_valid_input(String input, double expected) {
        assertEquals(expected, calculator.berechne(input));
    }

    @ParameterizedTest
    @CsvSource({
        "7* 4, Ungültiges Pattern",
        "9 -3, Ungültiges Pattern",
        "8 / 0, Division durch Null nicht möglich",
        "6 ^ 2, Ungültige Rechenart",
        "4 + a, Ungültige Zahl",
        "5 & 2, Ungültige Rechenart",
        "10 / 0, Division durch Null nicht möglich",
        "abc + 5, Ungültige Zahl",
        "5 + , Ungültiges Pattern",
        " + 5, Ungültiges Pattern"
    })
    void berechne_with_invalid_input(String input, String expectedMessage) {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.berechne(input));
        assertEquals(expectedMessage, exception.getMessage());
    }
}