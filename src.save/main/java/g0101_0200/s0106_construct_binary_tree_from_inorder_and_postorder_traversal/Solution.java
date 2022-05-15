package g0101_0200.s0106_construct_binary_tree_from_inorder_and_postorder_traversal;

// #Medium #Array #Hash_Table #Tree #Binary_Tree #Divide_and_Conquer #Acceptance_55.5%
// #2022_02_21_Time_1_ms_(99.20%)_Space_44.6_MB_(19.25%)

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int[] inIndex = new int[] {inorder.length - 1};
        int[] postIndex = new int[] {postorder.length - 1};
        return helper(inorder, postorder, inIndex, postIndex, Integer.MAX_VALUE);
    }

    private TreeNode helper(int[] in, int[] post, int[] index, int[] pIndex, int target) {
        if (index[0] < 0 || in[index[0]] == target) {
            return null;
        }
        TreeNode root = new TreeNode(post[pIndex[0]--]);
        root.right = helper(in, post, index, pIndex, root.val);
        index[0]--;
        root.left = helper(in, post, index, pIndex, target);
        return root;
    }
}
