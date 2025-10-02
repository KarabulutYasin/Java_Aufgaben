# Script Custom Exception

## Table of Contents
- [What are Exceptions?](#what-are-exceptions)
- [Types of Exception](#types-of-exceptions)
- [Custom Exception](#creating-custom-exception-classes)
- [Throwing and Handling Exceptions](#throwing-and-handling-exceptions)

### What are Exceptions?
<details>
    <summary>Definition</summary>
    Exceptions are errors that occur during program execution. They help to specifically detect and handle problems.
</details>

### Types of Exceptions
<details>
    <summary>Checked vs Unchecked Exceptions</summary>

- **Checked Exceptions**:
  - Are exceptions that inherit from "Exception" but not from "RuntimeException"
  - They must be handled or passed on in the code
- **Unchecked Exceptions**:
  - Inherit from "RuntimeException"
  - Do not have to be explicitly handled.
  - If they are thrown and not handled, this leads to program termination.
</details>  

### Creating Custom Exception Classes
<details>
    <summary>Custom Exception</summary>
    You can write your own exception classes by inheriting from `Exception` or `RuntimeException`.

```java
public class OwnException extends Exception {
    public OwnException(String message) {
        super(message);
    }
}
```
</details>

### Throwing and Handling Exceptions
<details>
    <summary>Throwing and Handling Exceptions</summary>
    You can throw an exception using the `throw` keyword and handle it with `try-catch` blocks.

#### Throwing an Exception
```java
public void myMethod() throws OwnException {
    if (someError) {
        throw new OwnException("An error has occurred");
    }
}
```
This means that the method `meineMethode` can throw an `OwnException` and the caller of the method must handle it. So the exception is passed on.

#### Handling exceptions (try/catch)
```java
try {
    myMethod();
} catch (OwnException e) {
    System.out.println(e.getMessage());
}
```
Here, the method `meineMethode` is called. If an `OwnException` is thrown, it is caught in the `catch` block and the error message is output.
</details>
