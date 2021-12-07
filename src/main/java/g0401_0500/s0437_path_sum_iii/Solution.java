package g0401_0500.s0437_path_sum_iii;

// #Medium #Top_100_Liked_Questions #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.HashMap;
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
    private int count(TreeNode root, int targetSum, Map<Integer, Integer> hashMap, int currentSum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (hashMap.containsKey(currentSum + root.val - targetSum)) {
            count = count + hashMap.get(currentSum + root.val - targetSum);
        }
        hashMap.put(currentSum + root.val, hashMap.getOrDefault(currentSum + root.val, 0) + 1);
        int l1 = count(root.left, targetSum, hashMap, currentSum + root.val);
        int l2 = count(root.right, targetSum, hashMap, currentSum + root.val);
        hashMap.put(currentSum + root.val, hashMap.getOrDefault(currentSum + root.val, 0) - 1);
        return l1 + l2 + count;
    }

    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return count(root, targetSum, map, 0);
    }
}
