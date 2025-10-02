# Script Own Methods

## Table of Contents
- [The syntax (spelling) of a method](#the-syntax-spelling-of-a-method-is-divided-into-several-aspects-each-fulfilling-specific-tasks)
- [The visibility of a method](#the-visibility-of-a-method-determines-from-where-the-method-can-be-called)
- [The return type of a method](#the-return-type-of-the-method-determines-which-data-type-the-method-returns-when-it-is-called)
- [The parameters of a method](#the-parameters-of-a-method-are-variables-that-are-passed-to-the-method-when-it-is-called)

### The syntax (spelling) of a method is divided into several aspects, each fulfilling specific tasks.

<details>
    <summary>Syntax</summary>

\<Visibility> \<ReturnType> \<MethodName>(\<Parameter>) {

     Code that the method executes

}

Examples:

```java
public void myMethod() {
    System.out.println("Hello World");
}
```
This method has the visibility "public", returns no value (void), and has no parameters.
```java
private int add(int a, int b) {
    return a + b;
}
```
This method has the visibility "private", returns an int value, and has two parameters (int a, int b).
```java
String greet(String name) {
    return "Hello " + name;
}
```
This method has the visibility "package protected" (default), returns a String, and has one parameter (String name).
</details>

### The visibility of a method determines from where the method can be called.

<details>
    <summary>Visibilities</summary>

- ### public
    - The method can be called from anywhere.
- ### private
    - The method can only be called within the class in which it is defined.
- ### protected
    - The method can be called within the class and in all subclasses.
- ### package protected (by default, i.e., if nothing is specified)
    - The method can be called within the package. 
    - and at the same time Protected
  
</details>

### The return type of the method determines which data type the method returns when it is called.

<details>
    <summary>Return Types</summary>

- ### void
    - The method does not return a value.
- ### Primitive data types
    - int, double, boolean, char, byte, short, long, float
    - The method returns a value of the respective primitive data type.
- ### Reference data types
    - String, arrays, objects (e.g., own classes)
    - The method returns a value of the respective reference data type.
</details>  

### The parameters of a method are variables that are passed to the method when it is called.
<details>
    <summary>Parameters</summary>

- ### A method can have none, one, or several parameters.
- ### Each parameter has a data type and a name.
- ### Parameters are separated by commas.
- ### IMPORTANT!!! Parameters and variables which was declared in the method are only visible within the method.
</details>  