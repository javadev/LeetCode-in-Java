package g0601_0700.s0637_average_of_levels_in_binary_tree;

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, Double[]> map = new HashMap<>();
        helper(root, map, 0);
        List<Double> result = new ArrayList<>();
        for (Double[] pair : map.values()) {
            double avg = pair[1] / pair[0];
            result.add(avg);
        }
        return result;
    }

    private void helper(TreeNode root, Map<Integer, Double[]> map, int level) {
        if (root == null) {
            return;
        }
        Double[] pair = map.containsKey(level) ? map.get(level) : new Double[] {0.0, 0.0};
        pair[0] += 1;
        pair[1] += root.val;
        map.put(level, pair);
        helper(root.left, map, level + 1);
        helper(root.right, map, level + 1);
    }
}
