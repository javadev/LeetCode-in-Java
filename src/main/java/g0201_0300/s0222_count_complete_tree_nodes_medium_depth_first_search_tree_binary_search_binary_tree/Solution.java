package g0201_0300.s0222_count_complete_tree_nodes_medium_depth_first_search_tree_binary_search_binary_tree;

import com_github_leetcode.TreeNode;

public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);
        // case 1: When Height(Left sub-tree) = Height(right sub-tree) 2^h - 1
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private int leftHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + leftHeight(root.left);
    }

    private int rightHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + rightHeight(root.right);
    }
}
