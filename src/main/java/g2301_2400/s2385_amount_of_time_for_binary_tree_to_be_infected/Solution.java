package g2301_2400.s2385_amount_of_time_for_binary_tree_to_be_infected;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_08_25_Time_20_ms_(100.00%)_Space_111.7_MB_(100.00%)

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
    private int max = 0;

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start, new Distance(-1));
        return max;
    }

    private int dfs(TreeNode root, int start, Distance l) {
        if (root == null) {
            return 0;
        }
        Distance ld = new Distance(-1);
        Distance rd = new Distance(-1);
        int left = dfs(root.left, start, ld);
        int right = dfs(root.right, start, rd);
        if (l.val == -1 && start == root.val) {
            max = Math.max(left, right);
            l.val = 1;
        }
        if (ld.val != -1) {
            max = Math.max(max, ld.val + right);
            l.val = ld.val + 1;
        } else if (rd.val != -1) {
            max = Math.max(max, rd.val + left);
            l.val = rd.val + 1;
        }
        return Math.max(left, right) + 1;
    }

    private static class Distance {
        int val;

        Distance(int v) {
            this.val = v;
        }
    }
}
