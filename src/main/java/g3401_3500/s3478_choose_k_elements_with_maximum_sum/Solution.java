package g3401_3500.s3478_choose_k_elements_with_maximum_sum;

// #Medium #Array #Sorting #Heap_Priority_Queue
// #2025_03_10_Time_105_ms_(98.60%)_Space_69.10_MB_(28.75%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        long[] ans = new long[n];
        Point[] ps = new Point[n];
        for (int i = 0; i < n; i++) {
            ps[i] = new Point(nums1[i], nums2[i], i);
        }
        Arrays.sort(ps, (p1, p2) -> Integer.compare(p1.x, p2.x));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long s = 0;
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && ps[j].x == ps[i].x) {
                ans[ps[j].i] = s;
                j++;
            }
            for (int p = i; p < j; p++) {
                int cur = ps[p].y;
                if (pq.size() < k) {
                    pq.offer(cur);
                    s += cur;
                } else if (cur > pq.peek()) {
                    s -= pq.poll();
                    pq.offer(cur);
                    s += cur;
                }
            }
            i = j;
        }
        return ans;
    }

    private static class Point {
        int x;
        int y;
        int i;

        Point(int x, int y, int i) {
            this.x = x;
            this.y = y;
            this.i = i;
        }
    }
}
