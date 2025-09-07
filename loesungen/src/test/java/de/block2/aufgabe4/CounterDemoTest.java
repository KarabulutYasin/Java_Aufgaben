package de.block2.aufgabe4;

import de.block2.aufgabe4.CounterDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CounterDemoTest {

    @BeforeEach
    void resetCounterBeforeEach(){
        Class counterDemoClass = CounterDemo.class;
        try{
            CounterDemo obj = (CounterDemo) counterDemoClass.getDeclaredConstructor(String.class).newInstance("BeforeEach");
            Method resetCounterMethod = CounterDemo.class.getMethod("resetCounter");
            resetCounterMethod.invoke(obj);
        }catch (Exception e) {
            assert false : "Fehler beim Zurücksetzen des Counters vor dem Test";
        }
    }

    @Test
    void counterDemo_konstruktor_exists(){
        Class counterDemoClass = CounterDemo.class;
        try{
            counterDemoClass.getConstructor(String.class);
        }catch (Exception e){
            assert false : "Konstruktor mit String-Parameter existiert nicht";
        }
    }

    @Test
    void declared_method_exists(){
        Class counterDemoClass = CounterDemo.class;
        String[] methodNames = {"getName","getAnzahlErzeugteObjekte","resetCounter"};
        Class<?>[] returnTypes = {String.class,int.class,void.class};
        Class<?>[][] paramTypes = {{},{},{}};
        try{
            for (int i = 0; i < methodNames.length;i++){
                Method currentMethode = counterDemoClass.getMethod(methodNames[i],paramTypes[i]);
                assertEquals(returnTypes[i],currentMethode.getReturnType(),"Methode "+methodNames[i]+" hat nicht den erwarteten Rückgabetyp");
            }
        } catch (Exception e) {
            assert false : "Methode "+methodNames[e.getStackTrace()[0].getLineNumber()]+" existiert nicht";
        }
    }

    @Test
    void counter_is_static(){
        Class counterDemoClass = CounterDemo.class;
        try{
            var field = counterDemoClass.getDeclaredField("counter");
            assert field != null : "Feld 'counter' existiert nicht";
            assert java.lang.reflect.Modifier.isStatic(field.getModifiers()) : "Feld 'counter' ist nicht static";
        }catch (Exception e){
            assert false : "Feld 'counter' existiert nicht";
        }
    }

    @Test
    void resetCounter_sets_counter_to_zero(){
        Class counterDemoClass = CounterDemo.class;
        try{
            Method resetCounterMethod = counterDemoClass.getMethod("resetCounter");
            Method getAnzahlErzeugteObjekteMethod = counterDemoClass.getMethod("getAnzahlErzeugteObjekte");
            CounterDemo obj1 = (CounterDemo) counterDemoClass.getConstructor(String.class).newInstance("A");
            CounterDemo obj2 = (CounterDemo) counterDemoClass.getConstructor(String.class).newInstance("b");
            assertEquals(2,getAnzahlErzeugteObjekteMethod.invoke(obj1),"Counter wurde nicht hochgesetzt bei der Erstellung eines Objekts");
            resetCounterMethod.invoke(obj1);
            assertEquals(0,getAnzahlErzeugteObjekteMethod.invoke(obj1),"Counter ist nicht 0 nach dem Reset");
            assertEquals(0,getAnzahlErzeugteObjekteMethod.invoke(obj2),"Counter ist nicht 0 nach dem Reset");

            CounterDemo obj3 = (CounterDemo) counterDemoClass.getConstructor(String.class).newInstance("C");
            assertEquals(1,getAnzahlErzeugteObjekteMethod.invoke(obj1),"Counter wird nicht hochgetzt nach der Erstellung eines Objekts");
        }catch (Exception e) {
            assert false : "Fehler bei der Erstellung eines Objekts";
        }
    }

    @Test
    void getName_returns_name(){
        Class counterDemoClass = CounterDemo.class;
        try{
            Method getNameMethod = counterDemoClass.getMethod("getName");
            CounterDemo obj1 = (CounterDemo) counterDemoClass.getConstructor(String.class).newInstance("TestName");
            assertEquals("TestName",getNameMethod.invoke(obj1),"getName gibt nicht den korrekten Namen zurück");
        }catch (Exception e) {
            assert false : "Fehler bei der Erstellung eines Objekts";
        }
    }

    @Test
    void invalidNameThrowsException() {
        Class counterDemoClass = CounterDemo.class;
        try {
            Constructor<CounterDemo> counterConstructor = counterDemoClass.getDeclaredConstructor(String.class);
            assertThrows(IllegalArgumentException.class, () -> {
                try {
                    counterConstructor.newInstance(""); // ungültiger Wert
                } catch (InvocationTargetException e) {
                    // eigentliche Exception ist eingepackt -> weiterwerfen
                    throw (RuntimeException) e.getCause();
                }
            });
            assertThrows(IllegalArgumentException.class, () -> {
                try {
                    counterConstructor.newInstance(null); // ungültiger Wert
                } catch (InvocationTargetException e) {
                    // eigentliche Exception ist eingepackt -> weiterwerfen
                    throw (RuntimeException) e.getCause();
                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}