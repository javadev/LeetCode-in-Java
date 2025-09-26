package g3601_3700.s3688_bitwise_or_of_even_numbers_in_an_array;

// #Easy #Array #Bit_Manipulation #Simulation #Weekly_Contest_468
// #2025_09_26_Time_0_ms_(100.00%)_Space_42.64_MB_(87.38%)

public class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count |= num;
            }
        }
        return count;
    }
}
