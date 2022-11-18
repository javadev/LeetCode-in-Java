package g2401_2500.s2419_longest_subarray_with_maximum_bitwise_and;

// #Medium #Array #Bit_Manipulation #Brainteaser
// #2022_11_18_Time_4_ms_(83.94%)_Space_93.5_MB_(63.54%)

public class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n < maxVal) {
                continue;
            }
            if (n > maxVal) {
                maxVal = n;
                res = 0;
            }
            int j = i + 1;
            while (j < nums.length && nums[j] == n) {
                j++;
            }
            res = Math.max(res, j - i);
            i = j - 1;
        }
        return res;
    }
}
