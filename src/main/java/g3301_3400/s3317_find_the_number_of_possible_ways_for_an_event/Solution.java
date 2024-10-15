package g3301_3400.s3317_find_the_number_of_possible_ways_for_an_event;

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2024_10_15_Time_20_ms_(97.08%)_Space_41.6_MB_(97.66%)

public class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x, int y) {
        long[] fact = new long[x + 1];
        fact[0] = 1;
        for (int i = 1; i <= x; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        long[] invFact = new long[x + 1];
        invFact[x] = powMod(fact[x], MOD - 2);
        for (int i = x - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }
        long[] powY = new long[x + 1];
        powY[0] = 1;
        for (int k = 1; k <= x; k++) {
            powY[k] = powY[k - 1] * y % MOD;
        }
        long[] localArray = new long[x + 1];
        localArray[0] = 1;
        for (int i = 1; i <= n; i++) {
            int kMax = Math.min(i, x);
            for (int k = kMax; k >= 1; k--) {
                localArray[k] = (k * localArray[k] + localArray[k - 1]) % MOD;
            }
            localArray[0] = 0;
        }
        long sum = 0;
        int kLimit = Math.min(n, x);
        for (int k = 1; k <= kLimit; k++) {
            long localValue = fact[x] * invFact[x - k] % MOD;
            long term = localValue * localArray[k] % MOD;
            term = term * powY[k] % MOD;
            sum = (sum + term) % MOD;
        }
        return (int) sum;
    }

    private long powMod(long a, long b) {
        long res = 1;
        a = a % MOD;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
