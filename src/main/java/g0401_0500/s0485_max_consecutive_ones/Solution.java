package g0401_0500.s0485_max_consecutive_ones;

// #Easy #Array

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentLen = 0;
            while (i < nums.length && nums[i] == 1) {
                i++;
                currentLen++;
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }
}
