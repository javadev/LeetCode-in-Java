package g0101_0200.s0145_binary_tree_postorder_traversal;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Stack #Data_Structure_I_Day_10_Tree
// #Udemy_Tree_Stack_Queue #2022_06_24_Time_1_ms_(49.11%)_Space_42_MB_(62.15%)

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
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = postorderTraversal(root.left);
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
}
