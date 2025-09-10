package de.a.fundamentals.loesungen4;

import java.util.Scanner;

public class IOExamples {
    //TODO
    // Gegeben ist eine Instanz von Scanner
    // Schreibe eine Methode die den Namen in der ersten Zeile und das Alter in der zweiten Zeile einliest
    // und als String zurückgibt

    //Bsp
    // Eingabe:
    // Max
    // 25
    // Rückgabe: "Name: Max, Alter: 25"

    public String readNameAndAge(Scanner sc) {
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = sc.nextLine();
        System.out.print("Bitte gib dein Alter ein: ");
        int age = sc.nextInt();
        return "Name: " + name + ", Alter: " + age;
    }
}
