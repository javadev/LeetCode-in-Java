package g3401_3500.s3428_maximum_and_minimum_sums_of_at_most_size_k_subsequences;

// #Medium #Array #Dynamic_Programming #Math #Sorting #Combinatorics
// #2025_01_22_Time_28_(99.74%)_Space_65.01_(35.71%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = (int) 1e9 + 7;
    private long[] fact;
    private long[] invFact;

    public int minMaxSums(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        if (fact == null || fact.length < n + 1) {
            buildFactorials(n);
        }
        long[] sum = new long[n + 1];
        sum[0] = 1;
        for (int i = 0; i < n; i++) {
            long val = (2L * sum[i]) % MOD;
            if (i + 1 >= k) {
                val = (val - comb(i, k - 1) + MOD) % MOD;
            }
            sum[i + 1] = val;
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            long add = (sum[i] + sum[n - 1 - i]) % MOD;
            res = (res + (nums[i] % MOD) * add) % MOD;
        }
        return (int) res;
    }

    private void buildFactorials(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[n] = pow(fact[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    private long comb(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    private long pow(long base, int exp) {
        long ans = 1L;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return ans;
    }
}
