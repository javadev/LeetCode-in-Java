package g0901_1000.s0971_flip_binary_tree_to_match_preorder_traversal;

// #Medium #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

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
            return;
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
