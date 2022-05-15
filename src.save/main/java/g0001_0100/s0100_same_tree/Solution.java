package g0001_0100.s0100_same_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Acceptance_55.6%
// #2022_02_21_Time_0_ms_(100.00%)_Space_39.5_MB_(37.48%)

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
        } else {
            return n == null && m == null;
        }
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
