package g3501_3600.s3583_count_special_triplets;

// #Medium #2025_06_16_Time_250_ms_(100.00%)_Space_62.22_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int specialTriplets(int[] nums) {
        int mod = 1_000_000_007;
        int res = 0;
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            right.put(num, right.get(num) - 1);
            int ci = left.getOrDefault(num * 2, 0);
            int ck = right.getOrDefault(num * 2, 0);
            res = (res + ci * ck) % mod;
            left.put(num, left.getOrDefault(num, 0) + 1);
        }
        return res;
    }
}
