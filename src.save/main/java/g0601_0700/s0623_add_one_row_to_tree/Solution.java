package g0601_0700.s0623_add_one_row_to_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_21_Time_0_ms_(100.00%)_Space_45.6_MB_(29.97%)

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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        dfs(root, depth - 2, val);
        return root;
    }

    private void dfs(TreeNode node, int depth, int val) {
        if (depth == 0) {
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);
            left.left = node.left;
            right.right = node.right;
            node.left = left;
            node.right = right;
        } else {
            if (node.left != null) {
                dfs(node.left, depth - 1, val);
            }
            if (node.right != null) {
                dfs(node.right, depth - 1, val);
            }
        }
    }
}
