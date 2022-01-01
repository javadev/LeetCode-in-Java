package g0101_0200.s0129_sum_root_to_leaf_numbers;

// #Medium #Depth_First_Search #Tree #Binary_Tree

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
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        recurseSum(root, 0);
        return sum;
    }

    private void recurseSum(TreeNode node, int curNum) {
        if (node.left == null && node.right == null) {
            sum += 10 * curNum + node.val;
        } else {
            if (node.left != null) {
                recurseSum(node.left, 10 * curNum + node.val);
            }
            if (node.right != null) {
                recurseSum(node.right, 10 * curNum + node.val);
            }
        }
    }
}
