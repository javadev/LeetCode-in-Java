package g0901_1000.s0938_range_sum_of_bst;

// #Easy #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_02_17_Time_3_ms_(19.20%)_Space_49.8_MB_(72.04%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        dfs(root, low, high, list);
        return list.stream().mapToInt(num -> num).sum();
    }

    private void dfs(TreeNode root, int l, int r, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.val <= r && root.val >= l) {
            list.add(root.val);
        }
        dfs(root.left, l, r, list);
        dfs(root.right, l, r, list);
    }
}
