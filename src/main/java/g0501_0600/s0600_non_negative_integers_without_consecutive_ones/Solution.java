package g0501_0600.s0600_non_negative_integers_without_consecutive_ones;

// #Hard #Dynamic_Programming #2022_03_20_Time_2_ms_(74.62%)_Space_38.5_MB_(95.38%)

public class Solution {
    public int findIntegers(int n) {
        int[] f = new int[32];
        f[0] = 1;
        f[1] = 2;
        int ans = 0;
        int preBit = 0;
        for (int i = 2; i < 32; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int k = 31; k >= 0; k--) {
            if ((n & (1 << k)) != 0) {
                // if that bit is on
                ans += f[k];
                if (preBit != 0) {
                    return ans;
                }
                preBit = 1;
            } else {
                preBit = 0;
            }
        }
        return ans + 1;
    }
}
