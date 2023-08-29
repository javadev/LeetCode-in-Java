package g0501_0600.s0572_subtree_of_another_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Hash_Function #String_Matching
// #Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search
// #2022_08_10_Time_1_ms_(100.00%)_Space_47.2_MB_(13.44%)

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
    private boolean isSubtreeFound(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isSubtreeFound(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
        } else {
            return false;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return isSubtreeFound(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }
}
