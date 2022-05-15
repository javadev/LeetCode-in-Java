package g0101_0200.s0124_binary_tree_maximum_path_sum;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Depth_First_Search
// #Tree #Binary_Tree #Acceptance_37.7% #2022_02_22_Time_1_ms_(76.01%)_Space_47.6_MB_(29.62%)

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
    private int max = Integer.MIN_VALUE;

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // to avoid the -ve values in left side we will compare them with 0
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        int current = root.val + left + right;
        if (current > max) {
            max = current;
        }
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
}
