package g0501_0600.s0530_minimum_absolute_difference_in_bst;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Binary_Search_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    private int ans = Integer.MAX_VALUE;
    private int prev = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return ans;
        }
        getMinimumDifference(root.left);
        ans = Math.min(ans, Math.abs(root.val - prev));
        prev = root.val;
        getMinimumDifference(root.right);
        return ans;
    }
}
