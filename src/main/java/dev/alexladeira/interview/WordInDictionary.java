package dev.alexladeira.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordInDictionary {

    public static boolean containsAll(String word, String dictionary) {
        Map<String, List<String>> dictionaryMap = Arrays.asList(dictionary.split(" ")).stream()
                .collect(Collectors.groupingBy(classifier -> classifier));
        Map<String, List<String>> wordMap = Arrays.asList(word.split(" ")).stream()
                .collect(Collectors.groupingBy(classifier -> classifier));

        for (Map.Entry<String, List<String>> entry : wordMap.entrySet()) {
            if (dictionaryMap.containsKey(entry.getKey())) {
                if (entry.getValue().size() <= dictionaryMap.get(entry.getKey()).size()) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
