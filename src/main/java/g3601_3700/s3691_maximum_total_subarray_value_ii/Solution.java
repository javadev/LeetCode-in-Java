package g3601_3700.s3691_maximum_total_subarray_value_ii;

// #Hard #Array #Greedy #Heap_Priority_Queue #Segment_Tree #Weekly_Contest_468
// #2025_09_26_Time_89_ms_(80.08%)_Space_81.62_MB_(23.69%)

import java.util.PriorityQueue;

public class Solution {
    private static class Sparse {
        long[][] mn;
        long[][] mx;
        int[] log;

        Sparse(int[] a) {
            int n = a.length;
            int zerosN = 32 - Integer.numberOfLeadingZeros(n);
            mn = new long[zerosN][n];
            mx = new long[zerosN][n];
            log = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                log[i] = log[i / 2] + 1;
            }
            for (int i = 0; i < n; i++) {
                mn[0][i] = mx[0][i] = a[i];
            }
            for (int k = 1; k < zerosN; k++) {
                for (int i = 0; i + (1 << k) <= n; i++) {
                    mn[k][i] = Math.min(mn[k - 1][i], mn[k - 1][i + (1 << (k - 1))]);
                    mx[k][i] = Math.max(mx[k - 1][i], mx[k - 1][i + (1 << (k - 1))]);
                }
            }
        }

        long getMin(int l, int r) {
            int k = log[r - l + 1];
            return Math.min(mn[k][l], mn[k][r - (1 << k) + 1]);
        }

        long getMax(int l, int r) {
            int k = log[r - l + 1];
            return Math.max(mx[k][l], mx[k][r - (1 << k) + 1]);
        }
    }

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        Sparse st = new Sparse(nums);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));
        for (int i = 0; i < n; i++) {
            pq.add(new long[] {st.getMax(i, n - 1) - st.getMin(i, n - 1), i, n - 1});
        }
        long ans = 0;
        while (k-- > 0 && !pq.isEmpty()) {
            var cur = pq.poll();
            ans += cur[0];
            int l = (int) cur[1];
            int r = (int) cur[2];
            if (r - 1 > l) {
                pq.add(new long[] {st.getMax(l, r - 1) - st.getMin(l, r - 1), l, r - 1});
            }
        }
        return ans;
    }
}
