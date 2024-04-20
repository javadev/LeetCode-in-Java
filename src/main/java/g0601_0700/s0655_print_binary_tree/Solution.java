package g0601_0700.s0655_print_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_21_Time_1_ms_(98.04%)_Space_42.4_MB_(79.96%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
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
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new LinkedList<>();
        int height = root == null ? 1 : getHeight(root);
        int columns = (int) (Math.pow(2, height) - 1);
        List<String> row = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
            row.add("");
        }
        for (int i = 0; i < height; i++) {
            result.add(new ArrayList<>(row));
        }
        populateResult(root, result, 0, height, 0, columns - 1);
        return result;
    }

    private void populateResult(
            TreeNode root, List<List<String>> result, int row, int totalRows, int i, int j) {
        if (row == totalRows || root == null) {
            return;
        }
        result.get(row).set((i + j) / 2, Integer.toString(root.val));
        populateResult(root.left, result, row + 1, totalRows, i, (i + j) / 2 - 1);
        populateResult(root.right, result, row + 1, totalRows, (i + j) / 2 + 1, j);
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
