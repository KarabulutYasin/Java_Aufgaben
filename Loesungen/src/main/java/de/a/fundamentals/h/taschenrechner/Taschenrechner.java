package de.a.fundamentals.h.taschenrechner;

import de.a.fundamentals.h.taschenrechner.Exception.EmptyPatternException;
import de.a.fundamentals.h.taschenrechner.Exception.NoPatternFoundException;
import de.a.fundamentals.h.taschenrechner.Rechenzeichen.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Taschenrechner {
    //TODO
    // Es wird ein Scanner vorgegeben von dem die eingaben eingelesen werden
    // Es soll ein Taschenrechner erstellt werden der 2 zahlen verrechnet
    // Wenn benötigt wird schreibe eigene Hilfsmethoden
    // Falls es zu Fehlern kommt soll eine eigene RuntimeException geworfen werden
    // Das ergebnis soll dann einfach zurückgegeben werden
    // Es wird folgendes Format vorgegeben und wenn dieses nicht erfüllt wird soll auch eine eigene RuntimeException geworfen werden

    //Format: besteht aus einer Zahl Leerzeichen Rechenzeichen Leerzeichen Zahl

    //Beispiele:
    //12 + 23 -> 35
    //12+ 23 -> Exception
    // 12 + 23 -> Exception
    //12 +23 -> Exception
    //12 + -> Exception
    // etc.

    List <Rechenzeichen>rechenzeichenArten = new ArrayList(List.of(
            new Plus(),
            new Minus(),
            new Mal(),
            new Geteilt()
    ));

    public double calc(Scanner sc){
        try{
            String[] stringAsArray = splitString(sc.nextLine());
            for (Rechenzeichen rechenzeichen:rechenzeichenArten){
                if (rechenzeichen.isRechenzeichen(stringAsArray[1])) return rechenzeichen.calcRechenzeichen(Integer.parseInt(stringAsArray[0]),Integer.parseInt(stringAsArray[2]));
            }
            throw new NoPatternFoundException("There was no matching arithmetic symbol in the pattern");
        }catch (NoSuchElementException e){
            throw new EmptyPatternException("There was no equation");
        }catch (NumberFormatException e){
            throw new NoPatternFoundException("Where integer should be there was no integer");
        }
    }

    public String[] splitString(String input) throws NoPatternFoundException{
        String[] result = input.split(" ");
        if (result.length == 3) return result;
        else if (result.length > 3) throw new NoPatternFoundException("The pattern was to Long");
        else throw new NoPatternFoundException("The Pattern was to short");
    }



}
