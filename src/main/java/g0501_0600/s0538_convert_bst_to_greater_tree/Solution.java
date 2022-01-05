package g0501_0600.s0538_convert_bst_to_greater_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree

import com_github_leetcode.TreeNode;

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
