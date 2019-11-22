package leetcode.problems;

import leetcode.datastructure.tree.binary.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class P102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>(0);

        List<List<Integer>> levels = new ArrayList<>();

        Queue<TreeNode> caches = new ArrayDeque<>();
        caches.add(root);

        // level delimiter
        TreeNode delimiter = new TreeNode(0);

        while (!caches.isEmpty()) {
            List<Integer> level = new ArrayList<>(caches.size());

            caches.add(delimiter);

            TreeNode node;
            while ((node = caches.poll()) != delimiter) {
                if (node != null) {
                    level.add(node.val);

                    if (node.left != null) caches.add(node.left);
                    if (node.right != null) caches.add(node.right);
                }
            }

            levels.add(level);
        }

        return levels;
    }
}
