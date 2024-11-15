package g3301_3400.s3349_adjacent_increasing_subarrays_detection_i;

// #Easy #Array #2024_11_15_Time_1_ms_(100.00%)_Space_44.7_MB_(18.69%)

import java.util.List;

public class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int l = nums.size();
        if (l < k * 2) {
            return false;
        }
        for (int i = 0; i < l - 2 * k + 1; i++) {
            if (check(i, k, nums) && check(i + k, k, nums)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(int p, int k, List<Integer> nums) {
        for (int i = p; i < p + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
