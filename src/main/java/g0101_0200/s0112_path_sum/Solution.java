package g0101_0200.s0112_path_sum;

// #Easy #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
