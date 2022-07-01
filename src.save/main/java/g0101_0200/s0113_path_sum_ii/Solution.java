package g0101_0200.s0113_path_sum_ii;

// #Medium #Depth_First_Search #Tree #Binary_Tree #Backtracking #Data_Structure_II_Day_16_Tree
// #2022_06_23_Time_1_ms_(100.00%)_Space_44.7_MB_(53.10%)

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        recur(res, new ArrayList<>(), 0, targetSum, root);
        return res;
    }

    private void recur(
            List<List<Integer>> res, ArrayList<Integer> al, int sum, int targetSum, TreeNode root) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            res.add(new ArrayList<>(al));
        }
        recur(res, al, sum, targetSum, root.left);
        recur(res, al, sum, targetSum, root.right);
        al.remove(al.size() - 1);
    }
}
