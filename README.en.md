# 🚀 Java Exercises
This repository contains a collection of Java exercises designed to teach and reinforce basic programming skills. Each exercise is crafted to cover specific concepts and techniques in Java.

## ⚡Before Start
* Check if Maven is installed on your computer
* If the following command runs without error, Maven is available
```shell
mvn -v
```
* If Maven is available, run:
```shell
mvn clean install -DskipTests
```
### If Maven is not installed, run the following depending on your operating system:
* Batch for Windows
```shell
.\mvnw.cmd clean install -DskipTests
```
* Batch for Linux / Mac
```shell
./mvnw clean install -DskipTests
```

# 📦 Project Structure

The project is divided into two modules:

* [Exercises](Aufgaben)
* [Solutions](Loesungen)

Both modules contain the same tasks and tests, with the difference that in the Exercises module, the tasks inside the "Aufgaben" package are left unfinished.

You are supposed to solve the exercises and then verify your solutions with the corresponding tests.

(Or take a quick peek at the Solutions if you get stuck 😄)

# 📝 Direkte Links
| Exercises                                                                                             | Test                                                                                                            | Solutions                                                                                                     |
|-------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| [Lineare Progamme](Aufgaben/src/main/java/de/a/fundamentals/a/lineareProgramme/LineareProgramme.java) | [Lineare Programme Test](Aufgaben/src/test/java/de/a/fundamentals/a/lineareProgramme/LineareProgrammeTest.java) | [Lineare Aufgaben Lösung](Loesungen/src/main/java/de/a/fundamentals/a/lineareProgramme/LineareProgramme.java) |
| [Eigene Methoden](Aufgaben/src/main/java/de/a/fundamentals/b/eigeneMethoden/EigeneMethoden.java)      | [Eigene Methoden Test](Aufgaben/src/test/java/de/a/fundamentals/b/eigeneMethoden/EigeneMethodenTest.java)       | [Eigene Methoden Lösung](Loesungen/src/main/java/de/a/fundamentals/b/eigeneMethoden/EigeneMethoden.java)      |
| [Typkonversion](Aufgaben/src/main/java/de/a/fundamentals/c/typkonversionen/Typkonversion.java)        | [Typkonversion Test](Aufgaben/src/test/java/de/a/fundamentals/c/typkonversionen/TypkonversionTest.java)         | [Typkonversion Lösung](Loesungen/src/main/java/de/a/fundamentals/c/typkonversionen/Typkonversion.java)        |
| [Mathlib](Aufgaben/src/main/java/de/a/fundamentals/d/mathlib/Mathlib.java)                            | [Mathlib Test](Aufgaben/src/test/java/de/a/fundamentals/d/mathlib/MathlibTest.java)                             | [Mathlib Lösung](Loesungen/src/main/java/de/a/fundamentals/d/mathlib/Mathlib.java)                            |
