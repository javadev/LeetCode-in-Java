package g0501_0600.s0572_subtree_of_another_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Hash_Function #String_Matching

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean isSubtreeFound(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (same(root, subRoot)) {
            return true;
        }
        return isSubtreeFound(root.left, subRoot) || isSubtreeFound(root.right, subRoot);
    }

    private boolean same(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == t;
        }
        if (s.val != t.val) {
            return false;
        }
        return same(s.left, t.left) && same(s.right, t.right);
    }
}
