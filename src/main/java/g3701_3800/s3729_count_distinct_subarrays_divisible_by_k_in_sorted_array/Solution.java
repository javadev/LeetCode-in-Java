package g3701_3800.s3729_count_distinct_subarrays_divisible_by_k_in_sorted_array;

// #Hard #Array #Hash_Table #Prefix_Sum #Weekly_Contest_473
// #2025_10_29_Time_33_ms_(99.78%)_Space_62.35_MB_(50.99%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long numGoodSubarrays(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>(nums.length, 1);
        cnt.put(0, 1);
        long sum = 0;
        int lastStart = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (i > 0 && x != nums[i - 1]) {
                long s = sum;
                for (int t = i - lastStart; t > 0; t--) {
                    cnt.merge((int) (s % k), 1, Integer::sum);
                    s -= nums[i - 1];
                }
                lastStart = i;
            }
            sum += x;
            ans += cnt.getOrDefault((int) (sum % k), 0);
        }
        return ans;
    }
}
