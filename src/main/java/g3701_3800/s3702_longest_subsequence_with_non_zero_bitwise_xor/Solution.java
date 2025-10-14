package g3701_3800.s3702_longest_subsequence_with_non_zero_bitwise_xor;

// #Medium #Array #Bit_Manipulation #Weekly_Contest_470
// #2025_10_05_Time_2_ms_(100.00%)_Space_64.20_MB_(100.00%)

public class Solution {
    public int longestSubsequence(int[] nums) {
        int xorSum = 0;
        boolean allZero = true;
        for (int num : nums) {
            xorSum ^= num;
            if (num != 0) {
                allZero = false;
            }
        }
        if (allZero) {
            return 0;
        }
        return xorSum != 0 ? nums.length : nums.length - 1;
    }
}
