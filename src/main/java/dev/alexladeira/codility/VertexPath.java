package dev.alexladeira.codility;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class VertexPath {
    VertexPath() {
    }

    public static boolean solution(int n, int[] a, int[] b) {
        NavigableMap<Integer, Integer> result = new TreeMap<>();
        for (int i = 0; i < b.length; i++) {
            if (result.size() == 0 && (a[i] == 1 || b[i] == 1)) {
                result.put(a[i], b[i]);
            } else {
                if (validadeLastEntry(result.lastEntry(), a[i], b[i])) {
                    result.put(a[i], b[i]);
                    if (shouldBreak(n, a[i], b[i])) {
                        break;
                    }
                }
            }
        }
        return result.size() == n - 1 && (result.lastEntry().getKey() == n || result.lastEntry().getValue() == n);
    }

    public static boolean shouldBreak(int n, int a, int b) {
        return a == n || b == n;
    }

    public static boolean validadeLastEntry(Map.Entry<Integer, Integer> entry, int a, int b) {
        return entry.getKey() == a || entry.getKey() == b || entry.getValue() == a || entry.getValue() == b;
    }
}
