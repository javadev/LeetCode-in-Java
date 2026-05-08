package g3701_3800.s3767_maximize_points_after_choosing_k_tasks;

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Staff #Biweekly_Contest_171
// #2026_05_08_Time_21_ms_(100.00%)_Space_130.40_MB_(85.82%)

import java.util.PriorityQueue;

public class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n = technique1.length;
        int use2 = n - k;
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            int diff = technique2[i] - technique1[i];
            if (diff > 0) {
                if (min.size() < use2) {
                    min.offer(diff);
                    ans += diff;
                } else if (!min.isEmpty() && min.peek() < diff) {
                    ans -= min.poll();
                    min.offer(diff);
                    ans += diff;
                }
            }
            ans += technique1[i];
        }
        return ans;
    }
}
