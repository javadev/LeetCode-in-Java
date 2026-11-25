package g4001_4100.s4040_minimum_operations_to_form_subset_sum_i;

// #Medium #Array #Dynamic_Programming #Staff #Weekly_Contest_517
// #2026_11_25_Time_64_ms_(91.80%)_Space_46.09_MB_(90.16%)

import java.util.Arrays;

public class Solution {
    private static final int INF = 1000000;

    public int minOperations(int[] nums, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int x : nums) {
            int[] next = dp.clone();
            long value = x;
            int cost = 0;
            while (value <= sum) {
                int v = (int) value;
                for (int s = v; s <= sum; s++) {
                    if (dp[s - v] != INF) {
                        next[s] = Math.min(next[s], dp[s - v] + cost);
                    }
                }
                value *= 2;
                cost++;
            }
            value = x;
            cost = 0;
            while (value > 1) {
                value /= 2;
                cost++;
                int v = (int) value;
                for (int s = v; s <= sum; s++) {
                    if (dp[s - v] != INF) {
                        next[s] = Math.min(next[s], dp[s - v] + cost);
                    }
                }
            }
            dp = next;
        }
        return dp[sum] == INF ? -1 : dp[sum];
    }
}
