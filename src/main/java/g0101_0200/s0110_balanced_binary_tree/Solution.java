package g0101_0200.s0110_balanced_binary_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree
// #2022_02_21_Time_0_ms_(100.00%)_Space_41.6_MB_(72.46%)

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        // Empty Tree is balanced
        if (root == null) {
            return true;
        }
        // Get max height of subtree child
        // Get max height of subtree child
        // compare height difference (cannot be more than 1)
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) {
            leftHeight = getMaxHeight(root.left);
        }
        if (root.right != null) {
            rightHeight = getMaxHeight(root.right);
        }
        int heightDiff = Math.abs(leftHeight - rightHeight);
        // if passes height check
        //  - Check if left subtree is balanced and if the right subtree is balanced
        //  - If one of both are imbalanced, then the tree is imbalanced
        return heightDiff <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getMaxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        // Left
        if (root.left != null) {
            leftHeight = getMaxHeight(root.left);
        }
        // Right
        if (root.right != null) {
            rightHeight = getMaxHeight(root.right);
        }
        if (leftHeight > rightHeight) {
            return 1 + leftHeight;
        } else {
            return 1 + rightHeight;
        }
    }
}
