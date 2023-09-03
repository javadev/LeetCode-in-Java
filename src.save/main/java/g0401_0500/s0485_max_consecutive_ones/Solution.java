package g0401_0500.s0485_max_consecutive_ones;

// #Easy #Array #2022_07_21_Time_1_ms_(100.00%)_Space_43.6_MB_(84.46%)

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int i = 0;
        while (i < nums.length) {
            int currentLen = 0;
            while (i < nums.length && nums[i] == 1) {
                i++;
                currentLen++;
            }
            maxLen = Math.max(maxLen, currentLen);
            i++;
        }
        return maxLen;
    }
}
