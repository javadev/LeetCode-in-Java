package g2401_2500.s2415_reverse_odd_levels_of_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_11_15_Time_12_ms_(64.14%)_Space_49.7_MB_(87.20%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    private List<Integer> list = new ArrayList<>();

    public TreeNode reverseOddLevels(TreeNode root) {
        solve(root);
        return enrich(list, 0);
    }

    private TreeNode enrich(List<Integer> list, int i) {
        TreeNode root = null;
        if (i < list.size()) {
            root = new TreeNode(list.get(i));
            root.left = enrich(list, 2 * i + 1);
            root.right = enrich(list, 2 * i + 2);
        }
        return root;
    }

    private void solve(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.remove();
                res.add(cur.val);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
            if (level % 2 != 0) {
                for (int i = res.size() - 1; i >= 0; i--) {
                    list.add(res.get(i));
                }
            } else {
                list.addAll(res);
            }
            level++;
        }
    }
}
