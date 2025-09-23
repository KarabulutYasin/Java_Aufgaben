package de.a.fundamentals.day_6.klassen.exception;

public class EmptyNameException extends RuntimeException {
    public EmptyNameException(String message) {
        super(message);
    }
}
