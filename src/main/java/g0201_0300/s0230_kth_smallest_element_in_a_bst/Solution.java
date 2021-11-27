package g0201_0300.s0230_kth_smallest_element_in_a_bst;

import com_github_leetcode.TreeNode;

public class Solution {
    private int k;
    int count = 0;
    private int val;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        count(root);
        return val;
    }

    private void count(TreeNode node) {
        if (node.left == null && node.right == null) {
            count++;
            if (count == k) {
                this.val = node.val;
            }
            return;
        }

        if (node.left != null) count(node.left);
        count++;
        if (count == k) {
            this.val = node.val;
            return;
        }
        if (node.right != null) count(node.right);
    }
}
