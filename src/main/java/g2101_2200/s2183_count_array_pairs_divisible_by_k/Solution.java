package g2101_2200.s2183_count_array_pairs_divisible_by_k;

// #Hard #Array #Math #Number_Theory #2022_06_07_Time_849_ms_(44.54%)_Space_120.9_MB_(39.50%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countPairs(int[] nums, int k) {
        int n = nums.length;
        long count = 0L;
        Map<Integer, Long> map = new HashMap<>();
        for (int num : nums) {
            int gd = gcd(num, k);
            int want = k / gd;
            for (int p : map.keySet()) {
                if (p % want == 0) {
                    count += map.get(p);
                }
            }
            map.put(gd, map.getOrDefault(gd, 0L) + 1L);
        }
        return count;
    }

    public int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (a == 0) {
            return b;
        }
        return gcd(a, b % a);
    }
}
