package g0101_0200.s0114_flatten_binary_tree_to_linked_list;

// #Medium #Top_100_Liked_Questions #Depth_First_Search #Tree #Binary_Tree #Stack #Linked_List
// #2022_02_22_Time_1_ms_(69.36%)_Space_42.6_MB_(22.05%)

import com_github_leetcode.TreeNode;

public class Solution {
    public void flatten(TreeNode root) {
        if (root != null) {
            findTail(root);
        }
    }

    private TreeNode findTail(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode tail;
        // find the tail of left subtree, tail means the most left leaf
        if (left != null) {
            tail = findTail(left);
            // stitch the right subtree below the tail
            root.left = null;
            root.right = left;
            tail.right = right;
        } else {
            tail = root;
        }
        // find tail of the right subtree
        if (tail.right == null) {
            return tail;
        } else {
            return findTail(tail.right);
        }
    }
}
