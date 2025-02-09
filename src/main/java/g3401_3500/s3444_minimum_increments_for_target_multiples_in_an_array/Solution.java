package g3401_3500.s3444_minimum_increments_for_target_multiples_in_an_array;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask #Number_Theory
// #2025_02_04_Time_47_ms_(95.85%)_Space_47.31_MB_(56.40%)

public class Solution {
    public int minimumIncrements(int[] nums, int[] target) {
        int m = target.length;
        int fullMask = (1 << m) - 1;
        long[] lcmArr = new long[1 << m];
        for (int mask = 1; mask < (1 << m); mask++) {
            long l = 1;
            for (int j = 0; j < m; j++) {
                if ((mask & (1 << j)) != 0) {
                    l = lcm(l, target[j]);
                }
            }
            lcmArr[mask] = l;
        }
        long inf = Long.MAX_VALUE / 2;
        long[] dp = new long[1 << m];
        for (int i = 0; i < (1 << m); i++) {
            dp[i] = inf;
        }
        dp[0] = 0;
        for (int x : nums) {
            long[] newdp = dp.clone();
            for (int mask = 1; mask < (1 << m); mask++) {
                long l = lcmArr[mask];
                long r = x % l;
                long cost = (r == 0 ? 0 : l - r);
                for (int old = 0; old < (1 << m); old++) {
                    int newMask = old | mask;
                    newdp[newMask] = Math.min(newdp[newMask], dp[old] + cost);
                }
            }
            dp = newdp;
        }
        return (int) dp[fullMask];
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
