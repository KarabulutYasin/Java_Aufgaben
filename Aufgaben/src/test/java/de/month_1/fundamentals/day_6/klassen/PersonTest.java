package de.month_1.fundamentals.day_6.klassen;

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
    @CsvSource({"Mehmet,-1", "Max,-10",",10",",12"})
    void person_with_invalid_parameter_in_constructor_should_throw(String name,int age) {
        assertThrows(RuntimeException.class,()-> getPerson(name,age),"Constructor should throw RuntimeException with the Parameter: ["+name+","+age+"] but didn't");
    }

    @ParameterizedTest
    @CsvSource({"Max", "Marie", "Marvin"})
    void setName_and_getName_work(String name) {
        Person person = getPerson("name",20);
        assertDoesNotThrow(()-> {
            getSpecificMethod("setName",new Class<?>[]{String.class}).invoke(person,name);
            assertEquals(name,getSpecificMethod("getName",new Class<?>[]{}).invoke(person),"Getter doesn't return the name which was given in constructor");
        },"Getter setter or both is missing");
    }

    @Test
    void setName_with_empty_name_should_throw(){
        Person person = getPerson("Max",20);
        try{
            getSpecificMethod("setName",new Class<?>[]{String.class}).invoke(person,"");
        }catch (Exception e){
            assertInstanceOf(RuntimeException.class,e.getCause());
        }
    }

    @ParameterizedTest
    @CsvSource({"12","20"})
    void setAge_and_getAge_work(int age){
        Person person = getPerson("Max",10);
        assertDoesNotThrow(() -> {
            getSpecificMethod("setAge",new Class<?>[]{int.class}).invoke(person,age);
            assertEquals(age,getSpecificMethod("getAge",new Class<?>[]{}).invoke(person),"Getter doesn't return age which was given in constructor");
        },"Getter setter or both is missing");
    }

    @ParameterizedTest
    @CsvSource({"-10", "-5"})
    void setAge_negative_input_should_throw(int age) {
        Person person = getPerson("Max",10);

        try{
            getSpecificMethod("setAge",new Class<?>[]{int.class}).invoke(person,age);
        }catch (Exception e){
            assertInstanceOf(RuntimeException.class, e.getCause(),"\"setAge\" with negativ input should throw instance of RuntimeException but didn't throw");
        }
    }

    @ParameterizedTest
    @CsvSource({"Ali,21", "Max,17"})
    void person_toString_format(String name, int alter) {
        Person person = getPerson(name,alter);
        assertTrue(person.toString().contains("Name: "+name+", Alter: "+ alter),"Expected Format was: Name: Max, Alter: 21\nBut was: "+person);
    }
    @ParameterizedTest
    @CsvSource({
            "Max,20",
            "Marvin,15"
    })
    void toString_formatMatches(String name,int age) {
        assertDoesNotThrow(()->{
            Person person = getPerson("Mustafa",10);
            getSpecificMethod("setName",new Class<?>[]{String.class}).invoke(person,name);
            getSpecificMethod("setAge",new Class<?>[]{int.class}).invoke(person,age);
            assertEquals("Name: "+ name +", Alter: "+age, person.toString(),"Expected was \"Name: "+name+", Alter: "+age+"\n but was: "+person.toString());
        },"Constructor setter or toString is missing");
    }
}