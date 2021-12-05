package g0101_0200.s0101_symmetric_tree_easy_top_100_liked_questions_top_interview_questions_depth_first_search_breadth_first_search_tree_binary_tree;

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
            boolean isSymetrical = false;
            if (leftNode == null && rightNode == null) {
                isSymetrical = true;
            }
            return isSymetrical;
        }

        if (leftNode.val != rightNode.val) {
            return false;
        }

        return helper(leftNode.left, rightNode.right) && helper(leftNode.right, rightNode.left);
    }
}
