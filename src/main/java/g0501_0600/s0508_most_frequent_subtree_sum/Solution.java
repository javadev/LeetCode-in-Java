package g0501_0600.s0508_most_frequent_subtree_sum;

// #Medium #Hash_Table #Depth_First_Search #Tree #Binary_Tree

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {

        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        fun(root, hm);
        int maxvalue = Integer.MIN_VALUE;
        for (Map.Entry map : hm.entrySet()) {
            if ((int) map.getValue() > maxvalue) maxvalue = (int) map.getValue();
        }
        for (Map.Entry map : hm.entrySet()) {
            if ((int) map.getValue() == maxvalue) arr.add((int) map.getKey());
        }
        int[] newArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newArr[i] = arr.get(i);
        }
        return newArr;
    }

    private int fun(TreeNode node, HashMap<Integer, Integer> hm) {
        if (node == null) return 0;
        int left = fun(node.left, hm);
        int right = fun(node.right, hm);
        int sum = node.val + left + right;
        if (hm.containsKey(sum)) hm.put(sum, hm.get(sum) + 1);
        else hm.put(sum, 0);
        return sum;
    }
}
