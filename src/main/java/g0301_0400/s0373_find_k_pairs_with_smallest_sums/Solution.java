package g0301_0400.s0373_find_k_pairs_with_smallest_sums;

// #Medium #Array #Heap_Priority_Queue #Top_Interview_150_Heap
// #2025_03_09_Time_27_ms_(90.23%)_Space_58.22_MB_(77.32%)

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    private static class Node {
        long sum;
        List<Integer> al;
        int index;

        Node(int index, int num1, int num2) {
            this.sum = (long) num1 + (long) num2;
            this.al = new ArrayList<>();
            this.al.add(num1);
            this.al.add(num2);
            this.index = index;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Node> queue = new PriorityQueue<>((a, b) -> a.sum < b.sum ? -1 : 1);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums1.length && i < k; i++) {
            queue.add(new Node(0, nums1[i], nums2[0]));
        }
        for (int i = 1; i <= k && !queue.isEmpty(); i++) {
            Node cur = queue.poll();
            res.add(cur.al);
            int next = cur.index;
            int lastNum1 = cur.al.get(0);
            if (next + 1 < nums2.length) {
                queue.add(new Node(next + 1, lastNum1, nums2[next + 1]));
            }
        }
        return res;
    }
}
