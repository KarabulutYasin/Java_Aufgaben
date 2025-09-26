package de.month_1.fundamentals.day_17.thissuper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VogelSuperTest {

    @Test
    void testSuperConstructorIsUsed() throws Exception {
        Class<?> vogelCls = Class.forName("de.month_1.fundamentals.day_17.thissuper.Vogel");
        Object v = vogelCls.getDeclaredConstructor(String.class).newInstance("Tweety");

        var getName = vogelCls.getSuperclass().getDeclaredMethod("getName");
        assertEquals("Tweety", getName.invoke(v), "Vogel(String) sollte den Super-Konstruktor mit dem Namen aufrufen.");
    }

    @Test
    void testOverrideSound() throws Exception {
        Class<?> vogelCls = Class.forName("de.month_1.fundamentals.day_17.thissuper.Vogel");
        Object v = vogelCls.getDeclaredConstructor(String.class).newInstance("Tweety");

        var lautGeben = vogelCls.getDeclaredMethod("lautGeben");
        assertEquals("Piep", lautGeben.invoke(v), "Vogel.lautGeben() sollte 'Piep' zurückgeben.");
    }

    @Test
    void testSuperAndThisCombined() throws Exception {
        Class<?> vogelCls = Class.forName("de.month_1.fundamentals.day_17.thissuper.Vogel");
        Object v = vogelCls.getDeclaredConstructor(String.class).newInstance("Tweety");

        var combo = vogelCls.getDeclaredMethod("basisUndEigenLaut");
        assertEquals("... Piep", combo.invoke(v),
                "basisUndEigenLaut() sollte super.lautGeben() + ' ' + this.lautGeben() liefern ('... Piep').");
    }
}
