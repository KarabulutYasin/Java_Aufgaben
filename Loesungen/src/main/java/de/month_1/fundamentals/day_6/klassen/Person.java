package de.month_1.fundamentals.day_6.klassen;

import de.month_1.fundamentals.day_6.klassen.exception.EmptyNameException;
import de.month_1.fundamentals.z.exception.AlterNegativException;

public class Person {
    //TODO
    // Schreibe eine Klasse Person welche die Attributen name und alter hat
    // Schreibe einen jedes Argument Konstruktor (AllArgs)
    // Schreibe dafür eine AlterNegativException und Throw sie falls die person unter 0 Jahre ist
    // Schreibe eine toString Methode die ausgibt wie bei folgendem Beispiel
    // Schreibe Getter und Setter
    //TIPP Achte darauf das eine Person nicht unter 0 Jahre sein kann

    // Name: Yasin, Alter: 21
    private String name;
    private int age;


    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new EmptyNameException("Name darf nicht leer sein");
        else this.name = name;
    }

    public void setAge(int alter) {
        if (alter < 0) throw new AlterNegativException("Alter darf nicht negativ sein");
        this.age = alter;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Alter: " + age;
    }
}
