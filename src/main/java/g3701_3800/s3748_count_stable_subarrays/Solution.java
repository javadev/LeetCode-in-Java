package g3701_3800.s3748_count_stable_subarrays;

// #Hard #Array #Binary_Search #Prefix_Sum #Senior_Staff #Weekly_Contest_476
// #2026_04_26_Time_9_ms_(100.00%)_Space_183.68_MB_(43.30%)

public class Solution {
    public long[] countStableSubarrays(int[] nums, int[][] queries) {
        int n = nums.length;
        long[] preSum = new long[n + 1];
        int[] idx = new int[n];
        int[] end = new int[n];
        int cnt = 0;
        int prv = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= prv) {
                cnt++;
            } else {
                cnt = 1;
            }
            prv = nums[i];
            preSum[i + 1] = preSum[i] + cnt;
            idx[i] = cnt - 1;
        }
        end[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (idx[i] + 1 == idx[i + 1]) {
                end[i] = end[i + 1];
            } else {
                end[i] = i;
            }
        }
        long[] ans = new long[queries.length];
        for (int l = 0; l < queries.length; l++) {
            int i = queries[l][0];
            int j = queries[l][1];
            long res = preSum[j + 1] - preSum[i];
            int endIdx = Math.min(end[i], j);
            res -= (long) (endIdx - i + 1) * idx[i];
            ans[l] = res;
        }
        return ans;
    }
}
