package de.a.fundamentals.g.fehlerbehandlung;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionVerwendenTest {

    @Test
    void method_should_thow_runtime(){
        assertThrows(RuntimeException.class,() -> new ExceptionVerwenden().shouldThrow());
    }
}