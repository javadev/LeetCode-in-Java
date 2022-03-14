package g0201_0300.s0235_lowest_common_ancestor_of_a_binary_search_tree;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree #Data_Structure_I_Day_14_Tree
// #2022_03_14_Time_7_ms_(52.79%)_Space_50_MB_(33.78%)

import com_github_leetcode.TreeNode;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
