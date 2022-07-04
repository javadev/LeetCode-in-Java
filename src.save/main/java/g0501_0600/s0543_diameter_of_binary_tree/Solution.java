package g0501_0600.s0543_diameter_of_binary_tree;

// #Easy #Top_100_Liked_Questions #Depth_First_Search #Tree #Binary_Tree #Level_2_Day_7_Tree
// #2022_03_20_Time_1_ms_(55.16%)_Space_43.3_MB_(41.25%)

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
    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        diameterOfBinaryTreeUtil(root);
        return diameter;
    }

    private int diameterOfBinaryTreeUtil(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLength = root.left != null ? 1 + diameterOfBinaryTreeUtil(root.left) : 0;
        int rightLength = root.right != null ? 1 + diameterOfBinaryTreeUtil(root.right) : 0;
        diameter = Math.max(diameter, leftLength + rightLength);
        return Math.max(leftLength, rightLength);
    }
}
