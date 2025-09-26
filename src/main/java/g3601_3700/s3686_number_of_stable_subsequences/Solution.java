package g3601_3700.s3686_number_of_stable_subsequences;

// #Hard #Array #Dynamic_Programming #Weekly_Contest_467
// #2025_09_26_Time_9_ms_(99.95%)_Space_60.26_MB_(57.85%)

public class Solution {
    private static final long MOD = 1000000007L;

    public int countStableSubsequences(int[] nums) {
        long e1 = 0;
        long e2 = 0;
        long o1 = 0;
        long o2 = 0;
        for (int x : nums) {
            if ((x & 1) == 0) {
                long ne1 = (e1 + (o1 + o2 + 1)) % MOD;
                long ne2 = (e2 + e1) % MOD;
                e1 = ne1;
                e2 = ne2;
            } else {
                long no1 = (o1 + (e1 + e2 + 1)) % MOD;
                long no2 = (o2 + o1) % MOD;
                o1 = no1;
                o2 = no2;
            }
        }
        long ans = (e1 + e2 + o1 + o2) % MOD;
        return (int) ans;
    }
}
