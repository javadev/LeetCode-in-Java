package g0901_1000.s0998_maximum_binary_tree_ii;

// #Medium #Tree #Binary_Tree #2022_03_31_Time_0_ms_(100.00%)_Space_42.1_MB_(56.35%)

import com_github_leetcode.TreeNode;

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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        return insertIntoMaxTree2(root, val);
    }

    private TreeNode insertIntoMaxTree2(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            return new TreeNode(val, root, null);
        }
        root.right = this.insertIntoMaxTree2(root.right, val);
        return root;
    }
}
