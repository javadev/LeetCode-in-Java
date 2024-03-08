package g0501_0600.s0538_convert_bst_to_greater_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_08_02_Time_1_ms_(88.41%)_Space_50_MB_(23.08%)

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
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            postOrder(root, 0);
        }
        return root;
    }

    private int postOrder(TreeNode node, int val) {
        int newVal = 0;
        if (node.right != null) {
            newVal += postOrder(node.right, val);
        }
        newVal += newVal == 0 ? val + node.val : node.val;
        node.val = newVal;
        if (node.left != null) {
            newVal = postOrder(node.left, newVal);
        }
        return newVal;
    }
}
