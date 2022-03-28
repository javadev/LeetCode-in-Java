package g0801_0900.s0894_all_possible_full_binary_trees;

// #Medium #Dynamic_Programming #Tree #Binary_Tree #Recursion #Memoization
// #2022_03_28_Time_3_ms_(68.56%)_Space_55.3_MB_(75.50%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

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
@SuppressWarnings("unchecked")
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            // no complete binary tree possible
            return new ArrayList<>();
        }
        List<TreeNode>[] dp = new ArrayList[n + 1];
        // form left to right
        for (int i = 1; i <= n; i += 2) {
            helper(i, dp);
        }
        return dp[n];
    }

    // Using tabulation
    public void helper(int n, List<TreeNode>[] dp) {
        if (n <= 0) {
            return;
        }
        if (n == 1) {
            dp[1] = new ArrayList<>();
            dp[1].add(new TreeNode(0));
            return;
        }
        dp[n] = new ArrayList<>();
        for (int i = 1; i < n; i += 2) {
            // left
            for (TreeNode nodeL : dp[i]) {
                // right
                for (TreeNode nodeR : dp[n - i - 1]) {
                    // 1 node used here
                    TreeNode root = new TreeNode(0);
                    root.left = nodeL;
                    root.right = nodeR;
                    dp[n].add(root);
                }
            }
        }
    }
}
