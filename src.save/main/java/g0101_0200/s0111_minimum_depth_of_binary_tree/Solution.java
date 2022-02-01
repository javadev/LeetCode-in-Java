package g0101_0200.s0111_minimum_depth_of_binary_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int d = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left == null && current.right == null && d > 0) {
                    return d + 1;
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
            }
            d++;
        }
        return d;
    }
}
