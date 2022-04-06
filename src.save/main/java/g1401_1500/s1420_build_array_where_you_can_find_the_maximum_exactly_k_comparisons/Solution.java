package g1401_1500.s1420_build_array_where_you_can_find_the_maximum_exactly_k_comparisons;

// #Hard #Dynamic_Programming #2022_03_28_Time_22_ms_(86.32%)_Space_47_MB_(13.68%)

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int numOfArrays(int n, int m, int k) {
        long[][] ways = new long[m + 1][k + 1];
        long[][] sums = new long[m + 1][k + 1];
        for (int max = 1; max <= m; max++) {
            ways[max][1] = 1;
            sums[max][1] = ways[max][1] + sums[max - 1][1];
        }
        for (int count = 2; count <= n; count++) {
            long[][] ways2 = new long[m + 1][k + 1];
            long[][] sums2 = new long[m + 1][k + 1];
            for (int max = 1; max <= m; max++) {
                for (int cost = 1; cost <= k; cost++) {
                    long noCost = max * ways[max][cost] % MOD;
                    long newCost = sums[max - 1][cost - 1];
                    ways2[max][cost] = (noCost + newCost) % MOD;
                    sums2[max][cost] = (sums2[max - 1][cost] + ways2[max][cost]) % MOD;
                }
            }
            ways = ways2;
            sums = sums2;
        }
        return (int) sums[m][k];
    }
}
