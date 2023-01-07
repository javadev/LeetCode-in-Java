package g0701_0800.s0783_minimum_distance_between_bst_nodes;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_03_26_Time_0_ms_(100.00%)_Space_42_MB_(32.99%)

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
    private int prev = -1;
    private int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return min;
        }
        minDiffInBST(root.left);
        if (prev != -1) {
            min = Math.min(min, Math.abs(root.val - prev));
        }
        prev = root.val;
        minDiffInBST(root.right);
        return min;
    }
}
