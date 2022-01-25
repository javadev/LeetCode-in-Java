package g0601_0700.s0669_trim_a_binary_search_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode trimBST(TreeNode root, int l, int r) {
        if (root == null) {
            return root;
        }
        if (root.val > r) {
            return trimBST(root.left, l, r);
        }
        if (root.val < l) {
            return trimBST(root.right, l, r);
        }
        root.left = trimBST(root.left, l, r);
        root.right = trimBST(root.right, l, r);
        return root;
    }
}
