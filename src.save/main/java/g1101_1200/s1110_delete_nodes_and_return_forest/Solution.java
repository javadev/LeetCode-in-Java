package g1101_1200.s1110_delete_nodes_and_return_forest;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_07_10_Time_2_ms_(87.37%)_Space_43.3_MB_(83.55%)

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
    private Set<Integer> toDelete;
    private Queue<TreeNode> nodes = new LinkedList<>();

    public TreeNode deleteAndSplit(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (toDelete.contains(root.val)) {
            if (root.left != null) {
                nodes.add(root.left);
            }
            if (root.right != null) {
                nodes.add(root.right);
            }
            return null;
        }
        root.left = deleteAndSplit(root.left);
        root.right = deleteAndSplit(root.right);
        return root;
    }

    private List<TreeNode> delNodes(TreeNode root, int[] localToDelete) {
        toDelete = new HashSet<>();
        for (int node : localToDelete) {
            toDelete.add(node);
        }
        nodes.add(root);
        List<TreeNode> forests = new ArrayList<>();
        while (nodes.size() > 0) {
            TreeNode node = nodes.poll();
            node = deleteAndSplit(node);
            if (node != null) {
                forests.add(node);
            }
        }
        return forests;
    }
}
