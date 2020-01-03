package leetcode.problems;

import leetcode.datastructure.tree.binary.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        recursiveTraversal(root, values);
        return values;
    }

    private void recursiveTraversal(TreeNode root, List<Integer> values) {
        if (root == null) return;

        recursiveTraversal(root.left, values);
        values.add(root.val);
        recursiveTraversal(root.right, values);
    }
}
