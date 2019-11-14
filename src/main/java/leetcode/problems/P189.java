package leetcode.problems;

public class P189 {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; ++i) {
            rotateRight(nums);
        }
    }

    private void rotateRight(int[] nums) {
        if (nums.length > 1) {
            int v = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = v;
        }
    }
}
