package leetcode.problems;

public class P974 {

    public int subarraysDivByK(int[] A, int K) {
        if (A == null || A.length == 0) {
            return 0;
        }
        else {
            int c = 0;

            for (int i = 0; i < A.length; ++i) {
                int sum = 0;
                for (int j = i; j < A.length; ++j) {
                    sum += A[j];
                    if (sum % K == 0) {
                        c++;
                    }
                }
            }

            return c;
        }
    }
}
