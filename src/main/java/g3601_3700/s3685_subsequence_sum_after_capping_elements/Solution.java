package g3601_3700.s3685_subsequence_sum_after_capping_elements;

// #Medium #Weekly_Contest_467 #2025_09_14_Time_107_ms_(100.00%)_Space_45.61_MB_(100.00%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    private static final int MAX_K = 4001;
    private final boolean[] dp = new boolean[MAX_K];

    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        Arrays.fill(dp, false);
        dp[0] = true;
        int p = 0;
        boolean[] ans = new boolean[n];
        for (int i = 1; i <= n; i++) {
            while (p < n && nums[p] < i) {
                for (int j = k; j >= nums[p]; j--) {
                    dp[j] |= dp[j - nums[p]];
                }
                p++;
            }
            int cnt = n - p;
            for (int j = 0; j <= cnt; j++) {
                int weight = i * j;
                if (k < weight) {
                    break;
                }
                // We can form dp[k - weight], so we can form dp[k]
                // by choosing j knapsacks (each has weight of i)
                if (dp[k - weight]) {
                    ans[i - 1] = true;
                    break;
                }
            }
        }
        return ans;
    }
}
