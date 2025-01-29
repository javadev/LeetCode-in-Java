package g0101_0200.s0124_binary_tree_maximum_path_sum;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Depth_First_Search
// #Tree #Binary_Tree #Udemy_Tree_Stack_Queue #Top_Interview_150_Binary_Tree_General
// #Big_O_Time_O(N)_Space_O(N) #2024_11_13_Time_0_ms_(100.00%)_Space_44.4_MB_(29.91%)

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
