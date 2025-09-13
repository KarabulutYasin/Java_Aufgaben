package de.a.fundamentals.loesungen10;

import java.util.Arrays;

public class ArrayTasks {

    //TODO falls ein Array leer ist geh damit um und wirf eine IllegalArgumentException

    // TODO bilde die Summe über das 1D-Array
    public int sum(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("arr null");
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    // TODO neues Array, alle Werte *2 (Original unverändert!)
    public int[] copyDoubled(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("arr null");
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < result.length; i++) result[i] *= 2;
        return result;
    }

    //TODO Prüfe ob target im Array ist
    public boolean contains(int[] arr, int target) {
        if (arr == null) throw new IllegalArgumentException("arr null");
        for (int x : arr) if (x == target) return true;
        return false;
    }

    // Gib denn inhalt des Arrays als String zurück, z.B. "1-2-3"
    public String joinWithDash(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("arr null");
        if (arr.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append('-').append(arr[i]);
        }
        return sb.toString();
    }

    //TODO Summe von allen Elementen in der Matrix (2D-Array)
    public int sum2D(int[][] m) {
        if (m == null) throw new IllegalArgumentException("matrix null");
        int s = 0;
        for (int i = 0; i < m.length; i++) {
            int[] row = m[i];
            if (row == null) throw new IllegalArgumentException("row " + i + " null");
            for (int v : row) s += v;
        }
        return s;
    }
}
