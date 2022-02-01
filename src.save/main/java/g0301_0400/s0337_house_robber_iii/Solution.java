package g0301_0400.s0337_house_robber_iii;

// #Medium #Top_100_Liked_Questions #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

public class Solution {
    public int rob(TreeNode root) {
        int[] out = robRec(root);
        return Math.max(out[0], out[1]);
    }

    private int[] robRec(TreeNode curr) {
        if (curr == null) {
            return new int[] {0, 0};
        }
        int[] left = robRec(curr.left);
        int[] right = robRec(curr.right);
        int[] out = new int[2];
        // 1. If choosing to take the house
        out[0] = curr.val + left[1] + right[1];
        // 2. If choosing to skip the house
        out[1] = left[0] + right[0];
        // 3. Best Solution at house
        out[0] = Math.max(out[0], out[1]);
        return out;
    }
}
