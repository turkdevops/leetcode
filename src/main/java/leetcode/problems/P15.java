package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>(0);

        Arrays.sort(nums);

        List<List<Integer>> solutions = new ArrayList<>();

        int length = nums.length;

        for (int ai = 0; ai < length - 2; ++ai) {
            int a = nums[ai];
            if (a > 0) break;
            if (ai > 0 && nums[ai] == nums[ai-1]) continue;

            int lo = ai + 1;
            int hi = length - 1;
            while (lo < hi) {
                if (lo > ai + 1 && nums[lo] == nums[lo - 1]) {
                    lo++;
                }
                else if (hi < length - 1 && nums[hi] == nums[hi + 1]) {
                    hi--;
                }
                else {
                    int b = nums[lo];
                    int c = nums[hi];

                    int sum = a + b + c;
                    if (sum == 0) {
                        solutions.add(Arrays.asList(a, b, c));
                        lo++;
                        hi--;
                    }
                    else if (sum < 0) {
                        lo++;
                    }
                    else {
                        hi--;
                    }
                }
            }
        }

        return solutions;
    }
}
