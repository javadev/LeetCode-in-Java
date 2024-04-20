package g0801_0900.s0872_leaf_similar_trees;

// #Easy #Depth_First_Search #Tree #Binary_Tree
// #2022_03_28_Time_0_ms_(100.00%)_Space_41.8_MB_(64.12%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        preOrder(root1, list1);
        preOrder(root2, list2);
        // compare the lists
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                list.add(root.val);
            }
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }
}
