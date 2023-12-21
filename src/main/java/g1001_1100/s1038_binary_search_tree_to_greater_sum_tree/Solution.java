package g1001_1100.s1038_binary_search_tree_to_greater_sum_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_02_27_Time_0_ms_(100.00%)_Space_42.2_MB_(6.86%)

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
    private int greaterSum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) {
            bstToGst(root.right);
        }
        greaterSum = root.val = greaterSum + root.val;
        if (root.left != null) {
            bstToGst(root.left);
        }
        return root;
    }
}
