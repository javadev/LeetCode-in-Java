package g0901_1000.s0965_univalued_binary_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_31_Time_1_ms_(17.57%)_Space_42.1_MB_(20.22%)

import com_github_leetcode.TreeNode;
import java.util.LinkedList;

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
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val != val) {
                return false;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return true;
    }
}
