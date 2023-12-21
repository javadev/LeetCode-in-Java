package g0601_0700.s0693_binary_number_with_alternating_bits;

// #Easy #Bit_Manipulation #2022_03_22_Time_0_ms_(100.00%)_Space_41.3_MB_(21.55%)

public class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        while (n != 0) {
            int v = n & 1;
            n = n >> 1;
            if (prev == v) {
                return false;
            }
            prev = v;
        }
        return true;
    }
}
