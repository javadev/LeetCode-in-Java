package g0901_1000.s0987_vertical_order_traversal_of_a_binary_tree;

// #Hard #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_31_Time_4_ms_(71.48%)_Space_44.1_MB_(6.86%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

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
    private static class Node {
        int row;
        int val;

        Node(int row, int val) {
            this.row = row;
            this.val = val;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, Queue<Node>> map = new TreeMap<>();
        helper(root, map, 0, 0);
        List<List<Integer>> ret = new ArrayList<>();
        for (Map.Entry<Integer, Queue<Node>> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            ret.add(list);
            Queue<Node> q = entry.getValue();
            while (!q.isEmpty()) {
                list.add(q.poll().val);
            }
        }
        return ret;
    }

    private void helper(TreeNode cur, TreeMap<Integer, Queue<Node>> map, int r, int c) {
        if (cur == null) {
            return;
        }
        map.putIfAbsent(
                c, new PriorityQueue<>((a, b) -> a.row != b.row ? a.row - b.row : a.val - b.val));
        map.get(c).add(new Node(r, cur.val));
        helper(cur.left, map, r + 1, c - 1);
        helper(cur.right, map, r + 1, c + 1);
    }
}
