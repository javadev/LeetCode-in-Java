package g0101_0200.s0104_maximum_depth_of_binary_tree;

import com_github_leetcode.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    private int findDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return 0;
        }
        currentDepth++;
        return 1
                + Math.max(findDepth(node.left, currentDepth), findDepth(node.right, currentDepth));
    }
}
