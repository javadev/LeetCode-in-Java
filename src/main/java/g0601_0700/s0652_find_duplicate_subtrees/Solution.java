package g0601_0700.s0652_find_duplicate_subtrees;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> list = new LinkedList<>();
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
