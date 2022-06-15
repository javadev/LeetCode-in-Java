package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree;

// #2022_06_15_Time_1_ms_(99.12%)_Space_44.5_MB_(28.29%)

import com_github_leetcode.TreeNode;

public class Solution {
    public int averageOfSubtree(TreeNode root) {
        count = 0;
        dfs(root);
        return count;
    }

    private int count;

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[2];
        }

        int[] l = dfs(node.left);
        int[] r = dfs(node.right);

        int[] res = new int[2];
        res[0] = l[0] + r[0] + 1;
        res[1] = l[1] + r[1] + node.val;

        if (res[1] / res[0] == node.val) {
            count++;
        }

        return res;
    }
}
