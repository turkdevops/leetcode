package leetcode.problems;

import leetcode.datastructure.tree.binary.TreeNode;

public class P98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;
        if ((lower != null && node.val <= lower) || (upper != null && node.val >= upper))
            return false;

        return isValidBST(node.left, lower, node.val) &&
                isValidBST(node.right, node.val, upper);
    }
}
