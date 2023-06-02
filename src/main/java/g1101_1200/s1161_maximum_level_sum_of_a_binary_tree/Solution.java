package g1101_1200.s1161_maximum_level_sum_of_a_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_06_02_Time_7_ms_(97.19%)_Space_46.3_MB_(31.31%)

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
    private List<Integer> sums;

    public int maxLevelSum(TreeNode root) {
        sums = new ArrayList<>();
        find(root, 1);
        int ans = 1;
        int maxv = Integer.MIN_VALUE;
        for (int i = 0; i < sums.size(); i++) {
            if (sums.get(i) > maxv) {
                maxv = sums.get(i);
                ans = i + 1;
            }
        }
        return ans;
    }

    private void find(TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (sums.size() < height) {
            sums.add(root.val);
        } else {
            sums.set(height - 1, sums.get(height - 1) + root.val);
        }
        find(root.left, height + 1);
        find(root.right, height + 1);
    }
}
