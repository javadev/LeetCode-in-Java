package g1101_1200.s1123_lowest_common_ancestor_of_deepest_leaves;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_09_Time_1_ms_(76.02%)_Space_44.2_MB_(44.41%)

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }
        int leftDep = getDep(root.left);
        int rightDep = getDep(root.right);
        if (leftDep == rightDep) {
            return root;
        } else {
            if (leftDep > rightDep) {
                return lcaDeepestLeaves(root.left);
            } else {
                return lcaDeepestLeaves(root.right);
            }
        }
    }

    public int getDep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getDep(root.left), getDep(root.right));
    }
}
