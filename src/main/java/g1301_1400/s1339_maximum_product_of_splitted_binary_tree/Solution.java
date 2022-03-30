package g1301_1400.s1339_maximum_product_of_splitted_binary_tree;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_03_19_Time_11_ms_(83.43%)_Space_68.5_MB_(64.19%)

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
    private long maxProduct = 0;
    private long total = 0;

    public int sumTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        node.val += sumTree(node.left) + sumTree(node.right);
        return node.val;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        helper(root.right);
        long leftSubtreeVal = root.left != null ? root.left.val : 0L;
        long leftProduct = leftSubtreeVal * (total - leftSubtreeVal);
        long rightSubtreeVal = root.right != null ? root.right.val : 0L;
        long rightProduct = rightSubtreeVal * (total - rightSubtreeVal);
        maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
    }

    public int maxProduct(TreeNode root) {
        if (root == null) {
            return 0;
        }
        total = sumTree(root);
        helper(root);
        return (int) (maxProduct % 1000000007L);
    }
}
