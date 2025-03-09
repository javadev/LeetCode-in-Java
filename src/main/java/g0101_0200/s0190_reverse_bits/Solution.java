package g0101_0200.s0190_reverse_bits;

// #Easy #Top_Interview_Questions #Bit_Manipulation #Divide_and_Conquer
// #Algorithm_I_Day_14_Bit_Manipulation #Udemy_Bit_Manipulation #Top_Interview_150_Bit_Manipulation
// #2025_03_09_Time_0_ms_(100.00%)_Space_41.94_MB_(43.56%)

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
