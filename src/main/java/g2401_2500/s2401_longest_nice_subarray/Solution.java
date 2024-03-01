package g2401_2500.s2401_longest_nice_subarray;

// #Medium #Array #Bit_Manipulation #Sliding_Window
// #2022_09_26_Time_4_ms_(87.45%)_Space_70.5_MB_(79.87%)

public class Solution {
    public int longestNiceSubarray(int[] nums) {
        int ans = 1;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            for (int i = right - 1; i >= left; i--) {
                if ((nums[i] & nums[right]) != 0) {
                    left = i + 1;
                    break;
                }
                if (i == left) {
                    ans = Math.max(ans, right - left + 1);
                }
            }
            right++;
        }
        return ans;
    }
}
