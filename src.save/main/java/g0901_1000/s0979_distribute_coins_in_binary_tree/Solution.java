package g0901_1000.s0979_distribute_coins_in_binary_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_03_31_Time_0_ms_(100.00%)_Space_41.8_MB_(85.81%)

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
    private int num = 0;

    public int distributeCoins(TreeNode root) {
        helper(root);
        return num;
    }

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int total = node.val + helper(node.left) + helper(node.right);
        int leftover = total - 1;
        num += Math.abs(leftover);
        return leftover;
    }
}
