package g3701_3800.s3788_maximum_score_of_a_split;

// #Medium #Array #Prefix_Sum #Senior #Weekly_Contest_482
// #2026_05_22_Time_2_ms_(100.00%)_Space_113.41_MB_(96.82%)

public class Solution {
    public long maximumScore(int[] nums) {
        long ans = nums[0] - (long) nums[1];
        long prefixSum = 0;
        int n = nums.length;
        int min = nums[n - 1];
        for (int i = 0; i < n - 1; i++) {
            prefixSum += nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            ans = Math.max(ans, prefixSum - min);
            min = Math.min(min, nums[i]);
            prefixSum -= nums[i];
        }
        return ans;
    }
}
