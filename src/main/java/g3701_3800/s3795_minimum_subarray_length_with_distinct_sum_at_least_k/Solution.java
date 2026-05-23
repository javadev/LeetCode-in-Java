package g3701_3800.s3795_minimum_subarray_length_with_distinct_sum_at_least_k;

// #Medium #Array #Hash_Table #Sliding_Window #Senior #Biweekly_Contest_173
// #2026_05_22_Time_88_ms_(85.14%)_Space_207.14_MB_(6.02%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minLength(int[] nums, int k) {
        for (int i : nums) {
            if (i >= k) {
                return 1;
            }
        }
        int ans = Integer.MAX_VALUE;
        int alt = -1;
        int i = 0;
        int j = 1;
        int sum = nums[0];
        if (sum >= k) {
            return 1;
        }
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0], 1);
        while (i < nums.length && j < nums.length) {
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            if (hm.get(nums[j]) == 1) {
                sum += nums[j];
            }
            while (sum >= k) {
                ans = Math.min(ans, j - i + 1);
                hm.put(nums[i], hm.get(nums[i]) - 1);
                if (hm.get(nums[i]) == 0) {
                    sum -= nums[i];
                }
                i++;
            }
            j++;
        }
        return (ans != Integer.MAX_VALUE) ? ans : alt;
    }
}
