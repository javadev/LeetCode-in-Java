package g1001_1100.s1080_insufficient_nodes_in_root_to_leaf_paths;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_02_24_Time_1_ms_(76.12%)_Space_52.4_MB_(11.69%)

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return sufficientSubset(root, limit, 0, root.left == null && root.right == null) < limit
                ? null
                : root;
    }

    public int sufficientSubset(TreeNode root, int limit, int sum, boolean isLeaf) {
        if (root != null) {
            int leftSum =
                    sufficientSubset(
                            root.left,
                            limit,
                            sum + root.val,
                            root.left == null && root.right == null);
            int rightSum =
                    sufficientSubset(
                            root.right,
                            limit,
                            sum + root.val,
                            root.left == null && root.right == null);
            if (leftSum < limit) {
                root.left = null;
            }
            if (rightSum < limit) {
                root.right = null;
            }
            return Math.max(leftSum, rightSum);
        }
        return isLeaf ? sum : Integer.MIN_VALUE;
    }
}
