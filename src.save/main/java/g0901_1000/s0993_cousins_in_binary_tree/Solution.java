package g0901_1000.s0993_cousins_in_binary_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_31_Time_1_ms_(60.08%)_Space_42.3_MB_(27.64%)

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
    public boolean isCousins(TreeNode root, int x, int y) {
        return !isSiblings(root, x, y) && isSameLevels(root, x, y);
    }

    private boolean isSameLevels(TreeNode root, int x, int y) {
        return findLevel(root, x, 0) == findLevel(root, y, 0);
    }

    private int findLevel(TreeNode root, int x, int level) {
        if (root == null) {
            return -1;
        }
        if (root.val == x) {
            return level;
        }
        int leftLevel = findLevel(root.left, x, level + 1);
        if (leftLevel == -1) {
            return findLevel(root.right, x, level + 1);
        } else {
            return leftLevel;
        }
    }

    private boolean isSiblings(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }
        // Check children first
        boolean leftSubTreeContainsCousins = isSiblings(root.left, x, y);
        boolean rightSubTreeContainsCousins = isSiblings(root.right, x, y);
        if (leftSubTreeContainsCousins || rightSubTreeContainsCousins) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        // Check for siblings at parent
        return root.left.val == x && root.right.val == y
                || root.right.val == x && root.left.val == y;
    }
}
