package g0801_0900.s0863_all_nodes_distance_k_in_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_27_Time_12_ms_(80.25%)_Space_43.6_MB_(16.33%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

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
    private void kFar(TreeNode root, int k, TreeNode visited, List<Integer> ls) {
        if (root == null || k < 0 || root == visited) {
            return;
        }
        if (k == 0) {
            ls.add(root.val);
            return;
        }
        kFar(root.left, k - 1, visited, ls);
        kFar(root.right, k - 1, visited, ls);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ls = new ArrayList<>();
        if (k == 0) {
            ls.add(target.val);
            return ls;
        }
        nodeToRoot(root, target, k, ls);
        return ls;
    }

    private int nodeToRoot(TreeNode root, TreeNode target, int k, List<Integer> ls) {
        if (root == null) {
            return -1;
        }
        if (root.val == target.val) {
            kFar(root, k, null, ls);
            return 1;
        }
        int ld = nodeToRoot(root.left, target, k, ls);
        if (ld != -1) {
            kFar(root, k - ld, root.left, ls);
            return ld + 1;
        }
        int rd = nodeToRoot(root.right, target, k, ls);
        if (rd != -1) {
            kFar(root, k - rd, root.right, ls);
            return rd + 1;
        }
        return -1;
    }
}
