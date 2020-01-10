package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P46 {

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>(0);

        List<List<Integer>> permute = new ArrayList<>();
        backtrace(permute, nums, 0);
        return permute;
    }

    private void backtrace(List<List<Integer>> permute, int[] nums, int start) {
        if (start == nums.length) {
            permute.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }
        else {
            for (int i = start; i < nums.length; ++i) {
                swap(nums, start, i);
                backtrace(permute, nums, start + 1);
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
