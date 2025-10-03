package de.month_1.fundamentals.day_13.librarys;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class LibraryTasks {

    //TODO
    // Read the JavaDoc of the used libraries
    // https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html

    //TODO
    // Read an integer from a Scanner and return it.
    public int readIntFromScanner(Scanner scanner) {return -1;}

    //TODO
    // Write strings to a file and read them back.
    public void writeLinesToFile(List<String> lines, Path path) throws IOException {

    }

    public List<String> readLinesFromFile(Path path) throws IOException {
        return null;
    }

    //TODO
    // Count words in a text file.
    // Check regex, and yes, regex is annoying but you should roughly know it
    public int countWordsInFile(Path path) throws IOException {

        return -1;
    }

    //TODO
    // Sum a list of Integers (see autoboxing/unboxing).
    public int sumIntegerList(List<Integer> numbers) {return -1;}

    //TODO
    // Concatenate the string `times` times in a row
    // Compare how long the test takes when you use StringBuilder
    // and how long when you use Strings with "+"
    public String repeatConcat(String str, int times) {

        return null;
    }
    /*
    * There are also other libraries instead of java.nio.file.Files
    * if you want to explore them, feel free to do so you can understand legacy code.
    *
    * https://docs.oracle.com/javase/8/docs/api/java/nio/Buffer.html
    * https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
    * https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html
    * */
}
