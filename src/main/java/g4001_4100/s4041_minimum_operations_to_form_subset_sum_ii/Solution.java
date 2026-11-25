package g4001_4100.s4041_minimum_operations_to_form_subset_sum_ii;

// #Hard #Array #Dynamic_Programming #Senior_Staff #Weekly_Contest_517
// #2026_11_25_Time_89_ms_(98.57%)_Space_46.04_MB_(85.71%)

import java.util.Arrays;

public class Solution {
    private static final int INF = (int) 1e9;

    public int minOperations(int[] nums, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int num : nums) {
            int[] cost = new int[sum + 1];
            Arrays.fill(cost, INF);
            int v = num;
            int k = 0;
            while (v > 0) {
                int t = v;
                int m = 0;
                while (t <= sum) {
                    if (k + m < cost[t]) cost[t] = k + m;
                    t *= 2;
                    m++;
                }
                v /= 2;
                k++;
            }
            int[] ndp = dp.clone();
            for (int t = 1; t <= sum; t++) {
                int c = cost[t];
                if (c >= INF) {
                    continue;
                }
                for (int j = sum; j >= t; j--) {
                    int cur = dp[j - t] + c;
                    if (cur < ndp[j]) ndp[j] = cur;
                }
            }
            dp = ndp;
            if (dp[sum] == 0) {
                return 0;
            }
        }
        return dp[sum] >= INF ? -1 : dp[sum];
    }
}
