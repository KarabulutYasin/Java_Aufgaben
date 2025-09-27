# Skript Kontrollstrukturen

## Inhaltsverzeichnis
- [Was sind Kontrollstrukturen?](#was-sind-kontrollstrukturen)
- [Bedingungen: if, else, switch](#bedingungen-if-else-switch)
- [Schleifen: for, while, do-while, for-each](#schleifen-for-while-do-while-for-each)

### Was sind Kontrollstrukturen?
<details>
    <summary>Definition</summary>
    Kontrollstrukturen steuern den Ablauf eines Programms. Sie bestimmen, welche Anweisungen ausgeführt werden und wie oft.
</details>

### Bedingungen: if, else, switch
<details>
    <summary>Bedingungen</summary>
    Mit Bedingungen kann man Entscheidungen im Code treffen.

```java
    **if / else Beispiel:**
    int note = 1;
    if (note == 1) {
        System.out.println("Sehr gut");
    } else if (note == 2) {
        System.out.println("Gut");
    } else {
        System.out.println("Ungültig");
    }
    // Man kann else if so oft man will hintereinander klatschen

    **switch Beispiel:**
    int tag = 6;
    switch (tag) {
        case 6:
        case 7:
            System.out.println("Wochenende");
            break;
        default:
            System.out.println("Werktag");
    }
    // Wichtig wenn man kein Break einfügt, wird der Code darunter auch ausgeführt
```
</details>

### Schleifen: for, while, do-while, for-each
<details>
    <summary>Schleifen</summary>
    Schleifenwiederholen Anweisungen, solange eine Bedingung erfüllt ist.

```java
    **for-Schleife:**
    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }
    // wiederholt die schleife bis i<=5 wahr wird danach wird die schleife beendet

    **while-Schleife:**
    int i = 1;
    while (i <= 5) {
        System.out.println(i);
        i++;
    }
    // wiederholt die schleife bis i<=5 wahr wird danach wird die schleife beendet

    **do-while-Schleife:**
    int i = 1;
    do {
        System.out.println(i);
        i++;
    } while (i <= 5);
    // Wie eine While schleife der unterschied ist 
    // das der code mindestens einmal ausgeführt wird
    // egal ob die bedingung erfüllt ist oder nicht 

    **for-each-Schleife:**
    List<String> namen = List.of("Max", "Anna");
    for (String name : namen) {
        System.out.println(name);
    }
    // Iteriert über jedes Element in der Liste
```
</details>