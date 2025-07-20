package g3601_3700.s3623_count_number_of_trapezoids_i;

// #Medium #2025_07_20_Time_30_ms_(99.91%)_Space_100.40_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countTrapezoids(int[][] points) {
        int mod = 1_000_000_007;
        long inv = 500_000_004L;
        Map<Integer, Integer> map = new HashMap<>(points.length);
        for (int[] p : points) {
            map.merge(p[1], 1, Integer::sum);
        }
        long sum = 0L;
        long sumPairs = 0L;
        for (int c : map.values()) {
            if (c > 1) {
                long pairs = ((long) c * (c - 1) / 2) % mod;
                sum = (sum + pairs) % mod;
                sumPairs = (sumPairs + pairs * pairs % mod) % mod;
            }
        }
        long res = (sum * sum % mod - sumPairs + mod) % mod;
        res = (res * inv) % mod;
        return (int) res;
    }
}
