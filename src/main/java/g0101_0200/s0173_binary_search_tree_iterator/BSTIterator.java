package g0101_0200.s0173_binary_search_tree_iterator;

// #Medium #Tree #Binary_Tree #Stack #Design #Binary_Search_Tree #Iterator
// #Data_Structure_II_Day_17_Tree #Programming_Skills_II_Day_16 #Level_2_Day_9_Binary_Search_Tree
// #Top_Interview_150_Binary_Tree_General #2025_03_09_Time_15_ms_(100.00%)_Space_48.60_MB_(18.83%)

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
public class BSTIterator {
    private TreeNode node;

    public BSTIterator(TreeNode root) {
        node = root;
    }

    public int next() {
        int res = -1;
        while (node != null) {
            if (node.left != null) {
                TreeNode rightMost = node.left;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }
                rightMost.right = node;
                TreeNode temp = node.left;
                node.left = null;
                node = temp;
            } else {
                res = node.val;
                node = node.right;
                return res;
            }
        }
        return res;
    }

    public boolean hasNext() {
        return node != null;
    }
}

/*
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
