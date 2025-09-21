package g3601_3700.s3688_bitwise_or_of_even_numbers_in_an_array;

// #Easy #Weekly_Contest_468 #2025_09_21_Time_0_ms_(100.00%)_Space_43.23_MB_(100.00%)

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
