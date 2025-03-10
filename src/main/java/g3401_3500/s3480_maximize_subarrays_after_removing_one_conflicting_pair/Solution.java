package g3401_3500.s3480_maximize_subarrays_after_removing_one_conflicting_pair;

// #Hard #Array #Prefix_Sum #Enumeration #Segment_Tree
// #2025_03_10_Time_20_ms_(98.86%)_Space_141.78_MB_(52.27%)

import java.util.Arrays;

public class Solution {
    public long maxSubarrays(int n, int[][] conflictingPairs) {
        long totalSubarrays = (long) n * (n + 1) / 2;
        int[] h = new int[n + 1];
        int[] d2 = new int[n + 1];
        Arrays.fill(h, n + 1);
        Arrays.fill(d2, n + 1);
        for (int[] pair : conflictingPairs) {
            int a = pair[0];
            int b = pair[1];
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b < h[a]) {
                d2[a] = h[a];
                h[a] = b;
            } else if (b < d2[a]) {
                d2[a] = b;
            }
        }
        int[] f = new int[n + 2];
        f[n + 1] = n + 1;
        f[n] = h[n];
        for (int i = n - 1; i >= 1; i--) {
            f[i] = Math.min(h[i], f[i + 1]);
        }
        // forbiddenCount(x) returns (n - x + 1) if x <= n, else 0.
        // This is the number of forbidden subarrays starting at some i when f[i] = x.
        long originalUnion = 0;
        for (int i = 1; i <= n; i++) {
            if (f[i] <= n) {
                originalUnion += (n - f[i] + 1);
            }
        }
        long originalValid = totalSubarrays - originalUnion;
        long best = originalValid;
        // For each index j (1 <= j <= n) where a candidate conflicting pair exists,
        // simulate removal of the pair that gave h[j] (if any).
        // (If there is no candidate pair at j, h[j] remains n+1.)
        for (int j = 1; j <= n; j++) {
            // no conflicting pair at index j
            // Only if removal would change h[j] (i.e. h[j] < d2[j])
            // no alternative candidate exists
            if (h[j] == n + 1 || d2[j] == h[j]) {
                continue;
            }
            // Simulate removal: new candidate at j becomes d2[j]
            int newCandidate = (j < n) ? Math.min(d2[j], f[j + 1]) : d2[j];
            // We'll recompute the new f values for indices 1..j.
            // Let newF[i] denote the updated value.
            // For i > j, newF[i] remains as original f[i].
            // For i = j, newF[j] = min( newCandidate, f[j+1] ) (which is newCandidate by
            // definition).
            int newFj = newCandidate;
            // forbiddenCount(x) is defined as (n - x + 1) if x<= n, else 0.
            long delta = forbiddenCount(newFj, n) - forbiddenCount(f[j], n);
            int cur = newFj;
            // Now update backwards for i = j-1 down to 1.
            for (int i = j - 1; i >= 1; i--) {
                int newVal = Math.min(h[i], cur);
                // no further change for i' <= i
                if (newVal == f[i]) {
                    break;
                }
                delta += forbiddenCount(newVal, n) - forbiddenCount(f[i], n);
                cur = newVal;
            }
            long newUnion = originalUnion + delta;
            long newValid = totalSubarrays - newUnion;
            best = Math.max(best, newValid);
        }
        return best;
    }

    private long forbiddenCount(int x, int n) {
        return x <= n ? (n - x + 1) : 0;
    }
}
