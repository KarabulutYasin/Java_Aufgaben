package de.month_1.fundamentals.day_1.LinearPrograms;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class LinearPrograms {

    public void greeting() {
        //TODO
        // Write a function that prints Hello World to the console

    }

    public int add(int a, int b){
        //TODO
        // Return the result of adding the parameters a and b

        return 0;
    }

    public String commaBetween(String word1, String word2){
        //TODO
        // Return a string that concatenates the words word1 and word2
        // with a comma in between
        // You can assume that neither string is null

        // Example HI and Moin => HI,Moin

        return null;
    }

    public void callAdd(){
        //TODO
        // Call add with the values 3 and 5
    }

    public int convertToInt(String s){
        //TODO
        // Convert the string to int
        // If it cannot be converted, throw a MyException
        // Create a class for this exception

        return 0;
    }

    public String convertToString(int i){
        //TODO
        // Return i as a string

        return null;
    }

    public boolean connectBoolean(boolean a, boolean b) {
        //TODO
        // Return true if a or b is true (also if both are true)

        return false;
    }

    public static void main(String[] args) {
        //No need to edit
        Method [] methods = LinearPrograms.class.getDeclaredMethods();
        Class<?> lp = LinearPrograms.class;

        MainProvider.printAscii();
        // If you want to play with the parameters, after "lp" are the respective parameters
        for (Method method: methods){
            if (method.getName().equals("main")) continue;
            if (method.getName().equals("greeting")) MainProvider.exec(method,lp);
            if (method.getName().equals("add")) MainProvider.exec(method,lp,10,20);
            if (method.getName().equals("commaBetween")) MainProvider.exec(method,lp,"Hi","Moin");
            if (method.getName().equals("callAdd")) MainProvider.exec(method,lp);
            if (method.getName().equals("convertToInt")) MainProvider.exec(method,lp,"123");
            if (method.getName().equals("convertToString")) MainProvider.exec(method,lp,123);
            if (method.getName().equals("connectBoolean")) MainProvider.exec(method,lp,true,false);
        }
    }
}