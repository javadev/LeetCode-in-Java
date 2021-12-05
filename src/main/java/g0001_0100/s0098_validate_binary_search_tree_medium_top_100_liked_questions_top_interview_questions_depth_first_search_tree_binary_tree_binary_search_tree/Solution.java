package g0001_0100.s0098_validate_binary_search_tree_medium_top_100_liked_questions_top_interview_questions_depth_first_search_tree_binary_tree_binary_search_tree;

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
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // we will send a valid range and check whether the root lies in the range
    // and update the range for the subtrees
    private boolean solve(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }
        if (root.val <= left || root.val >= right) {
            return false;
        }
        return solve(root.left, left, root.val) && solve(root.right, root.val, right);
    }
}
