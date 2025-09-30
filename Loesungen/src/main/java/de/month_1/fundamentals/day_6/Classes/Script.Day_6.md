# Skript Klassen und die Person-Klasse

## Inhaltsverzeichnis
- [Was sind Klassen?](#was-sind-klassen)
- [Attribute und Methoden](#attribute-und-methoden)
- [Konstruktoren](#konstruktoren)
- [Getter und Setter](#getter-und-setter)
- [toString-Methode](#tostring-methode)
- [Eigene Exceptions](#eigene-exceptions)
- [Beispiel: Person-Klasse](#beispiel-person-klasse)

### Was sind Klassen?
<details>
    <summary>Definition</summary>
    
Klassen sind Baupläne für Objekte. Sie bündeln Attribute (Eigenschaften) und Methoden (Funktionen).

Man kann sich also vorstellen das eine Klasse ein Bauplan für ein Auto ist und die instanz der Klasse also das Objekt das Auto in der realität ist welches nach dem Bauplan gebaut wurde.
</details>

### Attribute und Methoden
<details>
    <summary>Attribute und Methoden</summary>
    Attribute speichern den Zustand eines Objekts. Methoden bestimmen das Verhalten.

```java
    Beispiel:
    public class Auto {
        // marke und baujahr sind Attribute
        private String marke;
        private int baujahr;

        // fahren ist eine Methode
        public void fahren() {
            System.out.println("Das Auto fährt.");
        }
    }
```

</details>

### Konstruktoren
<details>
    <summary>Konstruktoren</summary>
 
Konstruktoren initialisieren die Attribute beim Erzeugen eines Objekts.

 Beim Konstruktoraufruf wird das Objekt nach dem Bauplan der Klasse erstellt.

```java
    Beispiel:
    public Auto(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }
```
</details>

### Getter und Setter
<details>
    <summary>Getter und Setter</summary>
    Getter geben den Wert eines Attributs zurück. Setter setzen den Wert und können prüfen, ob der Wert gültig ist dadurch hat man dann eine zentrale Prüfung.

```java
    Beispiel:
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
```

</details>

### toString-Methode
<details>
    <summary>toString-Methode</summary>
    Die `toString`-Methode gibt eine lesbare Beschreibung des Objekts zurück.

```java
    Beispiel:
    @Override
    public String toString() {
        return "Marke: " + marke + ", Baujahr: " + baujahr;
    }
```
</details>

### Eigene Exceptions
<details>
    <summary>Eigene Exceptions</summary>
    Eigene Exceptions werden verwendet, um spezielle Fehlerfälle zu behandeln.
    Wird im folgenden noch weiter vertieft

```java
    Beispiel für eine eigene Exception:
    public class AlterNegativException extends RuntimeException {
        public AlterNegativException(String message) {
            super(message);
        }
    }
```
</details>