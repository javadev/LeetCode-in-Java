package g3701_3800.s3796_find_maximum_value_in_a_constrained_sequence;

// #Medium #Array #Greedy #Staff #Biweekly_Contest_173
// #2026_05_22_Time_6_ms_(98.18%)_Space_208.10_MB_(32.73%)

public class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        int[] a = new int[n];
        a[0] = 0;
        for (int i = 1; i < n; i++) {
            a[i] = Integer.MAX_VALUE;
        }
        for (int[] r : restrictions) {
            a[r[0]] = Math.min(a[r[0]], r[1]);
        }

        for (int i = 1; i < n; i++) {
            a[i] = Math.min(a[i], a[i - 1] + diff[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            a[i] = Math.min(a[i], a[i + 1] + diff[i]);
        }
        int maxi = 0;
        for (int i : a) {
            maxi = Math.max(maxi, i);
        }
        return maxi;
    }
}
