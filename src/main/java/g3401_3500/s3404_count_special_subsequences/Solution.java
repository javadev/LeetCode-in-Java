package g3401_3500.s3404_count_special_subsequences;

// #Medium #Array #Combinatorics #Dynamic #Mathematics #Programming
// #2024_12_29_Time_331_(100.00%)_Space_55.49_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long numberOfSubsequences(int[] nums) {
        Map<Double, Integer> freq = new HashMap<>();
        long ans = 0;
        for (int r = 4; r < nums.length; ++r) {
            for (int p = 0, q = r - 2; p < q - 1; ++p) {
                Double key = (double) nums[p] / nums[q];
                freq.put(key, freq.getOrDefault(key, 0) + 1);
            }
            for (int s = r + 2; s < nums.length; ++s) {
                ans += freq.getOrDefault((double) nums[s] / nums[r], 0);
            }
        }
        return ans;
    }
}
