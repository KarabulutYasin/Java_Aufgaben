package de.a.fundamentals.f.klassen;

import de.a.fundamentals.z.exception.AlterNegativException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person getPerson(String name, int alter){
        try {
            Constructor<Person> personConstructor = Person.class.getConstructor(String.class, int.class);
            personConstructor.setAccessible(true);
            return personConstructor.newInstance(name, alter);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    Method getSpecificMethod(String methodName,Class<?>[] parameter){
        try{
            Method personMethod = Person.class.getMethod(methodName,parameter);
            personMethod.setAccessible(true);
            return personMethod;
        }catch (Exception e){
            throw new RuntimeException("The method "+methodName+ " was not found");
        }
    }

    @ParameterizedTest
    @CsvSource({"Ali,21", "Max,17"})
    void person_toString_format(String name, int alter) {
        Person person = getPerson(name,alter);
        assertTrue(person.toString().contains("Name: "+name+", Alter: "+ alter),"Expected Format was: Name: Max, Alter: 21\nBut was: "+person.toString());
    }

    @ParameterizedTest
    @CsvSource({"Mehmet,-1", "Max,-10"})
    void person_with_negativeAge_constructor_throws(String name,int alter) {
        assertThrows(RuntimeException.class,()-> getPerson(name,alter),"Constructor with negativ age should throw but didn't");
    }

    @ParameterizedTest
    @CsvSource({
        ",21",
        ",1"
    })
    void person_with_empty_name_throws(String name, int alter){
        assertThrows(RuntimeException.class,()-> getPerson(name,alter),"Constructor with empty name should throw but didn't");
    }

    //Setter

    @ParameterizedTest
    @CsvSource({
            "Max",
            "Marie",
            "Marvin"
    })
    void getNameAndSetName_work(String name) {
        Person person = getPerson("name",20);
        assertDoesNotThrow(()-> {
            getSpecificMethod("setName",new Class<?>[]{String.class}).invoke(person,name);
            assertEquals(name,getSpecificMethod("getName",new Class<?>[]{}).invoke(person),"Getter doesn't returns as aspected");
        },"Getter setter or both is missing");
    }

    @ParameterizedTest
    @CsvSource({
            "12",
            "15"
    })
    void getAlterAndSetAlter_work(int age) {
        Person person = getPerson("Max",20);
        assertDoesNotThrow(() -> {
            getSpecificMethod("setAge", new Class<?>[]{int.class}).invoke(person,age);
            assertEquals(age,getSpecificMethod("getAge",new Class[]{}).invoke(person));
        });
    }

    @ParameterizedTest
    @CsvSource({
            "-10",
            "-5"
    })
    void setAge_negative_input_throws(int age) {
        Person person = getPerson("Max",age);
        try{
            getSpecificMethod("setAge",new Class<?>[]{int.class}).invoke(person,age);
        }catch (Exception e){
            assertInstanceOf(RuntimeException.class, e.getCause().getCause());
        }
    }

    @Test
    void toString_formatMatches() {
        Person p = new Person("Max",0);
        p.setName("Marvin");
        p.setAge(30);
        assertEquals("Name: Marvin, Alter: 30", p.toString());
    }
}