package leetcode.problems;

public class P974 {

    public int subarraysDivByK(int[] A, int K) {
        int len = A.length;
        int[] P = new int[len+1];
        for (int i = 0; i < len; ++i) {
            P[i+1] = P[i] + A[i];
        }

        int[] count = new int[K];
        for (int p : P) {
            count[(p % K + K) % K]++;
        }

        int rv = 0;
        for (int c : count) {
            rv += c * (c - 1) / 2;
        }

        return rv;
    }
}
