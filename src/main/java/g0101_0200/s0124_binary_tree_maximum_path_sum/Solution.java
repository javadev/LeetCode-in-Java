package g0101_0200.s0124_binary_tree_maximum_path_sum;

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Depth_First_Search
// #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMaxPathSum(root);
        return maxSum;
    }

    public int findMaxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = findMaxPathSum(root.left);
        int rightSum = findMaxPathSum(root.right);
        int totalSum = root.val + leftSum + rightSum;

        int maxValue = Math.max(leftSum + root.val, rightSum + root.val);
        maxValue = Math.max(maxValue, totalSum);
        maxValue = Math.max(maxValue, root.val);

        if (maxValue > maxSum) {
            maxSum = maxValue;
        }

        return Math.max((Math.max(leftSum, rightSum) + root.val), root.val);
    }
}
