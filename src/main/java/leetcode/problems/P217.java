package leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P217 {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        else {
            Set<Integer> vs = new HashSet<>(nums.length);
            for (int num : nums) {
                if (!vs.add(num)) {
                    return true;
                }
            }

            return false;
        }
    }
}
