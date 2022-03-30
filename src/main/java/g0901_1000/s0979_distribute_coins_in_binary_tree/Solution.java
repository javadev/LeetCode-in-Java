package g0901_1000.s0979_distribute_coins_in_binary_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

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
