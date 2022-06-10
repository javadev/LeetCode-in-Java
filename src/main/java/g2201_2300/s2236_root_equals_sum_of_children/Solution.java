package g2201_2300.s2236_root_equals_sum_of_children;

// #Easy #Tree #Binary_Tree #2022_06_10_Time_0_ms_(100.00%)_Space_40.3_MB_(73.85%)

import com_github_leetcode.TreeNode;

public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
