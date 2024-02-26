package g0801_0900.s0897_increasing_order_search_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Stack #Binary_Search_Tree
// #2022_03_28_Time_0_ms_(100.00%)_Space_39.9_MB_(83.16%)

import com_github_leetcode.TreeNode;
import java.util.LinkedList;
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
    public TreeNode increasingBST(final TreeNode root) {
        final List<TreeNode> list = new LinkedList<>();
        traverse(root, list);
        for (int i = 1; i < list.size(); i++) {
            list.get(i - 1).right = list.get(i);
            list.get(i).left = null;
        }
        return list.get(0);
    }

    private void traverse(final TreeNode root, final List<TreeNode> list) {
        if (root != null) {
            traverse(root.left, list);
            list.add(root);
            traverse(root.right, list);
        }
    }
}
