package g0101_0200.s0199_binary_tree_right_side_view_medium_top_100_liked_questions_depth_first_search_breadth_first_search_tree_binary_tree;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recurse(root, 0, list);
        return list;
    }

    private void recurse(TreeNode node, int level, List<Integer> list) {
        if (node != null) {
            if (list.size() < level + 1) {
                list.add(node.val);
            }
            recurse(node.right, level + 1, list);
            recurse(node.left, level + 1, list);
        }
    }
}
