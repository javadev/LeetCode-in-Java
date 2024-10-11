package g0501_0600.s0572_subtree_of_another_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Hash_Function #String_Matching
// #Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search
// #2024_10_11_Time_2_ms_(97.06%)_Space_44.2_MB_(68.85%)

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (traverse(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean traverse(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot != null) {
            return false;
        }
        if (root != null && subRoot == null) {
            return false;
        }
        if (root == null) {
            return true;
        }
        if (root.val != subRoot.val) {
            return false;
        }
        return traverse(root.left, subRoot.left) && traverse(root.right, subRoot.right);
    }
}
