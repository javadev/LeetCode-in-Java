package g2301_2400.s2331_evaluate_boolean_binary_tree;

// #Easy #2022_07_10_Time_0_ms_(100.00%)_Space_46.1_MB_(85.71%)

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        return root.left == null
                ? root.val == 1
                : (root.val == 2
                        ? evaluateTree(root.left) || evaluateTree(root.right)
                        : evaluateTree(root.left) && evaluateTree(root.right));
    }
}
