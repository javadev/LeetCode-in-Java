package g2601_2700.s2683_neighboring_bitwise_xor;

// #Medium #Array #Bit_Manipulation #2023_09_12_Time_2_ms_(100.00%)_Space_59.9_MB_(62.03%)

public class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for (int j : derived) {
            xor = xor ^ j;
        }
        return xor == 0;
    }
}
