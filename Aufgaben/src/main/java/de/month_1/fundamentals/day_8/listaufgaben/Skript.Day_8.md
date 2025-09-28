# Skript Listen und eigene Exception

## Inhaltsverzeichnis
- [Was sind Listen?](#was-sind-listen)
- [Listen erstellen und verwenden](#listen-erstellen-und-verwenden)
- [Elemente hinzufügen und entfernen](#elemente-hinzufügen-und-entfernen)
- [Listen sortieren](#listen-sortieren)
- [Listen in Strings umwandeln](#listen-in-strings-umwandeln)

### Was sind Listen?
<details>
    <summary>Definition</summary>
    Listen sind dynamische Datenstrukturen, die mehrere Werte speichern können. Sie sind flexibler als Arrays und können beliebig wachsen.
</details>

### Listen erstellen und verwenden
<details>
    <summary>List erstellen</summary>
    In Java gibt es verschiedene List-Typen, z.B. `ArrayList`.

Beispiel um eine liste zu erstellen in der nur Strings gespeichert werden können:
```java
List<String> namen = new ArrayList<>();
```
</details>

### Elemente hinzufügen und entfernen
<details>
    <summary>Elemente hinzufügen/entfernen</summary>

Mit `add()` fügst du Elemente hinzu, mit `remove()` entfernst du sie.
```java
namen.add("Max");
namen.remove("Max");
```
</details>

### Listen sortieren
<details>
    <summary>Listen sortieren</summary>

Listen kannst du mit `Collections.sort()` sortieren.

```java
Collections.sort(namen);
```

</details>

### Listen in Strings umwandeln
<details>
    <summary>Listen in Strings umwandeln</summary>

Du kannst eine Liste in einen String umwandeln, indem du die Elemente mit einem Trennzeichen verbindest.    
```java
//Wir haben eine Liste "namen" in der die Namen "Max", "Anna" und "Tom" gespeichert sind
//Folgenden befehle haben unterschiedliche ausgaben 

System.out.println(namen.toString()); // [Max, Anna, Tom]

String alleNamen = String.join(", ", namen);
System.out.println(alleNamen); // Max, Anna, Tom
```
</details>