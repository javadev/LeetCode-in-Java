package g3601_3700.s3623_count_number_of_trapezoids_i;

// #Medium #Array #Hash_Table #Math #Geometry #Weekly_Contest_459
// #2025_07_22_Time_30_ms_(99.92%)_Space_100.93_MB_(64.40%)

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
        for (Integer num : map.values()) {
            if (num > 1) {
                long pairs = ((long) num * (num - 1) / 2) % mod;
                sum = (sum + pairs) % mod;
                sumPairs = (sumPairs + pairs * pairs % mod) % mod;
            }
        }
        long res = (sum * sum % mod - sumPairs + mod) % mod;
        res = (res * inv) % mod;
        return (int) res;
    }
}
