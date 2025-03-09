package g0501_0600.s0530_minimum_absolute_difference_in_bst;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #Top_Interview_150_Binary_Search_Tree #2025_03_09_Time_0_ms_(100.00%)_Space_44.75_MB_(31.94%)

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
    private int ans = Integer.MAX_VALUE;
    private int prev = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return ans;
        }
        getMinimumDifference(root.left);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        getMinimumDifference(root.right);
        return ans;
    }
}
