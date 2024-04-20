package g1001_1100.s1028_recover_a_tree_from_preorder_traversal;

// #Hard #String #Depth_First_Search #Tree #Binary_Tree
// #2022_02_26_Time_5_ms_(77.57%)_Space_46.5_MB_(30.81%)

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
    private int ptr = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return find(traversal, 0);
    }

    private TreeNode find(String traversal, int level) {
        if (ptr == traversal.length()) {
            return null;
        }
        int i = ptr;
        int count = 0;
        while (traversal.charAt(i) == '-') {
            count++;
            i++;
        }
        if (count == level) {
            int start = i;
            while (i < traversal.length() && traversal.charAt(i) != '-') {
                i++;
            }
            int val = Integer.parseInt(traversal.substring(start, i));
            ptr = i;
            TreeNode root = new TreeNode(val);
            root.left = find(traversal, level + 1);
            root.right = find(traversal, level + 1);
            return root;
        } else {
            return null;
        }
    }
}
