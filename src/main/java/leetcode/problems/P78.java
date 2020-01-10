package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P78 {

    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>(0);

        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int n : nums) {
            List<List<Integer>> newSets = new ArrayList<>();
            for (List<Integer> sets : subsets) {
                List<Integer> ns = new ArrayList<>(sets);
                ns.add(n);
                newSets.add(ns);
            }
            subsets.addAll(newSets);
        }

        return subsets;
    }
}
