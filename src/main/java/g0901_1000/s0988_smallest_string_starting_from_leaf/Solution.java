package g0901_1000.s0988_smallest_string_starting_from_leaf;

// #Medium #String #Depth_First_Search #Tree #Binary_Tree
// #2022_03_31_Time_4_ms_(58.47%)_Space_44.1_MB_(60.60%)

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
    private String res = "";

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return res;
    }

    private void dfs(TreeNode root, StringBuilder currStr) {
        if (root == null) {
            return;
        }
        currStr.insert(0, (char) (root.val + 97));
        if (root.left == null && root.right == null) {
            if (res.equals("")) {
                res = currStr.toString();
            } else {
                res = res.compareTo(currStr.toString()) > 0 ? currStr.toString() : res;
            }
        } else {
            dfs(root.left, currStr);
            dfs(root.right, currStr);
        }
        currStr.deleteCharAt(0);
    }
}
