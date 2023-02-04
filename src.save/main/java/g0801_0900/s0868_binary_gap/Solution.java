package g0801_0900.s0868_binary_gap;

// #Easy #Bit_Manipulation #2022_05_16_Time_1_ms_(82.94%)_Space_41.4_MB_(28.50%)

public class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int pos = 0;
        int lastPos = -1;
        while (n != 0) {
            pos++;
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    max = Math.max(max, pos - lastPos);
                }
                lastPos = pos;
            }
            n >>= 1;
        }
        return max;
    }
}
