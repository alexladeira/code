package dev.alexladeira.hackerrank;

public class ChocolateFeast {
    /*
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER n 2. INTEGER c 3. INTEGER m
     */
    public static int chocolateFeast(int n, int c, int m) {
        int wrapper = n / c, eaten = n / c + wrapper / m;
        while (wrapper > m) {
            wrapper = wrapper % m + wrapper / m;
            eaten += wrapper / m;
        }
        return eaten;
    }
}
