package g0601_0700.s0669_trim_a_binary_search_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return root;
        }

        if (root.val > R) {
            return trimBST(root.left, L, R);
        }

        if (root.val < L) {
            return trimBST(root.right, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
