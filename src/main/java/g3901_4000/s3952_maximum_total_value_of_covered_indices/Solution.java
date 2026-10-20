package g3901_4000.s3952_maximum_total_value_of_covered_indices;

// #Medium #Array #String #Dynamic_Programming #Greedy #Staff #Biweekly_Contest_184
// #2026_10_20_Time_8_ms_(93.94%)_Space_127.68_MB_(89.39%)

public class Solution {
    public long maxTotal(int[] A, String s) {
        int n = A.length;
        int mn = 100000;
        long res = 0;
        for (int i = n - 1; i >= 0; --i) {
            res += A[i];
            mn = Math.min(mn, A[i]);
            if (s.charAt(i) == '0') {
                res -= mn;
                mn = 100000;
            }
        }
        return res;
    }
}
