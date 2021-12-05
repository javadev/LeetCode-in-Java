package g0201_0300.s0226_invert_binary_tree_easy_top_100_liked_questions_depth_first_search_breadth_first_search_tree_binary_tree;

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
