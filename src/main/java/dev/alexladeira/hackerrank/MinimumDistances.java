package dev.alexladeira.hackerrank;

import java.util.List;

public class MinimumDistances {

    MinimumDistances() {
    }

    public static int minimumDistances(List<Integer> a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    int diff = j - i;
                    if (diff > 0 && diff < min) {
                        min = diff;
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

}
