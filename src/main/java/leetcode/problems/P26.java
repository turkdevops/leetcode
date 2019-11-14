package leetcode.problems;

public class P26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        else {
            int prev = nums[0];
            int ui = 1;

            for (int i = 1; i < nums.length; ++i) {
                int curr = nums[i];
                if (curr != prev) {
                    nums[ui++] = curr;
                    prev = curr;
                }
            }

            return ui;
        }
    }
}
