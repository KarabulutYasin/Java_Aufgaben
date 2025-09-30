package de.month_1.fundamentals.day_2.eigeneMethoden;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;

public class EigeneMethoden {
    //TODO
    // Schreibe Folgende Methoden
    // (auf die Namen Achten sonst entstehen Fehler bei denn Tests)
    // 1. "nope" diese Methode soll nichts machen somit kein Parameter und kein Rückgabewert haben
    // 2. "mult" die zwei int multipliziert und das Ergebnis (int) zurückgibt
    // 3. "multByTwo" es soll "mult" mit einem festen Parameter 2 aufgerufen werden und zurückgegeben werden(int)

    public void nope(){
        //macht nix
    }

    public int mult(int x, int y){
        return x*y;
    }

    public int multByTwo(int x){
        return mult(x,2);
    }

    public static void main(String[] args){
        //Muss nicht bearbeitet werden
        Method[] methods = EigeneMethoden.class.getDeclaredMethods();
        Class<?> cls = EigeneMethoden.class;

        MainProvider.printAscii();
        // Falls man etwas mit denn Parametern spielen will das nach "lp" sind die jeweiligen Parameter
        for (Method method: methods){
            if (method.getName().equals("main")) continue;
            if (method.getName().equals("nope")) MainProvider.exec(method,cls);
            if (method.getName().equals("mult")) MainProvider.exec(method,cls,5,4);
            if (method.getName().equals("multByTwo")) MainProvider.exec(method,cls,7);
        }
    }
}
