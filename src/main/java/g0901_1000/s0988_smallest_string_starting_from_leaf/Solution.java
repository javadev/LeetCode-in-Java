package g0901_1000.s0988_smallest_string_starting_from_leaf;

// #Medium #String #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;

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
