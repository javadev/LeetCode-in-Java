package g2301_2400.s2331_evaluate_boolean_binary_tree;

// #Easy #Depth_First_Search #Tree #Binary_Search
// #2022_07_10_Time_0_ms_(100.00%)_Space_46.1_MB_(85.71%)

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {
            return root.val == 1;
        } else {
            if (root.val == 2) {
                return evaluateTree(root.left) || evaluateTree(root.right);
            } else {
                return evaluateTree(root.left) && evaluateTree(root.right);
            }
        }
    }
}
