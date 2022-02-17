package g0901_1000.s0938_range_sum_of_bst;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_02_17_Time_0_ms_(100.00%)_Space_67.6_MB_(10.68%)

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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val <= high && root.val >= low) {
            int sum = root.val;
            int left = rangeSumBST(root.left, low, high);
            int right = rangeSumBST(root.right, low, high);
            return sum + left + right;
        } else if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } else {
            return rangeSumBST(root.left, low, high);
        }
    }
}
