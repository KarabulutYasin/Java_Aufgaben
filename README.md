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

| Script                                                                                                               | Exercise                                                                                                             | Test                                                                                                                          | Solution                                                                                                                      |
|----------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| [Linear Programs Script](Exercises/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/Script.Day_1.md)       | [Linear Programs](Exercises/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/LinearPrograms.java)          | [Linear Programs Test](Exercises/src/test/java/de/month_1/fundamentals/day_1/LinearPrograms/LinearProgramsTest.java)          | [Linear Programs Solution](Solutions/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/LinearPrograms.java)          |
| [Own Methods Script](Exercises/src/main/java/de/month_1/fundamentals/day_2/OwnMethods/Script.Day_2.md)               | [Own Methods](Exercises/src/main/java/de/month_1/fundamentals/day_2/OwnMethods/OwnMethods.java)                      | [Own Methods Test](Exercises/src/test/java/de/month_1/fundamentals/day_2/OwnMethods/OwnMethodsTest.java)                      | [Own Methods Solution](Solutions/src/main/java/de/month_1/fundamentals/day_2/OwnMethods/OwnMethods.java)                      |
| [See Script 1](Exercises/src/main/java/de/month_1/fundamentals/day_1/LinearPrograms/Script.Day_1.md)                 | [Type Conversion](Exercises/src/main/java/de/month_1/fundamentals/day_3/TypeConversion/TypeConversion.java)          | [Type Conversion Test](Exercises/src/test/java/de/month_1/fundamentals/day_3/TypeConversion/TypeConversionTest.java)          | [Type Conversion Solution](Solutions/src/main/java/de/month_1/fundamentals/day_3/TypeConversion/TypeConversion.java)          |
| [See Math Library](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html)                 | [Mathlib](Exercises/src/main/java/de/month_1/fundamentals/day_4/mathlib/MathLib.java)                                | [Mathlib Test](Exercises/src/test/java/de/month_1/fundamentals/day_4/mathlib/MathLibTest.java)                                | [Mathlib Solution](Solutions/src/main/java/de/month_1/fundamentals/day_4/mathlib/MathLib.java)                                |
| [Control Structures Script](Exercises/src/main/java/de/month_1/fundamentals/day_5/ControlStructures/Script.Day_5.md) | [Control Structures](Exercises/src/main/java/de/month_1/fundamentals/day_5/ControlStructures/ControlStructures.java) | [Control Structures Test](Exercises/src/test/java/de/month_1/fundamentals/day_5/ControlStructures/ControlStructuresTest.java) | [Control Structures Solution](Solutions/src/main/java/de/month_1/fundamentals/day_5/ControlStructures/ControlStructures.java) |
| [Classes Script](Exercises/src/main/java/de/month_1/fundamentals/day_6/Classes/Script.Day_6.md)                      | [Classes](Exercises/src/main/java/de/month_1/fundamentals/day_6/Classes/Person.java)                                 | [Classes Test](Exercises/src/test/java/de/month_1/fundamentals/day_6/Classes/PersonTest.java)                                 | [Classes Solution](Solutions/src/main/java/de/month_1/fundamentals/day_6/Classes/Person.java)                                 |
| [Arrays Script](Exercises/src/main/java/de/month_1/fundamentals/day_7/Arrays/Script.Day_7.md)                        | [Arrays](Exercises/src/main/java/de/month_1/fundamentals/day_7/Arrays/ArrayTasks.java)                               | [Arrays Test](Exercises/src/test/java/de/month_1/fundamentals/day_7/Arrays/ArrayTasksTest.java)                               | [Arrays Solution](Solutions/src/main/java/de/month_1/fundamentals/day_7/Arrays/ArrayTasks.java)                               |
| [List Script](Exercises/src/main/java/de/month_1/fundamentals/day_8/List/Script.Day_8.md)                            | [List](Exercises/src/main/java/de/month_1/fundamentals/day_8/List/ListTask.java)                                     | [List Test](Exercises/src/test/java/de/month_1/fundamentals/day_8/List/ListTaskTest.java)                                     | [List Solution](Solutions/src/main/java/de/month_1/fundamentals/day_8/List/ListTask.java)                                     |
|                                                                                                                      | [Calculator](Exercises/src/main/java/de/month_1/fundamentals/day_9/Calculator/Calculator.java)                       | [Calculator Test](Exercises/src/test/java/de/month_1/fundamentals/day_9/Calculator/CalculatorTest.java)                       | [Calculator Solution](Solutions/src/main/java/de/month_1/fundamentals/day_9/Calculator/Calculator.java)                       |
|                                                                                                                      | [Modulo](Exercises/src/main/java/de/month_1/fundamentals/day_10/modulo/ModMath.java)                                 | [Modulo Test](Exercises/src/test/java/de/month_1/fundamentals/day_10/modulo/ModMathTest.java)                                 | [Modulo Solution](Solutions/src/main/java/de/month_1/fundamentals/day_10/modulo/ModMath.java)                                 |
|                                                                                                                      | [Point](Exercises/src/main/java/de/month_1/fundamentals/day_11/point/Point.java)                                     | [Point Test](Exercises/src/test/java/de/month_1/fundamentals/day_11/point/PointTest.java)                                     | [Point Solution](Solutions/src/main/java/de/month_1/fundamentals/day_11/point/Point.java)                                     |
| [Custom Exception Script](Exercises/src/main/java/de/month_1/fundamentals/day_12/CustomException/Script.Day_12.md)   | [Custom Exception](Exercises/src/main/java/de/month_1/fundamentals/day_12/CustomException/CustomException.java)      | [Custom Exception Test](Exercises/src/test/java/de/month_1/fundamentals/day_12/CustomException/CustomExceptionTest.java)      | [Custom Exception Solution](Solutions/src/main/java/de/month_1/fundamentals/day_12/CustomException/CustomException.java)      |
|                                                                                                                      | [Library](Exercises/src/main/java/de/month_1/fundamentals/day_13/librarys/LibraryTasks.java)                         | [Library Test](Exercises/src/test/java/de/month_1/fundamentals/day_13/librarys/LibraryTasksTest.java)                         | [Library Solution](Solutions/src/main/java/de/month_1/fundamentals/day_13/librarys/LibraryTasks.java)                         |
|                                                                                                                      | [Interface Task](Exercises/src/main/java/de/month_1/fundamentals/day_14/interfaces/Task.md)                          | [Interface Test](Exercises/src/test/java/de/month_1/fundamentals/day_14/interfaces/AllTestsOfDay_14.java)                     | [Interface Solution Sheet](Solutions/src/main/java/de/month_1/fundamentals/day_14/interfaces/SolutionSheet.md)                |
|                                                                                                                      | [Inheritance (Vererbung) Task](Exercises/src/main/java/de/month_1/fundamentals/day_15/Inheritance/Task.md)           | [Inheritance (Vererbung) Test](Exercises/src/test/java/de/month_1/fundamentals/day_15/Inheritance/AllTestsOfDay_15.java)      | [Inheritance (Vererbung) Solution Sheet](Solutions/src/main/java/de/month_1/fundamentals/day_15/Inheritance/SolutionSheet.md) |
|                                                                                                                      | [Static](Exercises/src/main/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemo.java)                          | [Static Test](Exercises/src/test/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemoTest.java)                          | [Static Solution](Solutions/src/main/java/de/month_1/fundamentals/day_16/staticDemo/StaticDemo.java)                          |
|                                                                                                                      | [This Super Task](Exercises/src/main/java/de/month_1/fundamentals/day_17/thissuper/Task.md)                          | [This Super Test](Exercises/src/test/java/de/month_1/fundamentals/day_17/thissuper/AllTestsOfDay_17.java)                     | [This Super Solution Sheet](Solutions/src/main/java/de/month_1/fundamentals/day_17/thissuper/SolutionSheet.md)                |
|                                                                                                                      | [Abstract Classes Task](Exercises/src/main/java/de/month_1/fundamentals/day_18/AbstractClasses/Task.md)              | [Abstract Classes Test](Exercises/src/test/java/de/month_1/fundamentals/day_18/AbstractClasses/CreaturesTest.java)            | [Abstract Classes Solution](Solutions/src/main/java/de/month_1/fundamentals/day_18/AbstractClasses/Creatures.java)            |

</details>


