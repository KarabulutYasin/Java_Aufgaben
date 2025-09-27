# Skript - Lineare Programme

## Inhaltsverzeichnis

- [Ausgabe auf der Konsole](#ausgabe-von-texten)
- [Rechenoperationen](#rechenoperationen)
- [Konkatenieren von Strings](#konkatenation-von-strings-)
- [Aufruf von Methoden](#aufruf-von-methoden-innerhalb-einer-klasse)

### Ausgabe von Texten

<details>

 Wir können Texte mit `System.out.println();` ausgeben lassen

```java
System.out.println("Ich liebe Java"); // Würde "Ich liebe Java" ausgeben
```

</details>

### Rechenoperationen

<details>

In Java gibt es auch verschiedenste Rechenoperation

| Rechenart                                                                 | Zeichen in Java |
|---------------------------------------------------------------------------|-----------------|
| Plus                                                                      | +               |
| Minus                                                                     | -               |
| Mal                                                                       | *               |
| Geteilt (Wichtig bei int eine Ganzzahldivision die IMMER abgerundet wird) | /               |
| [Modulo](https://meinstein.ch/math/die-modulo-rechnung-einfach-erklaert/) | %               |
| Bitweise Linksverschiebung                                                | <<              |
| Bitweise Rechtsverschiebung                                               | \>>             |
| Inkrement (Einen hochzählen)                                              | ++              |
| Dekrement (Einen runterzählen)                                            | --              |

Beispiel:

```java
10 + 5; // Ergibt 15
10 - 5; // Ergibt 5
10 * 5; // Ergibt 50
10 / 4; // Ergibt 2
10.0 / 2; // Ergibt 5.0
10 % 3; // Ergibt 1
```

</details>

### Konkatenation von Strings 

<details>
Konkatenation bedeutet das aneinanderhängen von Strings(Zeichenketten)

```java
String name = "Max";
String begruessung = "Hallo " + name; // Ergibt "Hallo Max"
```

Es folgt noch eine Effizientere möglichkeit Strings zu konkatenieren
</details>

### Aufruf von Methoden innerhalb einer Klasse

<details>
Methoden sind kleine Codeblöcke die eine bestimmte Aufgabe erfüllen. Diese können wir in Java mit dem Namen der Methode und Klammern aufrufen.

Im Folgendem Beispiel rufen wir die Methode `meineMethode` innerhalb der Klasse `MeineKlasse` auf.
```java
public class MeineKlasse {
    public static void meineMethode() {
        System.out.println("Hallo Welt");
    }
    
    public void rufeMeineMethodeAuf(){
        meineMethode();
    }
}
```
</details>

### Konvertieren von Datentypen
<details>
In Java gibt es verschiedene Datentypen. Manchmal ist es nötig einen Datentyp in einen anderen zu konvertieren

Hierbei herscht eine Hierarchie der Datentypen wenn man nach der Hierarchie geht wird es Automatisch konvertiert wenn man jedoch in die andere Richtung geht muss man es explizit machen dabei können dann werte verloren gehen

![img.png](../../../../../../resources/img.png)

| Von    | Zu     | Beispiel                               |
|--------|--------|----------------------------------------|
| int    | double | double d = (double) 5;                 |
| double | int    | int i = 5.99;                          |
| String | int    | int i = Integer.parseInt("5");         |
| String | double | double d = Double.parseDouble("5.99"); |
| int    | String | String s = Integer.toString(5);        |
| double | String | String s = Double.toString(5.99);      |

</details>

### Rechenoperationen bei boolean
<details>
boolean sind werte die nur wahr(true) oder falsch(false) sein können

dabei gibt es verschiedene Rechenoperationen

| Rechenart | Zeichen in Java |
|-----------|-----------------|
| UND       | &&              |
| ODER      | \|\|            |
| NICHT     | !               |
| [XOR](https://www.elektronik-kompendium.de/sites/dig/0205186.htm)   | ^               |

Beispiel:

```java
true && false; // Ergibt false
true || false; // Ergibt true
!true; // Ergibt false
true ^ false; // Ergibt true
```
</details>


