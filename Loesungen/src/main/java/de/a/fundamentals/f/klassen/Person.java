package de.a.fundamentals.f.klassen;

import de.a.fundamentals.z.exception.AlterNegativException;

public class Person {
    //TODO Schreibe eine Klasse Person welche die Attributen name und alter hat

    //TODO Schreibe einen jedes Argument Konstruktor (AllArgs)

    //TODO Schreibe Getter und Setter

    //TIPP Achte darauf das eine Person nicht unter 0 Jahre sein kann
    //TODO Schreibe dafür eine AlterNegativException und Throw sie falls die person unter 0 Jahre ist

    //TODO Schreibe eine toString Methode die ausgibt wie bei folgendem Beispiel

    /*
    * Name: Yasin, Alter: 21
    * */
    private String name;
    private int alter;


    public Person(String name, int alter) {
        setName(name);
        setAlter(alter);
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return  alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        if (alter < 0) throw new AlterNegativException("Alter darf nicht negativ sein: " + alter);
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }
}
