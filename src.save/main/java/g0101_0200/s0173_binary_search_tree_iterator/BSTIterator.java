package g0101_0200.s0173_binary_search_tree_iterator;

// #Medium #Tree #Binary_Tree #Stack #Design #Binary_Search_Tree #Iterator
// #Data_Structure_II_Day_17_Tree #2022_03_04_Time_18_ms_(78.45%)_Space_51.6_MB_(38.06%)

import com_github_leetcode.TreeNode;

public class BSTIterator {
    private TreeNode node;

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
