package g0801_0900.s0889_construct_binary_tree_from_preorder_and_postorder_traversal;

// #Easy #Array #Hash_Table #Sorting #Binary_Search

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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if (preorder.length == 0 || preorder.length != postorder.length) {
            return null;
        }
        return buildTree(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(
            int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd) {
        if (preStart > preEnd || postStart > postEnd) {
            return null;
        }
        int data = preorder[preStart];
        TreeNode root = new TreeNode(data);
        if (preStart == preEnd) {
            return root;
        }
        int offset = postStart;
        for (; offset <= preEnd; offset++) {
            if (postorder[offset] == preorder[preStart + 1]) {
                break;
            }
        }
        root.left =
                buildTree(
                        preorder,
                        preStart + 1,
                        preStart + offset - postStart + 1,
                        postorder,
                        postStart,
                        offset);
        root.right =
                buildTree(
                        preorder,
                        preStart + offset - postStart + 2,
                        preEnd,
                        postorder,
                        offset + 1,
                        postEnd - 1);
        return root;
    }
}
