package dev.alexladeira.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int min = arr.stream().parallel().filter(predicate -> predicate > 0).min(Comparator.naturalOrder()).orElse(0);
        while (min > 0) {
            int count = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) > 0) {
                    count++;
                } else {
                    continue;
                }
                int value = arr.get(i) - min;
                arr.set(i, value);
            }
            result.add(count);
            min = arr.stream().parallel().filter(predicate -> predicate > 0).min(Comparator.naturalOrder()).orElse(0);
        }

        return result;
    }
}
