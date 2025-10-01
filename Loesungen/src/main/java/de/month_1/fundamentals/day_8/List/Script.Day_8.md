# Script Lists and Custom Exception

## Table of Contents
- [What are Lists?](#what-are-lists)
- [Creating and Using Lists](#creating-and-using-lists)
- [Adding and Removing Elements](#adding-and-removing-elements)
- [Sorting Lists](#sorting-lists)
- [Converting Lists to Strings](#converting-lists-to-strings)

### What are Lists?
<details>
    <summary>Definition</summary>
    Lists are dynamic data structures that can store multiple values. They are more flexible than arrays and can grow as needed.
</details>

### Creating and Using Lists
<details>
    <summary>Create List</summary>
    In Java, there are different list types, e.g. `ArrayList`.

Example of how to create a list that can only store strings:
```java
List<String> names = new ArrayList<>();
```
</details>

### Adding and Removing Elements
<details>
    <summary>Adding/Removing Elements</summary>

With `add()` you add elements, with `remove()` you remove them.
```java
names.add("Max");
names.remove("Max");
```
</details>

### Sorting Lists
<details>
    <summary>Sorting Lists</summary>

You can sort lists using `Collections.sort()`.

```java
Collections.sort(names);
```

</details>

### Converting Lists to Strings
<details>
    <summary>Converting Lists to Strings</summary>

You can convert a list to a string by joining the elements with a delimiter.
```java
//We have a list "namen" in which the names "Max", "Anna" and "Tom" are stored
//The following commands have different outputs 

System.out.println(namen.toString()); // [Max, Anna, Tom]

String alleNamen = String.join(", ", namen);
System.out.println(alleNamen); // Max, Anna, Tom
```
</details>