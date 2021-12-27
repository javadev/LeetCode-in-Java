package g0101_0200.s0101_symmetric_tree;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search
// #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) {
            return leftNode == null && rightNode == null;
        }

        if (leftNode.val != rightNode.val) {
            return false;
        }

        return helper(leftNode.left, rightNode.right) && helper(leftNode.right, rightNode.left);
    }
}
