package g2601_2700.s2680_maximum_or;

// #Medium #Array #Greedy #Bit_Manipulation #Prefix_Sum
// #2023_09_11_Time_2_ms_(100.00%)_Space_55.2_MB_(56.19%)

public class Solution {
    public long maximumOr(int[] nums, int k) {
        int[] suffix = new int[nums.length];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] | nums[i + 1];
        }
        long prefix = 0L;
        long max = 0L;
        for (int i = 0; i <= nums.length - 1; i++) {
            long num = nums[i];
            max = Math.max(max, prefix | (num << k) | suffix[i]);
            prefix |= num;
        }
        return max;
    }
}
