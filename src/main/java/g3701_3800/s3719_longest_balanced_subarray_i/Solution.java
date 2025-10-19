package g3701_3800.s3719_longest_balanced_subarray_i;

// #Medium #Weekly_Contest_472 #2025_10_19_Time_302_ms_(50.00%)_Space_45.14_MB_(50.00%)

import java.util.HashSet;

public class Solution {
    public int longestBalanced(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    even.add(nums[j]);
                } else {
                    odd.add(nums[j]);
                }
                if (even.size() == odd.size()) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
