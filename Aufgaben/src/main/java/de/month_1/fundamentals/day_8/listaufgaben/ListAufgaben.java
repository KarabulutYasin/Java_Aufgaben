package de.month_1.fundamentals.day_8.listaufgaben;

import java.util.ArrayList;
import java.util.List;

public class ListAufgaben {

    public List returnInstanceOfList(){
        //TODO
        // Schreibe eine Methode die eine Instanz von List zurückgibt dabei ist egal welche art von List

        return null;
    }

    public List returnListWithNumbersOneToTen(){
        //TODO
        // Schreibe eine Methode die eine Liste mit den Zahlen von 1 bis 10 zurückgibt

        return null;
    }

    public String listToString(List list){
        //TODO
        // Schreibe eine Methode die eine Liste als Parameter entgegennimmt und diese als String zurückgibt
        // Wenn die Liste null ist soll der String "null" zurückgegeben werden

        return null;
    }

    public List entferneElement(List list, String element){
        //TODO
        // Schreibe eine Methode die ein Element aus der Liste entfernt und die veränderte Liste zurückgibt
        // Wenn die Liste null ist soll null zurückgegeben werden

        return null;
    }

    public Boolean isElementInList(List list, String element){
        //TODO
        // Schreibe eine Methode die überprüft ob ein Element in der Liste enthalten ist
        // Wenn die Liste null ist soll false zurückgegeben werden

        return false;
    }

    public List sortiereListe(List<Integer> list) {
        //TODO
        // Schreibe eine Methode die eine Liste mit Zahlen als Parameter entgegennimmt und diese in aufsteigender Reihenfolge sortiert zurückgibt
        // Wenn die Liste null ist soll null zurückgegeben werden

        return null;
    }

    public static void main(String[] args) {
        //Muss nicht bearbeitet werden
        ListAufgaben aufgaben = new ListAufgaben();
        String divider = "------------------------------";

        System.out.println(divider);
        System.out.println("returnInstanceOfList");
        System.out.println(aufgaben.returnInstanceOfList());

        System.out.println(divider);
        System.out.println("returnListWithNumbersOneToTen");
        System.out.println(aufgaben.returnListWithNumbersOneToTen());

        System.out.println(divider);
        System.out.println("listToString mit[\"Max\", \"Moritz\"]");
        System.out.println(aufgaben.listToString(List.of("Max", "Moritz")));

        System.out.println(divider);
        System.out.println("entferneElement mit [\"A\", \"B\", \"C\"] und Element B");
        System.out.println(aufgaben.entferneElement(new ArrayList(List.of("A", "B", "C")), "B"));

        System.out.println(divider);
        System.out.println("isElementInList mit [\"A\", \"B\", \"C\"] und Element B");
        System.out.println(aufgaben.isElementInList(new ArrayList(List.of("A", "B", "C")), "B"));

        System.out.println(divider);
        System.out.println("sortiereListe mit [5, 3, 8, 1, 2]");
        System.out.println(aufgaben.sortiereListe(new ArrayList(List.of(5, 3, 8, 1, 2))));
        System.out.println(divider);
    }
}