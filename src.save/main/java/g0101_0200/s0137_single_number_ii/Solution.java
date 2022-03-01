package g0101_0200.s0137_single_number_ii;

// #Medium #Array #Bit_Manipulation #2022_02_22_Time_1_ms_(91.46%)_Space_43.6_MB_(37.14%)

public class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < nums.length; i++) {
            ones = (ones ^ nums[i]) & (~twos);
            twos = (twos ^ nums[i]) & (~ones);
        }
        return ones;
    }
}
