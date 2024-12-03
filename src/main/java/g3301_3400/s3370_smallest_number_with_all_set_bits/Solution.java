package g3301_3400.s3370_smallest_number_with_all_set_bits;

// #Easy #Math #Bit_Manipulation #2024_12_03_Time_0_ms_(100.00%)_Space_41.1_MB_(45.50%)

public class Solution {
    public int smallestNumber(int n) {
        int res = 1;
        while (res < n) {
            res = res * 2 + 1;
        }
        return res;
    }
}
