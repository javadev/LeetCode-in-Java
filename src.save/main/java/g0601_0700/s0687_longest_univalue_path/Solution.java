package g0601_0700.s0687_longest_univalue_path;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_03_22_Time_3_ms_(79.43%)_Space_68.5_MB_(25.41%)

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
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] res = new int[1];
        preorderLongestSinglePathLen(root, res);
        return res[0];
    }

    private int preorderLongestSinglePathLen(TreeNode root, int[] res) {
        if (root == null) {
            return -1;
        }
        int left = preorderLongestSinglePathLen(root.left, res);
        int right = preorderLongestSinglePathLen(root.right, res);

        if (root.left == null || root.val == root.left.val) {
            left = left + 1;
        } else {
            left = 0;
        }

        if (root.right == null || root.val == root.right.val) {
            right = right + 1;
        } else {
            right = 0;
        }
        int longestPathLenPassingThroughRoot = left + right;
        res[0] = Math.max(res[0], longestPathLenPassingThroughRoot);
        return Math.max(left, right);
    }
}
