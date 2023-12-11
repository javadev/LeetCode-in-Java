package g2401_2500.s2429_minimize_xor;

// #Medium #Greedy #Bit_Manipulation #2022_12_07_Time_0_ms_(100.00%)_Space_39.6_MB_(87.47%)

public class Solution {
    public int minimizeXor(int num1, int num2) {
        int bits = Integer.bitCount(num2);
        int result = 0;
        for (int i = 30; i >= 0 && bits > 0; --i) {
            if ((1 << i & num1) != 0) {
                --bits;
                result = result ^ (1 << i);
            }
        }
        for (int i = 0; i <= 30 && bits > 0; ++i) {
            if ((1 << i & num1) == 0) {
                --bits;
                result = result ^ (1 << i);
            }
        }
        return result;
    }
}
