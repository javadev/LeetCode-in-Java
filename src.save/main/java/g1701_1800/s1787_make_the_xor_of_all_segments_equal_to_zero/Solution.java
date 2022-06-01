package g1701_1800.s1787_make_the_xor_of_all_segments_equal_to_zero;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
// #2022_04_27_Time_102_ms_(89.47%)_Space_77.4_MB_(73.68%)

import java.util.Arrays;

public class Solution {
    public int minChanges(int[] nums, int k) {
        int n = nums.length;
        int[][] fre = new int[k][1024];
        for (int i = 0; i < n; i++) {
            fre[i % k][nums[i]]++;
        }
        int[] dp = new int[1024];
        Arrays.fill(dp, -n);
        dp[0] = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            int[] dp2 = new int[1024];
            Arrays.fill(dp2, max);
            int max2 = 0;
            for (int xor = 0; xor < 1024; xor++) {
                for (int al = i; al < n; al += k) {
                    dp2[xor] = Math.max(dp2[xor], dp[xor ^ nums[al]] + fre[i][nums[al]]);
                }
                max2 = Math.max(max2, dp2[xor]);
            }
            max = max2;
            dp = dp2;
        }
        return n - dp[0];
    }
}
