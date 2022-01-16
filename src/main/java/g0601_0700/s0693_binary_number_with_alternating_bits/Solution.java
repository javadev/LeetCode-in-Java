package g0601_0700.s0693_binary_number_with_alternating_bits;

// #Easy #Bit_Manipulation

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
