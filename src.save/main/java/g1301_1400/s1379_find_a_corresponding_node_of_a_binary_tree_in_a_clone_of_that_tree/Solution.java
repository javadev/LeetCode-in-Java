package g1301_1400.s1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_22_Time_2_ms_(77.89%)_Space_101.9_MB_(51.12%)

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
    public final TreeNode getTargetCopy(
            final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (original.val == target.val) {
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null && left.val == target.val) {
            return left;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}
