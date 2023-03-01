package g0101_0200.s0173_binary_search_tree_iterator;

// #Medium #Tree #Binary_Tree #Stack #Design #Binary_Search_Tree #Iterator
// #Data_Structure_II_Day_17_Tree #Programming_Skills_II_Day_16 #Level_2_Day_9_Binary_Search_Tree
// #2022_06_26_Time_18_ms_(84.18%)_Space_52.2_MB_(23.01%)

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
