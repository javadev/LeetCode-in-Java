package g2601_2700.s2641_cousins_in_binary_tree_ii;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_09_05_Time_24_ms_(72.10%)_Space_90.1_MB_(20.69%)

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
    private List<Integer> horizontalSum;

    private void traverse(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth < horizontalSum.size()) {
            horizontalSum.set(depth, horizontalSum.get(depth) + root.val);
        } else {
            horizontalSum.add(root.val);
        }
        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
    }

    private void traverse1(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > 0) {
            int sum = 0;
            if (root.left != null) {
                sum += root.left.val;
            }
            if (root.right != null) {
                sum += root.right.val;
            }
            if (root.left != null) {
                root.left.val = horizontalSum.get(depth + 1) - sum;
            }
            if (root.right != null) {
                root.right.val = horizontalSum.get(depth + 1) - sum;
            }
        }
        traverse1(root.left, depth + 1);
        traverse1(root.right, depth + 1);
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        horizontalSum = new ArrayList<>();
        root.val = 0;
        if (root.left != null) {
            root.left.val = 0;
        }
        if (root.right != null) {
            root.right.val = 0;
        }
        traverse(root, 0);
        traverse1(root, 0);
        return root;
    }
}
