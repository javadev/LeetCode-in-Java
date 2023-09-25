package g0601_0700.s0669_trim_a_binary_search_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_03_22_Time_0_ms_(100.00%)_Space_45.7_MB_(24.17%)

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
    public TreeNode trimBST(TreeNode root, int l, int r) {
        if (root == null) {
            return root;
        }
        if (root.val > r) {
            return trimBST(root.left, l, r);
        }
        if (root.val < l) {
            return trimBST(root.right, l, r);
        }
        root.left = trimBST(root.left, l, r);
        root.right = trimBST(root.right, l, r);
        return root;
    }
}
