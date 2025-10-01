# Script Classes and the Person Class

## Table of Contents
- [What are Classes?](#what-are-classes)
- [Attributes and Methods](#attributes-and-methods)
- [Constructors](#constructors)
- [Getters and Setters](#getters-and-setters)
- [toString Method](#tostring-method)
- [Custom Exceptions](#custom-exceptions)

### What are Classes?
<details>
    <summary>Definition</summary>
    
Classes are blueprints for objects. They bundle attributes (properties) and methods (functions).

You can imagine a class as a blueprint for a car, and the instance of the class, i.e. the object, is the car in reality, which was built according to the blueprint.
</details>

### Attributes and Methods
<details>
    <summary>Attributes and Methods</summary>
    Attributes store the state of an object. Methods determine the behavior.

```java
    Example:
    public class Car {
        // brand and yearOfManufacture are attributes
        private String brand;
        private int yearOfManufacture;

        // drive is a method
        public void drive() {
            System.out.println("The car is driving.");
        }
    }
```

</details>

### Constructors
<details>
    <summary>Constructors</summary>
 
Constructors initialize the attributes when creating an object.

When the constructor is called, the object is created according to the blueprint of the class.

```java
    Example:
    public Car(String brand, int yearOfManufacture) {
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
    }
```
</details>

### Getters and Setters
<details>
    <summary>Getters and Setters</summary>
    Getters return the value of an attribute. Setters set the value and can check if the value is valid, providing a central validation point.

```java
    Example:
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
```

</details>

### toString Method
<details>
    <summary>toString Method</summary>
    The `toString` method returns a readable description of the object.

```java
    Example:
    @Override
    public String toString() {
        return "Brand: " + brand + ", Year of Manufacture: " + yearOfManufacture;
    }
```
</details>

### Custom Exceptions
<details>
    <summary>Custom Exceptions</summary>
    Custom exceptions are used to handle special error cases.
    This will be explained in more detail below.

```java
    Example of a custom exception:
    public class AgeNegativeException extends RuntimeException {
        public AgeNegativeException(String message) {
            super(message);
        }
    }
```
</details>