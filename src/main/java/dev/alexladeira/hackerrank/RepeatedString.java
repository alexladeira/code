package dev.alexladeira.hackerrank;

class RepeatedString {

    RepeatedString() {
    }

    static long repeatedString(String s, long n) {
        if (s.length() == 1) {
            return "a".equals(s) ? n : 0;
        }
        long count = countingA(s);
        long maxInteraction = n / s.length();
        int modResult = (int) (n % s.length());
        if (modResult == 0) {
            return count * maxInteraction;
        } else {
            return count * maxInteraction + countingA(s.substring(0, modResult));
        }

    }

    static long countingA(String s) {
        return s.chars().filter(predicate -> predicate == 97).count();
    }

}