package g0601_0700.s0653_two_sum_iv_input_is_a_bst;

// #Easy #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Two_Pointers
// #Binary_Search_Tree #Data_Structure_I_Day_14_Tree
// #2022_03_21_Time_5_ms_(74.23%)_Space_52_MB_(27.36%)

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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        List<Integer> res = new ArrayList<>();
        inOrder(res, root);
        int i = 0;
        int j = res.size() - 1;
        while (i < j) {
            int val1 = res.get(i);
            int val2 = res.get(j);
            if (val1 + val2 == k) {
                return true;
            } else if (val1 + val2 < k) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    private void inOrder(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(res, root.left);
        res.add(root.val);
        inOrder(res, root.right);
    }
}
