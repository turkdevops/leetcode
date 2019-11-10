package leetcode.problems;

public class P762 {

    public int countPrimeSetBits(int L, int R) {
        assert L <= R;

        int c = 0;
        for (int i = L; i <= R; ++i) {
            if (isPrime(countBit1(i))) {
                c++;
            }
        }

        return c;
    }

    public static int countBit1(int v) {
        int c = 0;
        while (v > 0) {
            c++;
            v &= v - 1;
        }

        return c;
    }

    public static boolean isPrime(int v) {
        assert v >= 0 && v <= 32;

        return v == 2 || v == 3 || v == 5 || v == 7
                || v == 11 || v == 13 || v == 17 || v == 19
                || v == 23
                || v == 31;
    }
}
