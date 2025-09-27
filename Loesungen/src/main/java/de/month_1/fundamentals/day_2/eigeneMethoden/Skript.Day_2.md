# Skript Eigene Methoden

## Inhaltsverzeichnis
- [Was sind Methoden?](#was-sind-methoden)
- [Die Syntax (Rechtschreibung) einer Methode](#die-syntax-rechtschreibung-einer-methode)
- [Die Sichtbarkeit einer Methode](#die-sichtbarkeit-einer-methode)
- [Der Rückgabetyp einer Methode](#der-rückgabetyp-einer-methode)
- [Die Parameter einer Methode](#die-parameter-einer-methode)

### Die Syntax (Rechtschreibung) einer Methode wird in mehrere Aspekte gegliedert die jeweils bestimmte Aufgaben erfüllen.

<details>
    <summary>Syntax</summary>

\<Sichtbarkeit> \<Rückgabetyp> \<NameDerMethode>(\<Parameter>) { 

     Code was die Methode ausführt 

}

Beispiele:

```java
public void meineMethode() {
    System.out.println("Hallo Welt");
}
```
Diese Methode hat die Sichtbarkeit "public", gibt keinen Wert zurück (void) und hat keine Parameter.
```java
private int addiere(int a, int b) {
    return a + b;
}
```
Diese Methode hat die Sichtbarkeit "private", gibt einen int-Wert zurück und hat zwei Parameter (int a, int b).
```java
String begruesse(String name) {
    return "Hallo " + name;
}
```
Diese Methode hat die Sichtbarkeit "package protected" (default), gibt einen String zurück und hat einen Parameter (String name).
</details>

### Die Sichtbarkeit einer Methode bestimmt von wo aus die Methode aufgerufen werden kann.

<details>
    <summary>Sichtbarkeiten</summary>

- ### public
    - Die Methode ist von überall aus aufrufbar.
- ### private
    - Die Methode ist nur innerhalb der Klasse aufrufbar in der sie definiert wurde.
- ### protected
    - Die Methode ist innerhalb der Klasse und in allen Unterklassen aufrufbar.
- ### package protected (per default also wenn nichts angegeben wird)
    - Die Methode ist innerhalb des Pakets aufrufbar.
    - und gleichzeitig Protected
  
</details>

### Der Rückgabetyp einer Methode bestimmt welchen Datentyp die Methode zurückgibt wenn sie aufgerufen wird.

<details>
    <summary>Rückgabetypen</summary>

- ### void
    - Die Methode gibt keinen Wert zurück.
- ### Primitive Datentypen
    - int, double, boolean, char, byte, short, long, float
    - Die Methode gibt einen Wert des jeweiligen primitiven Datentyps zurück.
- ### Referenzdatentypen
    - String, Arrays, Objekte (z.B. eigene Klassen)
    - Die Methode gibt einen Wert des jeweiligen Referenzdatentyps zurück.
</details>  

### Die Parameter einer Methode sind Variablen die der Methode übergeben werden wenn sie aufgerufen wird.
<details>
    <summary>Parameter</summary>

- ### Eine Methode kann keine, einen oder mehrere Parameter haben.
- ### Jeder Parameter hat einen Datentyp und einen Namen.
- ### Parameter werden durch Kommas getrennt.
- ### WICHTIG!!! Parameter sind nur innerhalb der Methode sichtbar.
</details>  