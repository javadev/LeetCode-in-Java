package g3101_3200.s3117_minimum_sum_of_values_by_dividing_array;

// #Hard #Array #Dynamic_Programming #Binary_Search #Bit_Manipulation #Queue #Segment_Tree
// #2024_04_27_Time_6_ms_(100.00%)_Space_44.8_MB_(99.04%)

import java.util.Arrays;

public class Solution {
    private static final int INF = 0xfffffff;

    public int minimumValueSum(int[] nums, int[] andValues) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int target : andValues) {
            int sum = INF;
            int minSum = INF;
            int rightSum = INF;
            int[] leftSum = new int[n + 1];
            leftSum[0] = INF;
            int left = 0;
            int right = 0;
            int[] nextdp = new int[n + 1];
            nextdp[0] = INF;
            for (int i = 0; i < n; ++i) {
                sum &= nums[i];
                rightSum &= nums[i];
                ++right;
                if (sum < target) {
                    minSum = INF;
                    sum = nums[i];
                }
                while ((leftSum[left] & rightSum) <= target) {
                    if ((leftSum[left] & rightSum) == target) {
                        minSum = Math.min(minSum, dp[i - left - right + 1]);
                    }
                    if (left-- > 0) {
                        continue;
                    }
                    left = right;
                    int start = i;
                    for (int l = 1; l <= left; ++l) {
                        leftSum[l] = leftSum[l - 1] & nums[start--];
                    }
                    right = 0;
                    rightSum = INF;
                }
                nextdp[i + 1] = minSum + nums[i];
            }
            dp = nextdp;
        }
        return dp[n] < INF ? dp[n] : -1;
    }
}
