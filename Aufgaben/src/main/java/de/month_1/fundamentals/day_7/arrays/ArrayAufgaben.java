package de.month_1.fundamentals.day_7.arrays;

import java.util.Arrays;

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
        ArrayAufgaben aa = new ArrayAufgaben();
        String divider = "------------------------------";

        System.out.println(divider);
        System.out.println("createSequence mit parameter 10:");
        System.out.println(Arrays.toString(aa.createSequence(10)));

        System.out.println(divider);
        System.out.println("findMax mit array {3, 1, 4, 1, 5, 9}:");
        System.out.println(aa.findMax(new int[]{3, 1, 4, 1, 5, 9}));

        System.out.println(divider);
        System.out.println("sum mit array {1, 2, 3, 4, 5}:");
        System.out.println(aa.sum(new int[]{1, 2, 1, 3, 1}));

        System.out.println(divider);
        System.out.println("countOccurrences von 1 im array {1, 2, 1, 3, 1}:");
        System.out.println(aa.countOccurrences(new int[]{1, 2, 1, 3, 1}, 1));

        System.out.println(divider);
        System.out.println("reverse von array {1, 2, 3, 4, 5}:");
        int[] arrToReverse = {1, 2, 3, 4, 5};
        aa.reverse(arrToReverse);
        System.out.println(Arrays.toString(arrToReverse));

        System.out.println(divider);
        System.out.println("filterEven von array {1, 2, 3, 4, 5, 6}:");
        int[] evenFiltered = aa.filterEven(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(Arrays.toString(evenFiltered));

        System.out.println(divider);
        System.out.println("isSorted von array {1, 2, 3, 4, 5}:");
        System.out.println(aa.isSorted(new int[]{1, 2, 3, 4, 5}));

        System.out.println(divider);
        System.out.println("Index of 3 in array {1, 2, 3, 4, 5}:");
        System.out.println(aa.indexOf(new int[]{1, 2, 3, 4, 5}, 3));

        System.out.println(divider);
        System.out.println("multiplyBy 2 in array {1, 2, 3}:");
        int[] arrToMultiply = {1, 2, 3};
        aa.multiplyBy(arrToMultiply, 2);
        System.out.println(Arrays.toString(arrToMultiply));

        System.out.println(divider);
        System.out.println("concatenate arrays {1, 2} and {3, 4}:");
        int[] concatenated = aa.concatenate(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(Arrays.toString(concatenated));

        System.out.println(divider);
        System.out.println("Average of array {1, 2, 3, 4, 5}:");
        System.out.println(aa.average(new int[]{1, 2, 3, 4, 5}));

        System.out.println(divider);
        System.out.println("removeDuplicates from array {1, 2, 2, 3, 3, 4}:");
        int[] noDuplicates = aa.removeDuplicates(new int[]{1, 2, 2, 3, 3, 4});
        System.out.println(Arrays.toString(noDuplicates));
        System.out.println(divider);
    }
}