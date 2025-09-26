
# 🚀 Java Aufgaben
Dieses Repository enthält eine Sammlung von Java-Aufgaben, die darauf abzielen, grundlegende Programmierkenntnisse zu vermitteln und zu festigen. Jede Aufgabe ist so konzipiert, dass sie spezifische Konzepte und Techniken in Java abdeckt.

## Inhaltsverzeichnis
- [Before Start](#Before-Start)
- [Aufbau des Projekts](#-Aufbau-des-Projekts)
- [Direkte Links](#-direkte-links)
- - [Month 1 Fundamentels](#month-1---fundamentals)

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

# Month 1 - Fundamentals
| Aufgaben                                                                                                              | Test                                                                                                                           | Lösung                                                                                                                        |
|-----------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| [Lineare Progamme](Aufgaben/src/main/java/de/month_1/fundamentals/day_1/lineareProgramme/LineareProgramme.java)       | [Lineare Programme Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_1/lineareProgramme/LineareProgrammeTest.java)      | [Lineare Aufgaben Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_1/lineareProgramme/LineareProgramme.java)       |
| [Eigene Methoden](Aufgaben/src/main/java/de/month_1/fundamentals/day_2/eigeneMethoden/EigeneMethoden.java)            | [Eigene Methoden Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_2/eigeneMethoden/EigeneMethodenTest.java)            | [Eigene Methoden Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_2/eigeneMethoden/EigeneMethoden.java)            |
| [Typkonversion](Aufgaben/src/main/java/de/month_1/fundamentals/day_3/typkonversionen/Typkonversion.java)              | [Typkonversion Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_3/typkonversionen/TypkonversionTest.java)              | [Typkonversion Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_3/typkonversionen/Typkonversion.java)              |
| [Mathlib](Aufgaben/src/main/java/de/month_1/fundamentals/day_4/mathlib/Mathlib.java)                                  | [Mathlib Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_4/mathlib/MathlibTest.java)                                  | [Mathlib Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_4/mathlib/Mathlib.java)                                  |
| [Kontrollstrukturen](Aufgaben/src/main/java/de/month_1/fundamentals/day_5/kontrollstrukturen/KontrollStrukturen.java) | [Kontrollstrukturen Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_5/kontrollstrukturen/KontrollStrukturenTest.java) | [Kontrollstrukturen Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_5/kontrollstrukturen/KontrollStrukturen.java) |
| [Person](Aufgaben/src/main/java/de/month_1/fundamentals/day_6/klassen/Person.java)                                    | [Person Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_6/klassen/PersonTest.java)                                    | [Person Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_6/klassen/Person.java)                                    |
| [EigeneException](Aufgaben/src/main/java/de/month_1/fundamentals/day_7/fehlerbehandlung/EigeneException.java)         | [EigeneException Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_7/fehlerbehandlung/EigeneExceptionTest.java)         | [EigeneException Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_7/fehlerbehandlung/EigeneException.java)         |
| [List](Aufgaben/src/main/java/de/month_1/fundamentals/day_8/listaufgaben/ListAufgaben.java)                           | [List Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_8/listaufgaben/ListAufgabenTest.java)                           | [List Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_8/listaufgaben/ListAufgaben.java)                           |
| [Taschenrechner](Aufgaben/src/main/java/de/month_1/fundamentals/day_9/EinfacherTaschenrechner/Taschenrechner.java)    | [Taschenrechner Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_9/EinfacherTaschenrechner/TaschenrechnerTest.java)    | [Taschenrechner Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_9/EinfacherTaschenrechner/Taschenrechner.java)    |
| [Modulo](Aufgaben/src/main/java/de/month_1/fundamentals/day_10/modulo/ModMath.java)                                   | [Modulo Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_10/modulo/ModMathTest.java)                                   | [Modulo Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_10/modulo/ModMath.java)                                   |
| [Point](Aufgaben/src/main/java/de/month_1/fundamentals/day_11/point/Point.java)                                       | [Point Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_11/point/PointTest.java)                                       | [Point Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_11/point/Point.java)                                       |
| [Arrays](Aufgaben/src/main/java/de/month_1/fundamentals/day_12/arrays/ArrayTasks.java)                                | [Arrays Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_12/arrays/ArrayTasksTest.java)                                | [Arrays Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_12/arrays/ArrayTasks.java)                                |
| [Library](Aufgaben/src/main/java/de/month_1/fundamentals/day_13/librarys/LibraryTasks.java)                           | [Library Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_13/librarys/LibraryTasksTest.java)                           | [Library Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_13/librarys/LibraryTasks.java)                           |
| [Interface Aufgabestellung](Aufgaben/src/main/java/de/month_1/fundamentals/day_14/interfaces/ReadMe.md)               | [Interface Test Package](Aufgaben/src/test/java/de/month_1/fundamentals/day_14/interfaces)                                     | [Interface Lösung Package](Loesungen/src/main/java/de/month_1/fundamentals/day_14/interfaces)                                 |
| [Vererbung Aufgabestellung](Aufgaben/src/main/java/de/month_1/fundamentals/day_15/vererbung/Aufgabenstellung.md)      | [Vererbung Test Package](Aufgaben/src/test/java/de/month_1/fundamentals/day_15/vererbung)                                      | [Vererbung Lösung Package](Loesungen/src/main/java/de/month_1/fundamentals/day_15/vererbung)                                  |
| [Static](Aufgaben/src/main/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemo.java)                            | [Static Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemoTest.java)                            | [Static Lösung](Loesungen/src/main/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemo.java)                            |

