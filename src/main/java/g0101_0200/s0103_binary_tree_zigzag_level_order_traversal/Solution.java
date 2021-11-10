package g0101_0200.s0103_binary_tree_zigzag_level_order_traversal;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean zig = true;
        LinkedList<Integer> level = new LinkedList<>();
        while (!q.isEmpty()) {
            TreeNode node = q.remove();
            while (!q.isEmpty() && node != null) {
                if (zig) {
                    level.add(node.val);
                } else {
                    level.addFirst(node.val);
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                node = q.remove();
            }
            result.add(level);
            zig = !zig;

            level = new LinkedList<>();
            if (!q.isEmpty()) {
                q.add(null);
            }
        }
        return result;
    }
}
