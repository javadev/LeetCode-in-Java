package g1801_1900.s1829_maximum_xor_for_each_query;

// #Medium #Array #Bit_Manipulation #Prefix_Sum
// #2022_07_14_Time_5_ms_(61.24%)_Space_149.5_MB_(14.34%)

public class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] result = new int[nums.length];
        int val = nums[0];
        int target = (1 << maximumBit) - 1;
        for (int i = 1; i < nums.length; i++) {
            val ^= nums[i];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = target ^ val;
            val ^= nums[nums.length - i - 1];
        }
        return result;
    }
}
