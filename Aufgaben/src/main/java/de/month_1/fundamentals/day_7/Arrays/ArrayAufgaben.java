package de.month_1.fundamentals.day_7.Arrays;

import de.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class ArrayAufgaben {

    //TODO
    // Arbeite mit Arrays um die folgenden Aufgaben zu lösen
    // Nutze sowohl for-Schleifen als auch for-each Schleifen zur Übung

    //TODO
    // Erstelle ein int Array der Größe n und fülle es mit den Zahlen 1 bis n
    public int[] createSequence(int n) {
        return null;
    }

    //TODO
    // Finde das Maximum in einem Array
    public int findMax(int[] numbers) {
        return -1;
    }

    //TODO
    // Berechne die Summe aller Elemente im Array
    public int sum(int[] numbers) {
        return -1;
    }

    //TODO
    // Zähle, wie oft ein bestimmter Wert im Array vorkommt
    public int countOccurrences(int[] numbers, int value) {
        return -1;
    }

    //TODO
    // Kehre die Reihenfolge der Elemente um (Array wird modifiziert!)
    public void reverse(int[] numbers) {
    }

    //TODO
    // Erstelle eine Kopie des Arrays nur mit den geraden Zahlen
    public int[] filterEven(int[] numbers) {
        return null;
    }

    //TODO
    // Prüfe, ob das Array sortiert ist (aufsteigend)
    public boolean isSorted(int[] numbers) {
        return false;
    }

    //TODO
    // Finde den Index des ersten Vorkommens von value, -1 wenn nicht gefunden
    public int indexOf(int[] numbers, int value) {
        return -2;
    }

    //TODO
    // Multipliziere jedes Element mit dem Faktor (Array wird modifiziert!)
    public void multiplyBy(int[] numbers, int factor) {
    }

    //TODO
    // Erstelle ein neues Array durch Zusammenfügen zweier Arrays
    public int[] concatenate(int[] first, int[] second) {
        return null;
    }

    //TODO
    // Berechne den Durchschnitt aller Werte (als double)
    public double average(int[] numbers) {
        return -1;
    }

    //TODO
    // Entferne alle Duplikate und gebe ein neues Array zurück
    // TIPP: Verwende ein temporäres Array und zähle eindeutige Elemente
    public int[] removeDuplicates(int[] numbers) {

        return null;
    }

    public static void main(String[] args) {
        //Muss nicht bearbeitet werden
        Method[] methods = ArrayAufgaben.class.getDeclaredMethods();
        Class<?> clazz = ArrayAufgaben.class;

        MainProvider.printAscii();
        for(Method method: methods){
            if(method.getName().equals("main")) continue;
            if ("createSequence".equals(method.getName())) MainProvider.exec(method, clazz, 10);
            if ("findMax".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("sum".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("countOccurrences".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2, 3, 3}, 3);
            if ("reverse".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("filterEven".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("isSorted".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{1, 2, 3, 4, 5});
            if ("indexOf".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{3, 5, 1, 8, 2}, 8);
            if ("multiplyBy".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{3, 5, 1, 8, 2}, 2);
            if ("concatenate".equals(method.getName())) MainProvider.exec(method, clazz, new int[]{1,2,3}, new int[]{4,5,6});
            if ("average".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2});
            if ("removeDuplicates".equals(method.getName())) MainProvider.exec(method, clazz, (Object) new int[]{3, 5, 1, 8, 2, 3, 5, 1});
        }
    }
}