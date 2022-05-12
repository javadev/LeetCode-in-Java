package g1901_2000.s1994_the_number_of_good_subsets;

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2022_05_12_Time_15_ms_(94.29%)_Space_125_MB_(11.43%)

public class Solution {
    private static final long MOD = (long) (1e9 + 7);

    private long add(long a, long b) {
        a += b;
        return a < MOD ? a : a - MOD;
    }

    private long mul(long a, long b) {
        a *= b;
        return a < MOD ? a : a % MOD;
    }

    private long pow(long a, long b) {
        // a %= MOD;
        // b%=(MOD-1);//if MOD is prime
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = mul(res, a);
            }
            a = mul(a, a);
            b >>= 1;
        }
        return add(res, 0);
    }

    public int numberOfGoodSubsets(int[] nums) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] mask = new int[31];
        int[] freq = new int[31];
        for (int x : nums) {
            freq[x]++;
        }
        for (int i = 1; i <= 30; i++) {
            for (int j = 0; j < primes.length; j++) {
                if (i % primes[j] == 0) {
                    if ((i / primes[j]) % primes[j] == 0) {
                        mask[i] = 0;
                        break;
                    }
                    mask[i] |= (int) pow(2, j);
                }
            }
        }
        long[] dp = new long[1024];
        dp[0] = 1;
        for (int i = 1; i <= 30; i++) {
            if (mask[i] != 0) {
                for (int j = 0; j < 1024; j++) {
                    if ((mask[i] & j) == 0 && dp[j] > 0) {
                        dp[(mask[i] | j)] = add(dp[(mask[i] | j)], mul(dp[j], freq[i]));
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 1; i < 1024; i++) {
            ans = add(ans, dp[i]);
        }
        ans = mul(ans, pow(2, freq[1]));
        ans = add(ans, 0);
        return (int) ans;
    }
}
