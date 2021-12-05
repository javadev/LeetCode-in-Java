package g0201_0300.s0235_lowest_common_ancestor_of_a_binary_search_tree_easy_depth_first_search_tree_binary_tree_binary_search_tree;

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
