package g3101_3200.s3177_find_the_maximum_length_of_a_good_subsequence_ii;

// #Hard #Array #Hash_Table #Dynamic_Programming
// #2024_06_12_Time_11_ms_(100.00%)_Space_45.8_MB_(90.55%)

import java.util.HashMap;

public class Solution {
    public int maximumLength(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = hm.getOrDefault(nums[i], -1);
            hm.put(nums[i], i);
        }
        int[][] dp = new int[k + 1][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
            if (pre[i] >= 0) {
                dp[0][i] = dp[0][pre[i]] + 1;
            }
        }
        for (int i = 1; i <= k; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (pre[j] >= 0) {
                    dp[i][j] = dp[i][pre[j]] + 1;
                }
                dp[i][j] = Math.max(dp[i][j], max + 1);
                max = Math.max(max, dp[i - 1][j]);
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[k][i]);
        }
        return max;
    }
}
