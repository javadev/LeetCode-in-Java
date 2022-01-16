package g0601_0700.s0654_maximum_binary_tree;

// #Medium #Array #Tree #Binary_Tree #Stack #Monotonic_Stack #Divide_and_Conquer

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return mbt(nums, 0, nums.length - 1);
    }

    private TreeNode mbt(int[] nums, int l, int r) {
        if (l > r || l >= nums.length || r < 0) {
            return null;
        }
        if (l == r) {
            return new TreeNode(nums[r]);
        }
        int max = Integer.MIN_VALUE;
        int maxidx = 0;
        for (int i = l; i <= r; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxidx = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = (mbt(nums, l, maxidx - 1));
        root.right = (mbt(nums, maxidx + 1, r));
        return root;
    }
}
