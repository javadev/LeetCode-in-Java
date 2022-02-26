package g1001_1100.s1022_sum_of_root_to_leaf_binary_numbers;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #2022_02_26_Time_3_ms_(28.58%)_Space_43.6_MB_(5.47%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        dfs(root, paths, new ArrayList<>());
        int sum = 0;
        for (List<Integer> list : paths) {
            int num = 0;
            for (int i : list) {
                num = (num << 1) + i;
            }
            sum += num;
        }
        return sum;
    }

    private void dfs(TreeNode root, List<List<Integer>> paths, List<Integer> path) {
        path.add(root.val);
        if (root.left != null) {
            dfs(root.left, paths, path);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            dfs(root.right, paths, path);
            path.remove(path.size() - 1);
        }
        if (root.left == null && root.right == null) {
            paths.add(new ArrayList<>(path));
        }
    }
}
