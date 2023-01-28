package g2401_2500.s2476_closest_nodes_queries_in_a_binary_search_tree;

// #Medium #Array #Depth_First_Search #Tree #Binary_Search #Binary_Tree
// #2023_01_24_Time_185_ms_(51.92%)_Space_98.4_MB_(75.00%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

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
    private final TreeSet<Integer> set = new TreeSet<>();

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        set.add(root.val);
        traverse(root.right);
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        traverse(root);
        List<List<Integer>> ans = new ArrayList<>();
        for (int q : queries) {
            List<Integer> list = new ArrayList<>();
            Integer min = set.floor(q);
            if (min != null) {
                list.add(min);
            } else {
                list.add(-1);
            }
            Integer max = set.ceiling(q);
            if (max != null) {
                list.add(max);
            } else {
                list.add(-1);
            }
            ans.add(list);
        }
        return ans;
    }
}
