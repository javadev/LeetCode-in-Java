package g0501_0600.s0508_most_frequent_subtree_sum;

// #Medium #Hash_Table #Depth_First_Search #Tree #Binary_Tree
// #2022_07_24_Time_4_ms_(96.83%)_Space_42.6_MB_(90.40%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
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
    public int[] findFrequentTreeSum(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        fun(root, hm);
        int maxvalue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            if (map.getValue() > maxvalue) {
                maxvalue = map.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            if (map.getValue() == maxvalue) {
                arr.add(map.getKey());
            }
        }
        int[] newArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newArr[i] = arr.get(i);
        }
        return newArr;
    }

    private int fun(TreeNode node, HashMap<Integer, Integer> hm) {
        if (node == null) {
            return 0;
        }
        int left = fun(node.left, hm);
        int right = fun(node.right, hm);
        int sum = node.val + left + right;
        if (hm.containsKey(sum)) {
            hm.put(sum, hm.get(sum) + 1);
        } else {
            hm.put(sum, 0);
        }
        return sum;
    }
}
