package g0101_0200.s0190_reverse_bits;

// #Easy #Top_Interview_Questions #Bit_Manipulation #Divide_and_Conquer #Acceptance_49.1%
// #Algorithm_I_Day_14_Bit_Manipulation #2022_03_04_Time_1_ms_(89.07%)_Space_42.1_MB_(38.84%)

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        // because there are 32 bits in total
        for (int i = 0; i < 32; i++) {
            ret = ret << 1;
            // If the bit is 1 we OR it with 1, ie add 1
            if ((n & 1) > 0) {
                ret = ret | 1;
            }
            n = n >>> 1;
        }
        return ret;
    }
}
