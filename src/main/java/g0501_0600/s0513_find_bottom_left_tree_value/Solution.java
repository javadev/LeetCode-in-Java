package g0501_0600.s0513_find_bottom_left_tree_value;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    private int[] func(TreeNode root, int level) {
        if (root.left == null && root.right == null) {
            int[] a = new int[2];
            a[0] = root.val;
            a[1] = level;
            return a;
        }
        int[] a = null;
        int[] b = null;
        if (root.left != null) {
            a = func(root.left, level + 1);
        }
        if (root.right != null) {
            b = func(root.right, level + 1);
        }
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else {
            if (a[1] >= b[1]) {
                return a;
            } else {
                return b;
            }
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        int[] a = func(root, 0);
        return a[0];
    }
}
