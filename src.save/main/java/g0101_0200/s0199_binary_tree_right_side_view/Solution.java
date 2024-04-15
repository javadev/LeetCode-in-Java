package g0101_0200.s0199_binary_tree_right_side_view;

// #Medium #Top_100_Liked_Questions #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_16_Tree #Level_2_Day_15_Tree
// #2022_06_28_Time_1_ms_(94.57%)_Space_42.9_MB_(41.09%)

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recurse(root, 0, list);
        return list;
    }

    private void recurse(TreeNode node, int level, List<Integer> list) {
        if (node != null) {
            if (list.size() < level + 1) {
                list.add(node.val);
            }
            recurse(node.right, level + 1, list);
            recurse(node.left, level + 1, list);
        }
    }
}
