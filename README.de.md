
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
| Exercises                                                                                                             | Test                                                                                                                           | Solutions                                                                                                                     |
|-----------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| [Lineare Progamme](Aufgaben/src/main/java/de/month_1/fundamentals/day_1/lineareProgramme/LineareProgramme.java)       | [Lineare Programme Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_1/lineareProgramme/LineareProgrammeTest.java)      | [Lineare Aufgaben Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_1/lineareProgramme/LineareProgramme.java)       |
| [Eigene Methoden](Aufgaben/src/main/java/de/month_1/fundamentals/day_2/eigeneMethoden/EigeneMethoden.java)            | [Eigene Methoden Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_2/eigeneMethoden/EigeneMethodenTest.java)            | [Eigene Methoden Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_2/eigeneMethoden/EigeneMethoden.java)            |
| [Typkonversion](Aufgaben/src/main/java/de/month_1/fundamentals/day_3/typkonversionen/Typkonversion.java)              | [Typkonversion Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_3/typkonversionen/TypkonversionTest.java)              | [Typkonversion Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_3/typkonversionen/Typkonversion.java)              |
| [Mathlib](Aufgaben/src/main/java/de/month_1/fundamentals/day_4/mathlib/Mathlib.java)                                  | [Mathlib Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_4/mathlib/MathlibTest.java)                                  | [Mathlib Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_4/mathlib/Mathlib.java)                                  |
| [Kontrollstrukturen](Aufgaben/src/main/java/de/month_1/fundamentals/day_5/kontrollstrukturen/KontrollStrukturen.java) | [Kontrollstrukturen Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_5/kontrollstrukturen/KontrollStrukturenTest.java) | [Kontrollstrukturen Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_5/kontrollstrukturen/KontrollStrukturen.java) |
| [Person](Aufgaben/src/main/java/de/month_1/fundamentals/day_6/klassen/Person.java)                                    | [Person Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_6/klassen/PersonTest.java)                                    | [Person Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_6/klassen/Person.java)                                    |
| [EigeneException](Aufgaben/src/main/java/de/month_1/fundamentals/day_7/fehlerbehandlung/EigeneException.java)         | [EigeneException Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_7/fehlerbehandlung/EigeneExceptionTest.java)         | [EigeneException Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_7/fehlerbehandlung/EigeneException.java)         |
