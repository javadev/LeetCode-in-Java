package g0901_1000.s0971_flip_binary_tree_to_match_preorder_traversal;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_03_31_Time_0_ms_(100.00%)_Space_43.3_MB_(30.85%)

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
    private List<Integer> list = new ArrayList<>();
    private int preIndex = 0;
    private boolean isFlipPossible = true;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        list.clear();
        preIndex = 0;
        isFlipPossible = true;
        traverse(root, voyage);
        if (!isFlipPossible) {
            list.clear();
            list.add(-1);
        }
        return list;
    }

    private void traverse(TreeNode root, int[] voyage) {
        if (root == null) {
            return;
        }
        if (root.val != voyage[preIndex]) {
            isFlipPossible = false;
        } else {
            if (preIndex + 1 < voyage.length
                    && root.left != null
                    && root.left.val != voyage[preIndex + 1]) {
                // swap
                list.add(root.val);
                TreeNode temp = root.right;
                root.right = root.left;
                root.left = temp;
            }
            preIndex++;
            traverse(root.left, voyage);
            traverse(root.right, voyage);
        }
    }
}
