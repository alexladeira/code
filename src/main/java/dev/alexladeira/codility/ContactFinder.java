package dev.alexladeira.codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactFinder {
    ContactFinder() {
    }

    public static String solution(String[] a, String[] b, String p) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (b[i].contains(p)) {
                result.add(a[i]);
            }
        }
        return result.stream().sorted().findFirst().orElse("NO CONTACT");
    }

    public static String solutionWithMap(String[] a, String[] b, String p) {
        Map<String, String> contacts = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            contacts.put(b[i], a[i]);
        }
        return contacts.entrySet().stream().filter(predicate -> predicate.getKey().contains(p)).map(Map.Entry::getValue)
                .sorted().findFirst().orElse("NO CONTACT");
    }
}
