package g3701_3800.s3767_maximize_points_after_choosing_k_tasks;

// #Medium #Array #Sorting #Greedy #Heap_Priority_Queue #Staff #Biweekly_Contest_171
// #2026_05_08_Time_96_ms_(61.94%)_Space_136.84_MB_(77.61%)

import java.util.Arrays;

public class Solution {
    public long maxPoints(int[] technique1, int[] technique2, int k) {
        int n = technique1.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Sort by (technique1[i] - technique2[i]) descending
        Arrays.sort(
                idx, (a, b) -> (technique1[b] - technique2[b]) - (technique1[a] - technique2[a]));

        long ans = 0;
        for (int i = 0; i < k; i++) {
            ans += technique1[idx[i]];
        }

        // Remaining choose best from both
        for (int i = k; i < n; i++) {
            ans += Math.max(technique1[idx[i]], technique2[idx[i]]);
        }

        return ans;
    }
}
