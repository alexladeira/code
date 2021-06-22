package dev.alexladeira.hackerrank;

public class FindDigits {
    FindDigits() {
    }

    public static int findDigits(int number) {
        String strNumber = String.valueOf(number);
        int cont = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            int n = Integer.parseInt(strNumber.substring(i, i + 1));
            if (n == 0) {
                continue;
            }
            int result = number % n;
            if (result == 0) {
                cont = cont + 1;
            }
        }
        return cont;
    }
}
