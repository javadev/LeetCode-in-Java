package g0801_0900.s0865_smallest_subtree_with_all_the_deepest_nodes;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_27_Time_0_ms_(100.00%)_Space_42.4_MB_(41.93%)

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
    private int deepLevel = 0;
    private TreeNode left = null;
    private TreeNode right = null;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return root;
        }
        deep(root, 0);
        if (right == null) {
            return left;
        } else {
            return lca(root, left.val, right.val);
        }
    }

    private TreeNode lca(TreeNode root, int left, int right) {
        if (root == null) {
            return null;
        }
        if (root.val == left || root.val == right) {
            return root;
        }
        TreeNode leftLca = lca(root.left, left, right);
        TreeNode rightLca = lca(root.right, left, right);

        if (leftLca != null && rightLca != null) {
            return root;
        } else if (leftLca != null) {
            return leftLca;
        } else {
            return rightLca;
        }
    }

    private void deep(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (deepLevel < level) {
            deepLevel = level;
            left = root;
            right = null;
        } else if (deepLevel == level) {
            right = root;
        }
        deep(root.left, level + 1);
        deep(root.right, level + 1);
    }
}
