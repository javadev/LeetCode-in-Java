package g0601_0700.s0671_second_minimum_node_in_a_binary_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    int min = Integer.MAX_VALUE;
    int secMin = -1;
    int diff = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        if (root.val < min) {
            min = root.val;
        }
        if (root.val != min && Math.abs(root.val - min) < diff) {
            secMin = root.val;
            diff = Math.abs(root.val - min);
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        return secMin;
    }
}
