package g0501_0600.s0572_subtree_of_another_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Hash_Function #String_Matching

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean isSubtreeFound(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            return isSubtreeFound(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
        } else {
            return false;
        }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return isSubtreeFound(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }
}
