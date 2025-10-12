package g3701_3800.s3708_longest_fibonacci_subarray;

// #Medium #Biweekly_Contest_167 #2025_10_12_Time_2_ms_(100.00%)_Space_58.15_MB_(100.00%)

public class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int ans = 2;
        int c = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] == nums[i - 1] + nums[i - 2]) {
                c++;
            } else {
                c = 2;
            }
            ans = Math.max(ans, c);
        }
        return ans;
    }
}
