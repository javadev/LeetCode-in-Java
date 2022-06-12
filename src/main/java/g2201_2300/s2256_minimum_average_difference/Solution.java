package g2201_2300.s2256_minimum_average_difference;

// #Medium #2022_06_12_Time_20_ms_(69.18%)_Space_72.2_MB_(82.10%)

public class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        long min = Integer.MAX_VALUE;
        int ans = -1;
        long left = 0;
        for (int i = 0; i < n; i++) {
            left += nums[i];
            sum -= nums[i];
            long l = left / (i + 1);
            long r = (i == n - 1) ? 0 : sum / (n - i - 1);
            long abso = Math.abs(l - r);
            if (min > abso) {
                min = abso;
                ans = i;
            }
        }
        return ans;
    }
}
