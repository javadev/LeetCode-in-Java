package g0101_0200.s0103_binary_tree_zigzag_level_order_traversal;

// #Medium #Top_Interview_Questions #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_15_Tree #Udemy_Tree_Stack_Queue
// #2022_06_22_Time_1_ms_(95.00%)_Space_43.2_MB_(19.22%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean zig = true;
        LinkedList<Integer> level = new LinkedList<>();
        while (!q.isEmpty()) {
            TreeNode node = q.remove();
            while (!q.isEmpty() && node != null) {
                if (zig) {
                    level.add(node.val);
                } else {
                    level.addFirst(node.val);
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                node = q.remove();
            }
            result.add(level);
            zig = !zig;
            level = new LinkedList<>();
            if (!q.isEmpty()) {
                q.add(null);
            }
        }
        return result;
    }
}
