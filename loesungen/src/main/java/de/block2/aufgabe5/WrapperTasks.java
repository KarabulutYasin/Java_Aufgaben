package de.block2.aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class WrapperTasks {

    // FInde das minimum und maximum in einer Liste von Doubles
    // Rückgabe als Array mit 2 Elementen: [min, max]
    // Falls die Liste leer ist, wirf eine IllegalArgumentException
    // Falls ein Element null ist, wirf eine IllegalArgumentException
    public double[] minMax(List<Double> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("empty list");
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        for (Double d : list) {
            if (d == null) throw new IllegalArgumentException("null element");
            if (d < min) min = d;
            if (d > max) max = d;
        }
        return new double[]{min, max};
    }

    // Wandelt eine Liste von Strings in eine Liste von Integers um.
    // Falls die Liste null ist, wirf eine IllegalArgumentException
    // Falls ein Element nicht in einen Integer umgewandelt werden kann, wirf eine NumberFormatException
    public List<Integer> parseToIntegers(List<String> list) {
        if (list == null) throw new IllegalArgumentException("list null");
        List<Integer> out = new ArrayList<>();
        for (String s : list) {
            out.add(Integer.parseInt(s));
        }
        return out;
    }
}
