package leetcode.problems;

import leetcode.datastructure.tree.binary.TreeNode;

public class P108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : sortedArrayToBST(nums, 0, nums.length);
    }

    /* low index included, and high index excluded */
    private TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        if (nums == null || low >= high) return null;

        int mid = (high - low) / 2 + low;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, low, mid);
        root.right = sortedArrayToBST(nums, mid + 1, high);
        return root;
    }
}
