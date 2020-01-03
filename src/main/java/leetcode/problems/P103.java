package leetcode.problems;

import leetcode.datastructure.tree.binary.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>(0);

        List<List<Integer>> values = new ArrayList<>();

        // left -> right and right -> left stacks
        Stack<TreeNode> lr = new Stack<>();
        Stack<TreeNode> rl = new Stack<>();

        // first row is left to right
        lr.add(root);
        while (!lr.isEmpty() || !rl.isEmpty()) {
            List<Integer> row = new ArrayList<>(Math.max(lr.size(), rl.size()));
            values.add(row);

            if (!lr.isEmpty()) {
                while (!lr.isEmpty()) {
                    TreeNode node = lr.pop();

                    if (node.left != null) rl.push(node.left);
                    if (node.right != null) rl.push(node.right);

                    row.add(node.val);
                }
            }
            else {
                while (!rl.isEmpty()) {
                    TreeNode node = rl.pop();

                    if (node.right != null) lr.push(node.right);
                    if (node.left != null) lr.push(node.left);

                    row.add(node.val);
                }
            }
        }

        return values;
    }
}
