package g0401_0500.s0450_delete_node_in_a_bst;

// #Medium #Tree #Binary_Tree #Binary_Search_Tree #Data_Structure_II_Day_16_Tree
// #2022_07_18_Time_0_ms_(100.00%)_Space_50.2_MB_(16.59%)

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
    /*
     * Steps:
     * 1. Recursively find the node that has the same value as the key, while setting the left/right nodes equal
     * to the returned subtree
     * 2. Once the node is found, have to handle the below 4 cases
     * a. node doesn't have left or right - return null
     * b. node only has left subtree- return the left subtree
     * c. node only has right subtree- return the right subtree
     * d. node has both left and right - find the minimum value in the right subtree, set that value
     * to the currently found node, then recursively delete the minimum value in the right subtree
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private TreeNode getMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
