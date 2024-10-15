package g3301_3400.s3315_construct_the_minimum_bitwise_array_ii;

// #Medium #Array #Bit_Manipulation #2024_10_15_Time_1_ms_(100.00%)_Space_44.8_MB_(77.74%)

import java.util.List;

public class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        final int n = nums.size();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            result[i] = -1;
            int p = 0;
            for (; p < 31; p++) {
                if (((num >> p) & 1) == 0) {
                    break;
                }
            }
            if (p > 0) {
                result[i] = ((num >> p) << p) | ((1 << (p - 1)) - 1);
            }
        }
        return result;
    }
}
