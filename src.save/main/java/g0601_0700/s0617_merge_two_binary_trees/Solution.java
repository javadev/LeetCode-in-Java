package g0601_0700.s0617_merge_two_binary_trees;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search
// #2022_03_21_Time_1_ms_(72.47%)_Space_50.8_MB_(48.77%)

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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        return new TreeNode(
                root1.val + root2.val,
                mergeTrees(root1.left, root2.left),
                mergeTrees(root1.right, root2.right));
    }
}
