# Script Control Structures

## Table of Contents
- [What are control structures?](#what-are-control-structures)
- [Conditions: if, else, switch](#conditions-if-else-switch)
- [Loops: for, while, do-while, for-each](#loops-for-while-do-while-for-each)

### What are control structures?
<details>
    <summary>Definition</summary>
    Control structures determine the flow of a program. They specify which instructions are executed and how often.
</details>

### Conditions: if, else, switch
<details>
    <summary>Conditions</summary>
    With conditions, you can make decisions in code.

```java
    **if / else example:**
        int grade = 1;
        if (grade == 1) {
            System.out.println("Very good");
        } else if (grade == 2) {
            System.out.println("Good");
    } else {
            System.out.println("Invalid");
    }
        // You can chain else if as many times as you want

        **switch example:**
        int day = 6;
        switch (day) {
        case 6:
        case 7:
                System.out.println("Weekend");
            break;
        default:
                System.out.println("Weekday");
    }
        // Important: if you do not insert a break, the code below will also be executed
```
</details>

### Loops: for, while, do-while, for-each
<details>
    <summary>Loops</summary>
    Loops repeat instructions as long as a condition is met.

```java
    **for-loop:**
    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }
    // repeats the loop until i<=5 becomes false, then the loop ends

    **while-loop:**
    int i = 1;
    while (i <= 5) {
        System.out.println(i);
        i++;
    }
    // repeats the loop until i<=5 becomes false, then the loop ends

    **do-while-loop:**
    int i = 1;
    do {
        System.out.println(i);
        i++;
    } while (i <= 5);
    // Like a while loop, the difference is 
    // that the code is executed at least once
    // no matter if the condition is met or not

    **for-each-loop:**
    List<String> names = List.of("Max", "Anna");
    for (String name : names) {
        System.out.println(name);
    }
    // Iterates over each element in the list
```
</details>