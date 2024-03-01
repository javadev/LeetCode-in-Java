package g1101_1200.s1145_binary_tree_coloring_game;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2023_06_01_Time_0_ms_(100.00%)_Space_40.8_MB_(31.34%)

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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        if (root == null) {
            return false;
        }

        if (root.val == x) {
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            int parent = n - (leftCount + rightCount + 1);

            return parent > (leftCount + rightCount)
                    || leftCount > (parent + rightCount)
                    || rightCount > (parent + leftCount);
        }
        return btreeGameWinningMove(root.left, n, x) || btreeGameWinningMove(root.right, n, x);
    }

    private int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
