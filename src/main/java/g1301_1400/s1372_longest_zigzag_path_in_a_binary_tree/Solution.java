package g1301_1400.s1372_longest_zigzag_path_in_a_binary_tree;

// #Medium #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree
// #2022_03_21_Time_9_ms_(64.47%)_Space_74_MB_(56.45%)

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
    private int maxLength = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, true);
        return maxLength;
    }

    private int dfs(TreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left, false);
        int right = dfs(root.right, true);
        maxLength = Math.max(maxLength, left);
        maxLength = Math.max(maxLength, right);
        return 1 + (isLeft ? left : right);
    }
}
