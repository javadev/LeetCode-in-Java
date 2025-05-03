package g1001_1100.s1022_sum_of_root_to_leaf_binary_numbers;

// #Easy #Depth_First_Search #Tree #Binary_Tree
// #2025_05_03_Time_0_ms_(100.00%)_Space_42.08_MB_(64.36%)

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
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }

    private int sumRootToLeaf(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = 2 * sum + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }
}
