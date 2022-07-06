package g0301_0400.s0338_counting_bits;

// #Easy #Top_100_Liked_Questions #Dynamic_Programming #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_03_15_Time_1_ms_(99.97%)_Space_46.6_MB_(76.56%)

public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int borderPos = 1;
        int incrPos = 1;
        for (int i = 1; i < result.length; i++) {
            // when we reach pow of 2 ,  reset borderPos and incrPos
            if (incrPos == borderPos) {
                result[i] = 1;
                incrPos = 1;
                borderPos = i;
            } else {
                result[i] = 1 + result[incrPos++];
            }
        }
        return result;
    }
}
