package dev.alexladeira.codility;

public class PartitalPhoneNumber {

    PartitalPhoneNumber() {
    }

    public static String solution(String s) {
        String phoneNumber = s.replace(" ", "").replace("-", "");
        StringBuilder result = new StringBuilder();
        int size = phoneNumber.length();
        if (size % 3 == 0) {
            writeResult(phoneNumber, result, size);
        } else {
            int temp = size - 2;
            writeResult(phoneNumber, result, temp);
            for (int i = 0; i < 2; i++) {
                if (i % 2 == 0) {
                    result.append("-").append(phoneNumber.charAt(temp + i));
                } else {
                    result.append(phoneNumber.charAt(temp + i));
                }
            }

        }

        return result.toString();
    }

    private static void writeResult(String phoneNumber, StringBuilder result, int size) {
        for (int i = 0; i < size; i++) {
            if (i > 0 && i % 3 == 0) {
                result.append("-").append(phoneNumber.charAt(i));
            } else {
                result.append(phoneNumber.charAt(i));
            }
        }
    }
}
