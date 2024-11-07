package g3301_3400.s3319_k_th_largest_perfect_subtree_size_in_binary_tree;

// #Medium #Sorting #Depth_First_Search #Tree #Binary_Tree
// #2024_10_15_Time_10_ms_(87.48%)_Space_45.3_MB_(50.46%)

import com_github_leetcode.TreeNode;
import java.util.PriorityQueue;
import java.util.Queue;

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
    private final Queue<Integer> pq = new PriorityQueue<>();

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        dfs(root, k);
        return pq.isEmpty() || pq.size() < k ? -1 : pq.peek();
    }

    private int dfs(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left, k);
        int right = dfs(root.right, k);
        if (left == right) {
            pq.offer(1 + left + right);
        }
        if (pq.size() > k) {
            pq.poll();
        }
        return left == right ? 1 + left + right : -1;
    }
}
