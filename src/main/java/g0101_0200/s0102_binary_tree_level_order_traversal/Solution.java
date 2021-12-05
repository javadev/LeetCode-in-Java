package g0101_0200.s0102_binary_tree_level_order_traversal;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Breadth_First_Search #Tree
// #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> level = new ArrayList<>();
        while (!queue.isEmpty()) {
            root = queue.remove();
            while (!queue.isEmpty() && root != null) {
                level.add(root.val);

                if (root.left != null) {
                    queue.add(root.left);
                }
                if (root.right != null) {
                    queue.add(root.right);
                }

                root = queue.remove();
            }
            result.add(level);
            level = new ArrayList<>();
            if (!queue.isEmpty()) {
                queue.add(null);
            }
        }
        return result;
    }
}
