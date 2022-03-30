package g1401_1500.s1448_count_good_nodes_in_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_28_Time_2_ms_(99.63%)_Space_60.1_MB_(26.46%)

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
    private int count = 0;

    private void traverse(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            count += 1;
            max = root.val;
        }
        traverse(root.left, max);
        traverse(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        traverse(root, Integer.MIN_VALUE);
        return count;
    }
}
