package g0701_0800.s0740_delete_and_earn;

// #Medium #Array #Hash_Table #Dynamic_Programming #Dynamic_Programming_I_Day_3
// #2022_03_25_Time_4_ms_(77.68%)_Space_47.6_MB_(13.69%)

public class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        int min = 10001;
        int max = 0;
        for (int num : nums) {
            sum[num] += num;
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        int[] dp = new int[max + 1];
        dp[min] = sum[min];
        for (int i = min + 1; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + sum[i]);
        }
        return dp[max];
    }
}
