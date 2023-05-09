package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree;

// #Medium #Depth_First_Search #Tree #Binary_Tree
// #2022_06_15_Time_1_ms_(99.12%)_Space_44.7_MB_(23.43%)

import com_github_leetcode.TreeNode;

public class Solution {
    private int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[] {0, 0};
        }
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int currsum = left[0] + right[0] + node.val;
        int currcount = left[1] + right[1] + 1;
        if (currsum / currcount == node.val) {
            ++ans;
        }
        return new int[] {currsum, currcount};
    }
}
