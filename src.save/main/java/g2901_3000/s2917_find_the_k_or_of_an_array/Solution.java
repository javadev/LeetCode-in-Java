package g2901_3000.s2917_find_the_k_or_of_an_array;

// #Easy #Array #Bit_Manipulation #2023_12_28_Time_2_ms_(96.79%)_Space_44.2_MB_(6.69%)

public class Solution {
    public int findKOr(int[] nums, int k) {
        int[] dp = new int[31];
        for (int num : nums) {
            int i = 0;
            while (num > 0) {
                if ((num & 1) == 1) {
                    dp[i] += 1;
                }
                i += 1;
                num = num >> 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < 31; i++) {
            if (dp[i] >= k) {
                ans += (1 << i);
            }
        }
        return ans;
    }
}
