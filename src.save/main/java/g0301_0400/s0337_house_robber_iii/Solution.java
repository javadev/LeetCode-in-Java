package g0301_0400.s0337_house_robber_iii;

// #Medium #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_07_10_Time_1_ms_(91.77%)_Space_44.4_MB_(60.28%)

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
