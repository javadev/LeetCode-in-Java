package g0801_0900.s0814_binary_tree_pruning;

// #Medium #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
