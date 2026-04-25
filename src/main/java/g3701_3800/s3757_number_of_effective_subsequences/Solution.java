package g3701_3800.s3757_number_of_effective_subsequences;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Combinatorics #Senior_Staff
// #Weekly_Contest_477 #2026_04_25_Time_128_ms_(95.71%)_Space_85.91_MB_(18.57%)

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int countEffective(int[] nums) {
        int n = nums.length;
        int t = 0;
        for (int v : nums) {
            t |= v;
        }
        if (t == 0) {
            return 0;
        }
        int[] bits = new int[20];
        int m = 0;
        for (int b = 0; b < 20; ++b) {
            if (((t >> b) & 1) != 0) {
                bits[m++] = b;
            }
        }
        int s = 1 << m;
        int[] freq = new int[s];
        for (int v : nums) {
            int m1 = 0;
            for (int j = 0; j < m; ++j) {
                if (((v >> bits[j]) & 1) != 0) {
                    m1 |= 1 << j;
                }
            }
            freq[m1]++;
        }
        int[] f = new int[s];
        System.arraycopy(freq, 0, f, 0, s);
        for (int i = 0; i < m; ++i) {
            for (int mask = 0; mask < s; ++mask) {
                if ((mask & (1 << i)) != 0) {
                    f[mask] += f[mask ^ (1 << i)];
                }
            }
        }
        long[] p2 = new long[n + 1];
        p2[0] = 1;
        for (int i = 1; i <= n; ++i) {
            p2[i] = (p2[i - 1] << 1) % MOD;
        }
        long ans = 0;
        int all = s - 1;
        for (int bmask = 1; bmask < s; ++bmask) {
            int comp = all ^ bmask;
            int cnt = f[comp];
            long add = p2[cnt];
            if (Integer.bitCount(bmask) % 2 == 1) {
                ans = (ans + add) % MOD;
            } else {
                ans = (ans - add) % MOD;
            }
        }
        ans = (ans % MOD + MOD) % MOD;
        return (int) ans;
    }
}
