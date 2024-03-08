package g2901_3000.s2980_check_if_bitwise_or_has_trailing_zeros;

// #Easy #Array #Bit_Manipulation #2024_01_18_Time_1_ms_(88.11%)_Space_44.2_MB_(64.58%)

public class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int hasTrailingZero = 0;
        for (int num : nums) {
            if ((num & 1) == 0) {
                hasTrailingZero++;
                if (hasTrailingZero > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
