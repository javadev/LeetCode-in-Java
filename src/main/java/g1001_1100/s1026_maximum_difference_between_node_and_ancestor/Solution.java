package g1001_1100.s1026_maximum_difference_between_node_and_ancestor;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_02_26_Time_1_ms_(65.84%)_Space_42.6_MB_(6.52%)

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

    public int maxAncestorDiff(TreeNode root) {
        traverse(root, -1, -1);
        return max;
    }

    private void traverse(TreeNode root, int maxAncestor, int minAncestor) {
        if (root == null) {
            return;
        }
        if (maxAncestor == -1) {
            traverse(root.left, root.val, root.val);
            traverse(root.right, root.val, root.val);
        }
        if (maxAncestor != -1) {
            max = Math.max(max, Math.abs(maxAncestor - root.val));
            max = Math.max(max, Math.abs(minAncestor - root.val));

            traverse(root.left, Math.max(root.val, maxAncestor), Math.min(root.val, minAncestor));
            traverse(root.right, Math.max(root.val, maxAncestor), Math.min(root.val, minAncestor));
        }
    }
}
