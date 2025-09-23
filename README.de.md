
# 🚀 Java Aufgaben
Dieses Repository enthält eine Sammlung von Java-Aufgaben, die darauf abzielen, grundlegende Programmierkenntnisse zu vermitteln und zu festigen. Jede Aufgabe ist so konzipiert, dass sie spezifische Konzepte und Techniken in Java abdeckt.

## ⚡Before Start
* Prüfe ob Maven auf deinem Rechner installiert ist
* Wenn folgender Command kein Fehler wirft ist Maven vorhanden
```shell
mvn -v
```
* Wenn Maven vorhanden ist
```shell
mvn clean install -DskipTests
```
### Wenn Maven nicht vorhanden ist folgendes laufen lassen je nach Betriebssystem
* Batch for Windows
```shell
.\mvnw.cmd clean install -DskipTests
```
* Batch for Linux / Mac
```shell
./mvnw clean install -DskipTests
```

# 📦 Aufbau des Projekts

Das Projekt ist in 2 Glieder unterteilt

* [Aufgaben](Aufgaben)
* [Lösungen](Loesungen)

In den Modulen "Aufgaben" und "Lösungen" sind dieselben Aufgaben und Tests nur das die Aufgaben im Package "Aufgaben" unbearbeitet sind

Man bearbeite die Aufgaben und kann dann seinen Lösungsansatz mit den zugehörigen Tests Überprüfen

(oder in der Lösung spicken, falls man nicht weiter kommt :D)

# 📝 Direkte Links
| Aufgaben                                                                                                    | Test                                                                                                                 | Lösungen                                                                                                              |
|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| [Lineare Progamme](Aufgaben/src/main/java/de/a/fundamentals/a/lineareProgramme/LineareProgramme.java)       | [Lineare Programme Test](Aufgaben/src/test/java/de/a/fundamentals/a/lineareProgramme/LineareProgrammeTest.java)      | [Lineare Aufgaben Solution](Loesungen/src/main/java/de/a/fundamentals/a/lineareProgramme/LineareProgramme.java)       |```markdown
| [Eigene Methoden](Aufgaben/src/main/java/de/a/fundamentals/b/eigeneMethoden/EigeneMethoden.java)            | [Eigene Methoden Test](Aufgaben/src/test/java/de/a/fundamentals/b/eigeneMethoden/EigeneMethodenTest.java)            | [Eigene Methoden Solution](Loesungen/src/main/java/de/a/fundamentals/b/eigeneMethoden/EigeneMethoden.java)            |
| [Typkonversion](Aufgaben/src/main/java/de/a/fundamentals/c/typkonversionen/Typkonversion.java)              | [Typkonversion Test](Aufgaben/src/test/java/de/a/fundamentals/c/typkonversionen/TypkonversionTest.java)              | [Typkonversion Solution](Loesungen/src/main/java/de/a/fundamentals/c/typkonversionen/Typkonversion.java)              |
| [Mathlib](Aufgaben/src/main/java/de/a/fundamentals/d/mathlib/Mathlib.java)                                  | [Mathlib Test](Aufgaben/src/test/java/de/a/fundamentals/d/mathlib/MathlibTest.java)                                  | [Mathlib Solution](Loesungen/src/main/java/de/a/fundamentals/d/mathlib/Mathlib.java)                                  |
| [Kontrollstrukturen](Aufgaben/src/main/java/de/a/fundamentals/e/kontrollstrukturen/KontrollStrukturen.java) | [Kontrollstrukturen Test](Aufgaben/src/test/java/de/a/fundamentals/e/kontrollstrukturen/KontrollStrukturenTest.java) | [Kontrollstrukturen Solution](Loesungen/src/main/java/de/a/fundamentals/e/kontrollstrukturen/KontrollStrukturen.java) |
| [Person](Aufgaben/src/main/java/de/a/fundamentals/f/klassen/Person.java)                                    | [Person Test](Aufgaben/src/test/java/de/a/fundamentals/f/klassen/PersonTest.java)                                    | [Person Solution](Loesungen/src/main/java/de/a/fundamentals/f/klassen/Person.java)                                    |


