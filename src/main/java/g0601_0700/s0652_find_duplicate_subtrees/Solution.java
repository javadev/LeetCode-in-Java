package g0601_0700.s0652_find_duplicate_subtrees;

// #Medium #Hash_Table #Depth_First_Search #Tree #Binary_Tree
// #2022_03_21_Time_32_ms_(60.16%)_Space_55.4_MB_(34.89%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> list = new ArrayList<>();
        helper(root, map, list);
        return list;
    }

    private String helper(TreeNode root, Map<String, Integer> map, List<TreeNode> list) {
        if (root == null) {
            return "#";
        }
        String key =
                helper(root.left, map, list) + "#" + helper(root.right, map, list) + "#" + root.val;
        map.put(key, map.getOrDefault(key, 0) + 1);
        if (map.get(key) == 2) {
            list.add(root);
        }
        return key;
    }
}
