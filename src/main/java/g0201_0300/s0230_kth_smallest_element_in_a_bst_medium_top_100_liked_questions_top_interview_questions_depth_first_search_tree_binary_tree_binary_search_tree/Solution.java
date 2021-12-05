package g0201_0300.s0230_kth_smallest_element_in_a_bst_medium_top_100_liked_questions_top_interview_questions_depth_first_search_tree_binary_tree_binary_search_tree;

import com_github_leetcode.TreeNode;

public class Solution {
    private int k;
    private int count = 0;
    private int val;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        calculate(root);
        return val;
    }

    private void calculate(TreeNode node) {
        if (node.left == null && node.right == null) {
            count++;
            if (count == k) {
                this.val = node.val;
            }
            return;
        }
        if (node.left != null) {
            calculate(node.left);
        }
        count++;
        if (count == k) {
            this.val = node.val;
            return;
        }
        if (node.right != null) {
            calculate(node.right);
        }
    }
}
