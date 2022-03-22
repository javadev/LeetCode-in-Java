package g0601_0700.s0671_second_minimum_node_in_a_binary_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree
// #2022_03_22_Time_0_ms_(100.00%)_Space_41.6_MB_(31.26%)

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
    int min = Integer.MAX_VALUE;
    int secMin = -1;
    int diff = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.val < min) {
            min = root.val;
        }
        if (root.val != min && Math.abs(root.val - min) < diff) {
            secMin = root.val;
            diff = Math.abs(root.val - min);
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        return secMin;
    }
}
