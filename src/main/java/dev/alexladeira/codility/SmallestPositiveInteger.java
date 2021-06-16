package dev.alexladeira.codility;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestPositiveInteger {

    SmallestPositiveInteger() {
    }

    public static int solution(int[] a) {
        Set<Integer> set = IntStream.of(a).boxed().distinct().collect(Collectors.toSet());

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 0;
    }
}