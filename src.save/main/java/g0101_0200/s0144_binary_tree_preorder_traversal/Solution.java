package g0101_0200.s0144_binary_tree_preorder_traversal;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Stack #Data_Structure_I_Day_10_Tree
// #Udemy_Tree_Stack_Queue #2022_06_24_Time_1_ms_(48.38%)_Space_42_MB_(68.46%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
@SuppressWarnings("java:S1149")
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                result.add(current.val);
                stack.push(current.right);
                current = current.left;
            }
            current = stack.pop();
        }
        return result;
    }
}
