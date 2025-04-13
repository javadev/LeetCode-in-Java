package g0401_0500.s0437_path_sum_iii;

// #Medium #Depth_First_Search #Tree #Binary_Tree #LeetCode_75_Binary_Tree/DFS #Level_2_Day_7_Tree
// #Big_O_Time_O(n)_Space_O(n) #2024_11_17_Time_2_ms_(100.00%)_Space_44.7_MB_(11.66%)

import com_github_leetcode.TreeNode;
import java.util.HashMap;

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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> h = new HashMap<>();
        return dfs(root, targetSum, h, 0L);
    }

    int dfs(TreeNode root, int t, HashMap<Long, Integer> h, Long cs) {
        int s = 0;
        if (root == null) {
            return 0;
        }
        Long k = cs + root.val;
        if (k == t) {
            s += 1;
        }
        if (h.getOrDefault(k - t, 0) > 0) {
            s += h.get(k - t);
        }
        h.put(k, h.getOrDefault(k, 0) + 1);
        s += dfs(root.left, t, h, k);
        s += dfs(root.right, t, h, k);
        h.put(k, h.getOrDefault(k, 0) - 1);
        return s;
    }
}
