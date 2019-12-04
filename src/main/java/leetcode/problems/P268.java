package leetcode.problems;

import java.util.Arrays;

public class P268 {

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("nums is null or empty");

        int sum = Arrays.stream(nums).sum();
        return (1 + nums.length) * nums.length / 2 - sum;
    }
}
