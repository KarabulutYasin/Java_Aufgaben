package de.exception;

public class MeinFehlerException extends RuntimeException {
    public MeinFehlerException(String message) {
        super(message);
    }
}
