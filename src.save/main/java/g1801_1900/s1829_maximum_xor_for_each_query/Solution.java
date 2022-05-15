package g1801_1900.s1829_maximum_xor_for_each_query;

// #Medium #Array #Bit_Manipulation #Prefix_Sum #Acceptance_76.2%
// #2022_05_07_Time_7_ms_(20.94%)_Space_152.5_MB_(6.86%)

public class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] result = new int[nums.length];
        long[] xOr = new long[nums.length];
        xOr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xOr[i] ^= xOr[i - 1] ^ nums[i];
        }
        long maxNum = (long) Math.pow(2, maximumBit) - 1;
        for (int i = 0; i < nums.length; i++) {
            result[nums.length - i - 1] = (int) (maxNum ^ xOr[i]);
        }
        return result;
    }
}
