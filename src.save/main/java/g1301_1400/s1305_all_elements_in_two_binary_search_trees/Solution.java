package g1301_1400.s1305_all_elements_in_two_binary_search_trees;

// #Medium #Sorting #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_03_14_Time_25_ms_(63.82%)_Space_73.1_MB_(66.80%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = getAllNodes(root1);
        List<Integer> list2 = getAllNodes(root2);
        List<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        return merged;
    }

    private List<Integer> getAllNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorder(root, list);
    }

    private List<Integer> inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return result;
        }
        inorder(root.left, result);
        result.add(root.val);
        return inorder(root.right, result);
    }
}
