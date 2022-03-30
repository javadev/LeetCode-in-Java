package g0201_0300.s0230_kth_smallest_element_in_a_bst;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Binary_Search_Tree #Data_Structure_II_Day_17_Tree
// #2022_03_14_Time_0_ms_(100.00%)_Space_42.1_MB_(84.70%)

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
    private int k;
    private int count = 0;
    private int val;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        calculate(root);
        return val;
    }

    private void calculate(TreeNode node) {
        if (node.left == null && node.right == null) {
            count++;
            if (count == k) {
                this.val = node.val;
            }
            return;
        }
        if (node.left != null) {
            calculate(node.left);
        }
        count++;
        if (count == k) {
            this.val = node.val;
            return;
        }
        if (node.right != null) {
            calculate(node.right);
        }
    }
}
