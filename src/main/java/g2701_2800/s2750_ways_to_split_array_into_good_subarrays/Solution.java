package g2701_2800.s2750_ways_to_split_array_into_good_subarrays;

// #Medium #Array #Dynamic_Programming #Math #2023_09_24_Time_7_ms_(96.36%)_Space_59.3_MB_(75.71%)

public class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        int lastOne = -1;
        int n = nums.length;
        long ans = 1;
        long mod = (long) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                if (lastOne != -1) {
                    ans = ans * (i - lastOne) % mod;
                }
                lastOne = i;
            }
        }
        if (lastOne == -1) {
            return 0;
        }
        return (int) ans;
    }
}
