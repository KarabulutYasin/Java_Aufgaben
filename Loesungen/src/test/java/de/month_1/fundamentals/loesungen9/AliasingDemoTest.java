package de.month_1.fundamentals.loesungen9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AliasingDemoTest {

    @Test
    void copyArray_createsIndependentArray() {
        int[] input = {1,2,3};
        int[] result = new AliasingDemo().copyArray(input);

        assertArrayEquals(input,result,"Der Inhalt der Arrays ist unterschiedlich");
        assertNotSame(input,result,"Referenz ist die selbe");
    }
}
