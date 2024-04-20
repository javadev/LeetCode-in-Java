package g2501_2600.s2595_number_of_even_and_odd_bits;

// #Easy #Bit_Manipulation #2023_08_23_Time_1_ms_(100.00%)_Space_41.3_MB_(82.54%)

public class Solution {
    public int[] evenOddBit(int n) {
        int[] res = new int[2];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 32; i++) {
            if (i % 2 == 0) {
                if ((n & 1) == 1) {
                    even++;
                }
            } else {
                if ((n & 1) == 1) {
                    odd++;
                }
            }
            n >>= 1;
        }
        res[0] = even;
        res[1] = odd;
        return res;
    }
}
