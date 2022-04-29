package g1701_1800.s1735_count_ways_to_make_array_with_product;

// #Hard #Array #Dynamic_Programming #Math #2022_04_29_Time_189_ms_(43.75%)_Space_50.3_MB_(56.25%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int MOD = 1_000_000_007;
    private long[][] tri;
    private List<Integer> primes;

    public int[] waysToFillArray(int[][] queries) {
        int len = queries.length;
        int[] res = new int[len];
        primes = getPrimes(100);
        tri = getTri(10015, 15);
        for (int i = 0; i < len; i++) {
            res[i] = calculate(queries[i][0], queries[i][1]);
        }
        return res;
    }

    private List<Integer> getPrimes(int limit) {
        boolean[] notPrime = new boolean[limit + 1];
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (!notPrime[i]) {
                res.add(i);
                for (int j = i * i; j <= limit; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        return res;
    }

    private long[][] getTri(int m, int n) {
        long[][] res = new long[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            res[i][0] = 1;
            for (int j = 1; j <= Math.min(n, i); j++) {
                res[i][j] = (res[i - 1][j - 1] + res[i - 1][j]) % MOD;
            }
        }
        return res;
    }

    private int calculate(int n, int target) {
        long res = 1;
        for (int prime : primes) {
            if (prime > target) {
                break;
            }
            int cnt = 0;
            while (target % prime == 0) {
                cnt++;
                target /= prime;
            }
            res = (res * tri[cnt + n - 1][cnt]) % MOD;
        }
        return target > 1 ? (int) (res * n % MOD) : (int) res;
    }
}
