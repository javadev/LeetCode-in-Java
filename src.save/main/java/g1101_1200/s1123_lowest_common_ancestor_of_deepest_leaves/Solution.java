package g1101_1200.s1123_lowest_common_ancestor_of_deepest_leaves;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_06_01_Time_0_ms_(100.00%)_Space_43.4_MB_(8.40%)

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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }
        int leftDep = getDep(root.left);
        int rightDep = getDep(root.right);
        if (leftDep == rightDep) {
            return root;
        } else {
            if (leftDep > rightDep) {
                return lcaDeepestLeaves(root.left);
            } else {
                return lcaDeepestLeaves(root.right);
            }
        }
    }

    public int getDep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getDep(root.left), getDep(root.right));
    }
}
