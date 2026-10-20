package g3901_4000.s3950_exactly_one_consecutive_set_bits_pair;

// #Easy #Bit_Manipulation #Mid_Level #Biweekly_Contest_184
// #2026_10_20_Time_1_ms_(98.26%)_Space_42.21_MB_(89.58%)

public class Solution {
    public boolean consecutiveSetBits(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 3) == 3) {
                cnt++;
            }
            n = n >> 1;
        }
        return cnt == 1;
    }
}
