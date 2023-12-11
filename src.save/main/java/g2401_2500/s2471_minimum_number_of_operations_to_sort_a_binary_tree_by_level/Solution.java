package g2401_2500.s2471_minimum_number_of_operations_to_sort_a_binary_tree_by_level;

// #Medium #Breadth_First_Search #Tree #Binary_Tree
// #2023_01_24_Time_76_ms_(76.46%)_Space_66_MB_(63.11%)

import com_github_leetcode.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int minimumOperations(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        int count = 0;
        if ((root.left != null && root.right != null) && (root.left.val > root.right.val)) {
            count++;
        }
        if (root.left != null) {
            q.add(root.left);
        }
        if (root.right != null) {
            q.add(root.right);
        }
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> al = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = q.poll();
                assert node != null;
                if (node.left != null) {
                    al.add(node.left.val);
                    q.add(node.left);
                }
                if (node.right != null) {
                    al.add(node.right.val);
                    q.add(node.right);
                }
            }
            count += helper(al);
        }
        return count;
    }

    private int helper(List<Integer> list) {
        int swaps = 0;
        int[] sorted = new int[list.size()];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = list.get(i);
        }
        Arrays.sort(sorted);
        Map<Integer, Integer> ind = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            ind.put(list.get(i), i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != sorted[i]) {
                swaps++;
                ind.put(list.get(i), ind.get(sorted[i]));
                list.set(ind.get(sorted[i]), list.get(i));
            }
        }
        return swaps;
    }
}
