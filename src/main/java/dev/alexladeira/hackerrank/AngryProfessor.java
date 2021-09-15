package dev.alexladeira.hackerrank;

import java.util.List;

public class AngryProfessor {
    public static String isCancelled(int k, List<Integer> a) {
        return a.stream()
                .filter(integer -> integer <= 0)
                .count() < k ? "YES" : "NO";
    }
}
