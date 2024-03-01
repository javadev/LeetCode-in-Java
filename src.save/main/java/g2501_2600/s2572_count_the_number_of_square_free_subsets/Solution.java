package g2501_2600.s2572_count_the_number_of_square_free_subsets;

// #Medium #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2023_08_21_Time_1_ms_(100.00%)_Space_41.5_MB_(79.12%)

public class Solution {
    private final int[] count = new int[31];
    private final int[] masks = new int[31];
    private final long[][] cache = new long[31][1 << 6];
    private static final long MOD = 1_000_000_007;

    public int squareFreeSubsets(int[] nums) {
        int[] p = {1, 2, 3, 5, 7, 11, 13};
        for (int i = 0; i < 7; ++i) {
            int mask = i == 0 ? 0 : 1 << (i - 1);
            for (int j = i + 1; j < 7; ++j) {
                if (p[i] * p[j] > 30) {
                    break;
                }
                masks[p[i] * p[j]] = mask | (1 << (j - 1));
            }
        }
        masks[30] = 7;
        for (int k : nums) {
            if (k % 4 != 0 && k % 9 != 0 && k % 25 != 0) {
                ++count[k];
            }
        }
        count[1] = powof2(count[1]);
        return (int) ((dfs(30, 0) + MOD - 1) % MOD);
    }

    private long dfs(int k, int mask) {
        if (k == 1) {
            return count[1];
        }
        if (cache[k][mask] != 0) {
            return cache[k][mask];
        }
        long res = dfs(k - 1, mask);
        if (count[k] > 0 && (masks[k] & mask) == 0) {
            res = (res + (count[k] * dfs(k - 1, mask | masks[k])) % MOD) % MOD;
        }
        cache[k][mask] = res;
        return cache[k][mask];
    }

    private int powof2(int k) {
        long pow2 = 2;
        long res = 1;
        while (k > 0) {
            if (k % 2 == 1) {
                res = (res * pow2) % MOD;
            }
            pow2 = (pow2 * pow2) % MOD;
            k >>= 1;
        }
        return (int) res;
    }
}
