package g0201_0300.s0257_binary_tree_paths;

// #Easy #String #Depth_First_Search #Tree #Binary_Tree #Backtracking
// #2022_07_05_Time_2_ms_(93.02%)_Space_43_MB_(71.25%)

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
    private List<String> result;
    private StringBuilder sb;

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        sb = new StringBuilder();
        walkThrough(root);
        return result;
    }

    private void walkThrough(TreeNode root) {
        assert root != null;
        int length = sb.length();
        sb.append(root.val);
        length = sb.length() - length;
        if (root.left == null && root.right == null) {
            // leaf node.
            result.add(sb.toString());
            sb.delete(sb.length() - length, sb.length());
            return;
        }
        sb.append("->");
        length += 2;
        if (root.left != null) {
            walkThrough(root.left);
        }
        if (root.right != null) {
            walkThrough(root.right);
        }
        sb.delete(sb.length() - length, sb.length());
    }
}
