package g0301_0400.s0338_counting_bits;

// #Easy #Dynamic_Programming #Bit_Manipulation #LeetCode_75_Bit_Manipulation
// #Udemy_Bit_Manipulation #Big_O_Time_O(num)_Space_O(num)
// #2024_11_16_Time_2_ms_(96.37%)_Space_46.4_MB_(70.53%)

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
