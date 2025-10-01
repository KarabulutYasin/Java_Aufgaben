# Skript Eigene Exception

## Inhaltsverzeichnis
- [Was sind Exceptions?](#was-sind-exceptions)
- [Arten von Exception](#arten-von-exceptions)
- [Eigene Exception](#eigene-exception-klassen-erstellen)
- [Exception Werfen und behandeln](#exception-werfen-und-behandeln)

### Was sind Exceptions?
<details>
    <summary>Definition</summary>
    Exceptions sind Fehler, die während der Programmausführung auftreten. Sie helfen, Probleme gezielt zu erkennen und zu behandeln.
</details>

### Arten von Exceptions
<details>
    <summary>Checked vs Unchecked Exceptions</summary>

- **Checked Exceptions**:
  - Sind Exceptions die von "Exception" Erben aber nicht von "RuntimeException"
  - Sie müssen im Code behandelt oder weitergegeben werden
- **Unchecked Exceptions**:
  - Erbt von "RuntimeException" 
  - Müssen nicht explizit behandelt werden.
  - Werden sie geworfen und nicht behandelt, führt dies zum Programmabbruch.
</details>  

### Eigene Exception-Klassen erstellen
<details>
    <summary>Eigene Exception</summary>
    Du kannst eigene Exception-Klassen schreiben, indem du von `Exception` oder `RuntimeException` erbst.

```java
public class OwnException extends Exception {
    public OwnException(String message) {
        super(message);
    }
}
```
</details>

### Exception werfen und behandeln
<details>
    <summary>Exception werfen und behandeln</summary>
    Du kannst eine Exception mit dem `throw`-Schlüsselwort werfen und mit `try-catch`-Blöcken behandeln.

#### Exception werfen
```java
public void meineMethode() throws OwnException {
    if (irgendEinFehler) {
        throw new OwnException("Ein Fehler ist aufgetreten");
    }
}
```
Das bedeutet dass die Methode `meineMethode` eine `OwnException` werfen kann und der Aufrufer der Methode muss diese behandeln. Also eine weitergabe der Exception

#### Exception behandeln(try/catch)
```java
try {
    meineMethode();
} catch (OwnException e) {
    System.out.println(e.getMessage());
}
```
Hier wird die Methode `meineMethode` aufgerufen. Wenn eine `OwnException` geworfen wird, wird sie im `catch`-Block abgefangen und die Fehlermeldung ausgegeben.
</details>
