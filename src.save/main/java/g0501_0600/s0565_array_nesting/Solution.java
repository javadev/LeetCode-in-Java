package g0501_0600.s0565_array_nesting;

// #Medium #Array #Depth_First_Search #2022_08_10_Time_5_ms_(95.44%)_Space_75.8_MB_(65.97%)

public class Solution {
    public int arrayNesting(int[] nums) {
        int index;
        int value;
        int maxLen = 0;
        int len;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                index = i;
                len = 0;
                while (nums[index] != -1) {
                    value = nums[index];
                    nums[index] = -1;
                    index = value;
                    len++;
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}
