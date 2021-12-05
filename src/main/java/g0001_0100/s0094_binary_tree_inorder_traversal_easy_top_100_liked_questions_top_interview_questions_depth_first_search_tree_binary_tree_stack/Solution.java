package g0001_0100.s0094_binary_tree_inorder_traversal_easy_top_100_liked_questions_top_interview_questions_depth_first_search_tree_binary_tree_stack;

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> answer = new ArrayList<>();
        inorderTraversal(root, answer);
        return answer;
    }

    public void inorderTraversal(TreeNode root, List<Integer> answer) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversal(root.left, answer);
        }
        answer.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, answer);
        }
    }
}
