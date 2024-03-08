package g2501_2600.s2583_kth_largest_sum_in_a_binary_tree;

// #Medium #Breadth_First_Search #Tree #Binary_Search
// #2023_08_22_Time_13_ms_(99.83%)_Space_60.3_MB_(92.18%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

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
@SuppressWarnings("java:S2245")
public class Solution {
    private final Random random = new Random();

    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            long sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.remove();
                sum += curr.val;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            ans.add(sum);
        }
        if (k > ans.size()) {
            return -1;
        }
        k = ans.size() - k;
        int start = 0;
        int idx;
        int end = ans.size() - 1;
        while (true) {
            idx = random.nextInt(end - start + 1) + start;
            Long piv = ans.get(idx);
            Collections.swap(ans, idx, end);
            idx = start;
            for (int i = start; i <= end; i++) {
                if (ans.get(i) <= piv) {
                    Collections.swap(ans, i, idx++);
                }
            }
            idx--;
            if (idx < k) {
                start = idx + 1;
            } else if (idx > k) {
                end = idx - 1;
            } else {
                break;
            }
        }
        return ans.get(idx);
    }
}
