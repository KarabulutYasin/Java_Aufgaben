package de.month_1.fundamentals.day_13.librarys;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LibraryTasks {

    //TODO
    // Read the JavaDoc of the used libraries
    // https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html

    //TODO
    // Read an integer from a Scanner and return it.
    public int readIntFromScanner(Scanner scanner) {
        return scanner.nextInt();
    }

    //TODO
    // Write strings to a file and read them back.
    public void writeLinesToFile(List<String> lines, Path path) throws IOException {
        Files.write(path, lines);
    }

    public List<String> readLinesFromFile(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    //TODO
    // Count words in a text file.
    // Check regex, and yes, regex is annoying but you should roughly know it
    public int countWordsInFile(Path path) throws IOException {
        int count = 0;
        for (String line : Files.readAllLines(path)) {
            String[] parts = line.trim().split("\\s+");
            if (parts.length == 1 && parts[0].isEmpty()) continue;
            count += parts.length;
        }
        return count;
    }

    //TODO
    // Sum a list of Integers (see autoboxing/unboxing).
    public int sumIntegerList(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) sum += number; // Autounboxing happens here
        return sum;
    }

    //TODO
    // Concatenate the string `times` times in a row
    // Compare how long the test takes when you use StringBuilder
    // and how long when you use Strings with "+"
    public String repeatConcat(String str, int times) {
        /*
        if (times == 0) return "";
        String result = str;
        for (int i = 1; i < times; i++) {
            result += str;
        }
        return result;
        */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) sb.append(str);
        return sb.toString();
    }
    /*
     * There are other libraries instead of java.nio.file.Files
     * if you want to explore them, feel free to do so you can understand legacy code.
     *
     * https://docs.oracle.com/javase/8/docs/api/java/nio/Buffer.html
     * https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
     * https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html
     * */
}
