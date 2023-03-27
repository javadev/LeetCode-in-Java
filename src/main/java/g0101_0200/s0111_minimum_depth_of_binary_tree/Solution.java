package g0101_0200.s0111_minimum_depth_of_binary_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_06_23_Time_1_ms_(97.49%)_Space_97_MB_(5.22%)

import com_github_leetcode.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
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
