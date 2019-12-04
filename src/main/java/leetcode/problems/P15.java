package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>(0);

        List<int[]> solutions = new ArrayList<>();

        int length = nums.length;

        for (int ai = 0; ai < length - 2; ++ai) {
            int a = nums[ai];

            for (int bi = ai + 1; bi < length - 1; ++bi) {
                int b = nums[bi];

                for (int ci = bi + 1; ci < length; ++ci) {
                    int c = nums[ci];

                    if (a + b + c == 0) {
                        if (! contains(solutions, a, b, c)) {
                            solutions.add(new int[]{a, b, c});
                        }

                        break;
                    }
                }
            }
        }

        return solutions.stream().map(
                arr -> Arrays.stream(arr).boxed().collect(Collectors.toList())
        ).collect(Collectors.toList());
    }

    private static boolean contains(List<int[]> solutions, int... target) {
        if (solutions.isEmpty()) return false;

        for (int[] c : solutions) {
            if (equals(target, c)) {
                return true;
            }
        }

        return false;
    }

    private static boolean equals(int[] va, int[] vb) {
        Arrays.sort(va);
        Arrays.sort(vb);
        return Arrays.equals(va, vb);
    }
}
