package g0101_0200.s0137_single_number_ii;

// #Medium #Array #Bit_Manipulation #2022_06_24_Time_0_ms_(100.00%)_Space_42.1_MB_(84.59%)

public class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & (~twos);
            twos = (twos ^ num) & (~ones);
        }
        return ones;
    }
}
