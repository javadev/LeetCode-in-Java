package g0401_0500.s0437_path_sum_iii;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Level_2_Day_7_Tree #Big_O_Time_O(n)_Space_O(n)
// #2022_07_16_Time_18_ms_(45.66%)_Space_42_MB_(88.96%)

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
    private int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        helper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    public void helper(TreeNode node, int targetSum, long currSum) {
        currSum += node.val;
        if (targetSum == currSum) {
            count++;
        }
        if (node.left != null) {
            helper(node.left, targetSum, currSum);
        }
        if (node.right != null) {
            helper(node.right, targetSum, currSum);
        }
    }
}
