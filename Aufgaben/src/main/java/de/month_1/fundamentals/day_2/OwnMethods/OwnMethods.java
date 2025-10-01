package de.month_1.fundamentals.day_2.OwnMethods;

import de.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class OwnMethods {
    //TODO
    // Write the following methods
    // (pay attention to the names, otherwise errors will occur in the tests)
    // 1. "nope" this method should do nothing, so no parameters and no return value
    // 2. "mult" which multiplies two ints and returns the result (int)
    // 3. "multByTwo" should call "mult" with a fixed parameter 2 and return the result (int)

    public static void main(String[] args){
        //Does not need to be edited
        Method[] methods = OwnMethods.class.getDeclaredMethods();
        Class<?> cls = OwnMethods.class;

        MainProvider.printAscii();
        // If you want to play with the parameters, after "lp" are the respective parameters
        for (Method method: methods){
            if (method.getName().equals("main")) continue;
            if (method.getName().equals("nope")) MainProvider.exec(method,cls);
            if (method.getName().equals("mult")) MainProvider.exec(method,cls,5,4);
            if (method.getName().equals("multByTwo")) MainProvider.exec(method,cls,7);
        }
    }
}
