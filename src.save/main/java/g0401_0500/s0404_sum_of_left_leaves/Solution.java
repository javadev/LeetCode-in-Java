package g0401_0500.s0404_sum_of_left_leaves;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Programming_Skills_I_Day_10_Linked_List_and_Tree
// #2022_07_15_Time_1_ms_(29.26%)_Space_42.7_MB_(7.22%)

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
    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        traverse(root, arr);
        return getSum(arr);
    }

    private void traverse(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            arr.add(root.left.val);
        }
        traverse(root.left, arr);
        traverse(root.right, arr);
    }

    private int getSum(List<Integer> arr) {
        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum;
    }
}
