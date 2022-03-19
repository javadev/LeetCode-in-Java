package g1301_1400.s1325_delete_leaves_with_a_given_value;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_19_Time_2_ms_(33.61%)_Space_45_MB_(25.67%)

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        while (hasTargetLeafNodes(root, target)) {
            root = removeLeafNodes(target, root);
        }
        return root;
    }

    private TreeNode removeLeafNodes(int target, TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.val == target && root.left == null && root.right == null) {
            root = null;
            return root;
        }
        if (root.left != null
                && root.left.val == target
                && root.left.left == null
                && root.left.right == null) {
            root.left = null;
        }
        if (root.right != null
                && root.right.val == target
                && root.right.left == null
                && root.right.right == null) {
            root.right = null;
        }
        removeLeafNodes(target, root.left);
        removeLeafNodes(target, root.right);
        return root;
    }

    private boolean hasTargetLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == target) {
            return true;
        }
        return hasTargetLeafNodes(root.left, target) || hasTargetLeafNodes(root.right, target);
    }
}
