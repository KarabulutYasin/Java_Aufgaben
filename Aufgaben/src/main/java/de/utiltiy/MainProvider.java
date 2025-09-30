package de.utiltiy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainProvider {
    //Das dient nur zur vereinfachung der Ausgabe in der Konsole Hier sind keine Änderungen nötig

    private static String divider = "--------------------------------------------------------------";

    private MainProvider() {}

    public static void printAscii(){
        System.out.println("    /$$$$$                                       /$$$$$$$                     /$$       /$$                                        \n" +
                "   |__  $$                                      | $$__  $$                   | $$      | $$                                        \n" +
                "      | $$  /$$$$$$  /$$    /$$ /$$$$$$         | $$  \\ $$ /$$$$$$   /$$$$$$ | $$$$$$$ | $$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$$      \n" +
                "      | $$ |____  $$|  $$  /$$/|____  $$ /$$$$$$| $$$$$$$//$$__  $$ /$$__  $$| $$__  $$| $$ /$$__  $$| $$_  $$_  $$ /$$_____/      \n" +
                " /$$  | $$  /$$$$$$$ \\  $$/$$/  /$$$$$$$|______/| $$____/| $$  \\__/| $$  \\ $$| $$  \\ $$| $$| $$$$$$$$| $$ \\ $$ \\ $$|  $$$$$$       \n" +
                "| $$  | $$ /$$__  $$  \\  $$$/  /$$__  $$        | $$     | $$      | $$  | $$| $$  | $$| $$| $$_____/| $$ | $$ | $$ \\____  $$      \n" +
                "|  $$$$$$/|  $$$$$$$   \\  $/  |  $$$$$$$        | $$     | $$      |  $$$$$$/| $$$$$$$/| $$|  $$$$$$$| $$ | $$ | $$ /$$$$$$$/      \n" +
                " \\______/  \\_______/    \\_/    \\_______/        |__/     |__/       \\______/ |_______/ |__/ \\_______/|__/ |__/ |__/|_______/       \n" +
                "                                                                                                                                   \n" +
                "                                                                                                                                   \n" +
                "                                                                                                                                   ");
        System.out.println(divider);
    }

    public static void exec(Method method,Class<?> clazz, Object... params) {
        try{
            if (params.length == 0) System.out.println("Aufruf von " + method.getName() + ":");
            else System.out.println("Aufruf von " + method.getName() + " mit Parametern" + Arrays.toString(params) + " :");
            if (method.getReturnType() == void.class) method.invoke(clazz.getConstructor().newInstance(),params);
            else System.out.println(method.invoke(clazz.getConstructor().newInstance(),params));
            System.out.println(divider);
        }catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
