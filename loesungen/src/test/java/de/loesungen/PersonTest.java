package de.loesungen;

import de.loesungen.exception.AlterNegativException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void person_toString_format() {
        Person p = new Person("Ali", 21);
        assertEquals("Name: Ali, Alter: 21", p.toString());
    }

    @Test
    void person_negativeAge_throws() {
        assertThrows(AlterNegativException.class, () -> new Person("Mehmet", -1));
        Person p = new Person("Berke", 0);
        assertThrows(AlterNegativException.class, () -> p.setAlter(-5));
    }
    @Test
    void getNameAndSetName_work() {
        Person p = new Person("",0);
        p.setName("Ali");
        assertEquals("Ali", p.getName());
    }

    @Test
    void getAlterAndSetAlter_work() {
        Person p = new Person("",0);
        p.setAlter(25);
        assertEquals(25, p.getAlter());
    }

    @Test
    void setAlter_negative_throws() {
        Person p = new Person("",0);
        assertThrows(AlterNegativException.class, () -> p.setAlter(-10));
    }

    @Test
    void toString_formatMatches() {
        Person p = new Person("",0);
        p.setName("Marvin");
        p.setAlter(30);
        assertEquals("Name: Marvin, Alter: 30", p.toString());
    }
}