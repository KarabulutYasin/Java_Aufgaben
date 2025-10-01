# Interfaces

### In this exercise, you are to create an interface.

## Task

## Create an interface named `Vehicle` with the following methods:

| ReturnType | Method Name | Parameter |
|------------|-------------|-----------|
| void       | start       |           |
| void       | stop        |           |
| int        | getSpeed    |           |
| void       | setSpeed    | int       |

## Then, create a class named `Car` that implements the interface.

## The class should implement the methods of the interface and have a private attribute named `speed`. In `Car`, the following should happen:

| Method   | What should happen                                                                                            |
|----------|---------------------------------------------------------------------------------------------------------------|
| start    | Print "Car is starting vroom vroom" to the console                                                            |
| stop     | Print "Car has stopped" to the console                                                                        |
| getSpeed | Return the integer value of the attribute                                                                     |
| setSpeed | Set the integer value of the attribute (keep in mind that nonsensical values should throw a RuntimeException) |


