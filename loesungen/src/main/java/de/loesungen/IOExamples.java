package de.loesungen;

import java.util.Scanner;

public class IOExamples {

    // ... printExamples wie oben

    // Liest Name und Alter von der "Tastatur" (Scanner) ein
    public String readNameAndAge(Scanner sc) {
        System.out.print("Bitte gib deinen Namen ein: ");
        String name = sc.nextLine();
        System.out.print("Bitte gib dein Alter ein: ");
        int age = sc.nextInt();
        return "Name: " + name + ", Alter: " + age;
    }
}
