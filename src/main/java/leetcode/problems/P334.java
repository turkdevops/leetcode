package leetcode.problems;

public class P334 {

    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;

        for (int i = 0; i < nums.length - 2; ++i) {
            for (int j = i + 1; j < nums.length - 1; ++j) {
                for (int k = j + 1; k < nums.length; ++k) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
