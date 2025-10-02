# 🚀 Java Exercises

This repository contains a collection of Java exercises designed to teach and reinforce basic programming skills. Each exercise is crafted to cover specific concepts and techniques in Java.

## Table of Contents

- [Before Start](#Before-Start)
- [Project Structure](#-Project-Structure)
- [Direct Links](#-direct-links)
-
    - [Month 1 Fundamentals](#month-1)

## ⚡Before Start

<details>
  <summary>Before Start</summary>

* Check if Maven is installed on your computer
* If the following command doesn't throw an error, Maven is installed

```shell
mvn -v
```

* If Maven is installed

```shell
mvn clean install -DskipTests
```

### If Maven is not installed, run the following depending on your operating system

* Batch for Windows

```shell
.\mvnw.cmd clean install -DskipTests
```

* Batch for Linux / Mac

```shell
./mvnw clean install -DskipTests
```

</details>

## 📦 Project Structure

<details>
    <summary>Project Structure</summary>

The project is divided into 2 modules

* [Exercises](Aufgaben)
* [Solutions](Loesungen)

The modules "Exercises" and "Solutions" contain the same tasks and tests, but the tasks in the "Exercises" module are unedited.

You work on the exercises and can then check your solution approach with the corresponding tests.

Note that from about day 12 onwards, the tasks become a bit less strict so
that you start thinking for yourself and reading error messages.

(or peek at the solution if you get stuck :D)
</details>

## 📝 Direct Links

- ### Month 1

<details>
  <summary>Fundamentals</summary>

| Script                                                                                                               | Exercise                                                                                                                                                                                            | Test                                                                                                                          | Solution                                                                                                                           |
|----------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| [Linear Programs Script](Exercises/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/Script.Day_1.md)       | [Linear Programs](Exercises/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/LinearPrograms.java)                                                                                         | [Linear Programs Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_1/LinearPrograms/LineareProgrammeTest.java)         | [Linear Programs Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/LineareProgramme.java)             |
| [Own Methods Script](Exercises/src/main/java/de/month_1/fundamentals/day_2/OwnMethods/Script.Day_2.md)               | [Own Methods](Exercises/src/main/java/de/month_1/fundamentals/day_2/OwnMethods/OwnMethods.java)                                                                                                     | [Own Methods Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_2/OwnMethods/EigeneMethodenTest.java)                   | [Own Methods Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_2/OwnMethods/EigeneMethoden.java)                       |
| [See Script 1](Exercises/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/Script.Day_1.md)                 | [Type Conversion](Exercises/src/main/java/de/month_1/fundamentals/day_3/TypeConversion/TypeConversion.javaExercises/src/main/java/de/month_1/fundamentals/day_3/TypeConversion/TypeConversion.java) | [Type Conversion Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_3/TypeConversion/TypkonversionTest.java)            | [Type Conversion Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_3/TypeConversion/Typkonversion.java)                |
| [See Math Library](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html)                 | [Mathlib](Exercises/src/main/java/de/month_1/fundamentals/day_4/mathlib/MathLib.java)                                                                                                               | [Mathlib Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_4/mathlib/MathlibTest.java)                                 | [Mathlib Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_4/mathlib/Mathlib.java)                                     |
| [Control Structures Script](Exercises/src/main/java/de/month_1/fundamentals/day_5/ControlStructures/Script.Day_5.md) | [Control Structures](Exercises/src/main/java/de/month_1/fundamentals/day_5/ControlStructures/ControlStructures.java)                                                                                | [Control Structures Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_5/ControlStructures/KontrollStrukturenTest.java) | [Control Structures Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_5/ControlStructures/KontrollStrukturen.java)     |
| [Classes Script](Exercises/src/main/java/de/month_1/fundamentals/day_6/Classes/Script.Day_6.md)                      | [Classes](Exercises/src/main/java/de/month_1/fundamentals/day_6/Classes/Person.java)                                                                                                                | [Classes Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_6/Classes/PersonTest.java)                                  | [Classes Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_6/Classes/Person.java)                                      |
| [Arrays Script](Exercises/src/main/java/de/month_1/fundamentals/day_7/Arrays/Script.Day_7.md)                        | [Arrays](Exercises/src/main/java/de/month_1/fundamentals/day_7/Arrays/ArrayTasks.java)                                                                                                              | [Arrays Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_7/Arrays/ArrayAufgabenTest.java)                             | [Arrays Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_7/Arrays/ArrayAufgaben.java)                                 |
| [List Script](Exercises/src/main/java/de/month_1/fundamentals/day_8/List/Script.Day_8.md)                            | [List](Exercises/src/main/java/de/month_1/fundamentals/day_8/List/ListTask.java)                                                                                                                    | [List Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_8/List/ListAufgabenTest.java)                                  | [List Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_8/List/ListAufgaben.java)                                      |
|                                                                                                                      | [Calculator](Exercises/src/main/java/de/month_1/fundamentals/day_9/Calculator/Calculator.java)                                                                                                      | [Calculator Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_9/Calculator/TaschenrechnerTest.java)                    | [Calculator Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_9/Calculator/Taschenrechner.java)                        |
|                                                                                                                      | [Modulo](Exercises/src/main/java/de/month_1/fundamentals/day_10/modulo/ModMath.java)                                                                                                                | [Modulo Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_10/modulo/ModMathTest.java)                                  | [Modulo Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_10/modulo/ModMath.java)                                      |
|                                                                                                                      | [Point](Exercises/src/main/java/de/month_1/fundamentals/day_11/point/Point.java)                                                                                                                    | [Point Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_11/point/PointTest.java)                                      | [Point Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_11/point/Point.java)                                          |
| [Custom Exception Script](Exercises/src/main/java/de/month_1/fundamentals/day_12/CustomException/Script.Day_12.md)   | [Custom Exception](Exercises/src/main/java/de/month_1/fundamentals/day_12/CustomException/CustomException.java)                                                                                      | [Custom Exception Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_12/CustomException/EigeneExceptionTest.java)       | [Custom Exception Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_12/CustomException/EigeneException.java)           |
|                                                                                                                      | [Library](Exercises/src/main/java/de/month_1/fundamentals/day_13/librarys/LibraryTasks.java)                                                                                                         | [Library Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_13/librarys/LibraryTasksTest.java)                          | [Library Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_13/librarys/LibraryTasks.java)                              |
|                                                                                                                      | [Interface Task](Exercises/src/main/java/de/month_1/fundamentals/day_14/interfaces/Task.md)                                                                                                        | [Interface Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_14/interfaces/AllTestsOfDay_14.java)                      | [Interface Solution Sheet](Loesungen/src/main/java/de/month_1/fundamentals/day_14/interfaces/LösungsBlattDay_14.md)                |
|                                                                                                                      | [Inheritance (Vererbung) Task](Exercises/src/main/java/de/month_1/fundamentals/day_15/Inheritance/Task.md)                                                                               | [Inheritance (Vererbung) Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_15/Inheritance/AllTestsOfDay_15.java)       | [Inheritance (Vererbung) Solution Sheet](Loesungen/src/main/java/de/month_1/fundamentals/day_15/Inheritance/LösungsBlattDay_15.md) |
|                                                                                                                      | [Static](Exercises/src/main/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemo.java)                                                                                                          | [Static Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemoTest.java)                           | [Static Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemo.java)                               |
|                                                                                                                      | [This Super Task](Exercises/src/main/java/de/month_1/fundamentals/day_17/thissuper/Task.md)                                                                                              | [This Super Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_17/thissuper/AllTestsOfDay_17.java)                      | [This Super Solution Sheet](Loesungen/src/main/java/de/month_1/fundamentals/day_17/thissuper/LösungsBlattDay_17.md)                |
|                                                                                                                      | [Abstract Classes Task](Exercises/src/main/java/de/month_1/fundamentals/day_18/AbstractClasses/Task.md)                                                                                  | [Abstract Classes Test](Aufgaben/src/test/java/de/month_1/fundamentals/day_18/AbstractClasses/LebewesenTest.java)             | [Abstract Classes Solution](Loesungen/src/main/java/de/month_1/fundamentals/day_18/AbstractClasses/Lebewesen.java)                 |

</details>


