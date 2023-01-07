package g0901_1000.s0910_smallest_range_ii;

// #Medium #Array #Math #Sorting #Greedy #Programming_Skills_II_Day_13
// #2022_03_28_Time_10_ms_(73.16%)_Space_49.6_MB_(38.97%)

import java.util.Arrays;

public class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n - 1] - nums[0];
        int min = nums[0] + k;
        int max = nums[n - 1] - k;
        for (int i = 0; i < n - 1; i++) {
            int mx = Math.max(max, nums[i] + k);
            int mi = Math.min(min, nums[i + 1] - k);
            ans = Math.min(ans, mx - mi);
        }
        return ans;
    }
}
