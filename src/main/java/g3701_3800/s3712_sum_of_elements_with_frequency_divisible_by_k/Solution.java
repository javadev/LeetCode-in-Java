package g3701_3800.s3712_sum_of_elements_with_frequency_divisible_by_k;

// #Easy #Weekly_Contest_471 #2025_10_12_Time_3_ms_(_%)_Space_43.23_MB_(_%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            if (e.getValue() % k == 0) {
                ans += e.getKey() * e.getValue();
            }
        }
        return ans;
    }
}
