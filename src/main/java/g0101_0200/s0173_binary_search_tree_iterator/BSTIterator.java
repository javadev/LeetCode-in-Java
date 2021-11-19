package g0101_0200.s0173_binary_search_tree_iterator;

import com_github_leetcode.TreeNode;

public class BSTIterator {

    TreeNode node;

    public BSTIterator(TreeNode root) {
        node = root;
    }

    public int next() {
        int res = -1;
        while (node != null) {
            if (node.left != null) {
                TreeNode rightMost = node.left;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }
                rightMost.right = node;
                TreeNode temp = node.left;
                node.left = null;
                node = temp;
            } else {
                res = node.val;
                node = node.right;
                return res;
            }
        }

        return res;
    }

    public boolean hasNext() {
        return node != null;
    }
}
