package g0001_0100.s0100_same_tree;

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
    private boolean trav(TreeNode n, TreeNode m) {
        if (n != null && m != null) {
            if (n.val != m.val) {
                return false;
            }
            return (trav(n.left, m.left) && trav(n.right, m.right));
        } else if (n == null && m == null) {
            return true;
        }
        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return trav(p, q);
    }
}
